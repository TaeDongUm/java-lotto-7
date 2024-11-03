package lotto.factory;

import java.util.ArrayList;
import java.util.List;
import lotto.constants.NumberConstants;
import lotto.vo.WinningConditions;

public class WinningConditionFactory {

    public static List<WinningConditions> initializeConditions() {
        List<WinningConditions> winningConditions = new ArrayList<>();
        for (NumberConstants numberConstants : NumberConstants.values()) {

            winningConditions.add(
                    new WinningConditions(numberConstants.getNumbersConditions(), numberConstants.getBonusConditions(),
                            numberConstants.getPrizeConditions()));
        }

        return winningConditions;
    }
}