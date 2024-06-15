package lotto.model.strategy;

import lotto.model.Lotto;
import lotto.model.LottoNumberFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ManualPurchase extends LottoMachine {

    @Override
    protected List<Lotto> execute(int quantity, List<String> customLotto) {
        if (quantity <= 0) {
            return Collections.emptyList();
        }

        return customLotto.stream()
                .map(this::toIntegers)
                .map(LottoNumberFactory::of)
                .collect(toList());
    }

    private Integer[] toIntegers(String lotto) {
        return Arrays.stream(lotto.split(","))
                .map(text -> Integer.valueOf(text.trim()))
                .toArray(Integer[]::new);
    }
}
