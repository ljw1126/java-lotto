package lotto.view;

import lotto.dto.LottoNumberResponse;
import lotto.model.Prize;
import lotto.model.Rank;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ResultView {
    private static final Logger LOGGER = Logger.getLogger(ResultView.class.getName());
    private static final String NEW_LINE = System.lineSeparator();

    private static final String QUANTITY_RESULT_FORMAT = "수동으로 %d장, 자동으로 %d개를 구매했습니다.";
    private static final String DELIMITER = ", ";
    private static final String PREFIX = "[";
    private static final String SUFFIX = "]";

    private static final String RESULT_FORMAT = "%s개 일치 (%s원) - %s개";
    private static final String BONUS_RESULT_FORMAT = "%s개 일치, 보너스 볼 일치(%s원) - %s개";
    private static final String RATE_OF_RETURN_FORMAT = "총 수익률은 %.2f 입니다.";

    public void printOrderResponse(List<LottoNumberResponse> responses, int manualQuantity, int automaticQuantity) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format(QUANTITY_RESULT_FORMAT, manualQuantity, automaticQuantity)).append(NEW_LINE);
        for (LottoNumberResponse response : responses) {
            sb.append(toJoinNumbers(response.getNumbers())).append(NEW_LINE);
        }

        if (LOGGER.isLoggable(Level.INFO)) {
            LOGGER.info(sb.toString());
        }
    }

    private String toJoinNumbers(List<String> lottoNumbers) {
        return lottoNumbers.stream()
                .collect(Collectors.joining(DELIMITER, PREFIX, SUFFIX));
    }

    public void printResult(Prize prize, double rateOfReturn) {
        StringBuilder sb = new StringBuilder();

        appendPrefix(sb);
        appendResult(sb, prize);
        appendRateOfReturn(sb, rateOfReturn);

        if (LOGGER.isLoggable(Level.INFO)) {
            LOGGER.info(sb.toString());
        }
    }

    private void appendPrefix(StringBuilder sb) {
        sb.append("당첨 통계").append(NEW_LINE);
        sb.append("---------").append(NEW_LINE);
    }

    private void appendResult(StringBuilder sb, Prize prize) {
        for (Rank rank : Rank.ranks()) {
            int ballCount = rank.getBallCount();
            int reward = rank.getReward();
            int matchedCount = prize.rankCount(rank);

            String format = rank.isTwo() ? BONUS_RESULT_FORMAT : RESULT_FORMAT;
            String text = String.format(format, ballCount, reward, matchedCount);
            sb.append(text).append(NEW_LINE);
        }
    }

    private void appendRateOfReturn(StringBuilder sb, double rateOfReturn) {
        sb.append(String.format(RATE_OF_RETURN_FORMAT, rateOfReturn));
    }
}
