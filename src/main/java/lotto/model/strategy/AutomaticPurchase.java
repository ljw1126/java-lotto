package lotto.model.strategy;

import lotto.model.Lotto;
import lotto.model.LottoNumberFactory;

import java.util.ArrayList;
import java.util.List;

public class AutomaticPurchase extends LottoMachine {

    @Override
    protected List<Lotto> execute(int quantity, List<String> customLotto) {
        List<Lotto> result = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            result.add(LottoNumberFactory.selectRandomLotto());
        }

        return result;
    }
}
