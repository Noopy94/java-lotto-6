package lotto.util;

import java.util.ArrayList;
import java.util.List;
import lotto.error.ErrorMessage;

public class Parser {

    public int parseLottoPurchaseNum(String input) {

        int purchaseNum = parseInt(input);

        divideBy1000(purchaseNum);

        purchaseNum /= 1000;

        return purchaseNum;
    }

    public List<Integer> parseLottoWinningNumbers(String input) {

        String[] StringWinningNumbers = input.split(",");
        validateSize(StringWinningNumbers);
        List<Integer> winningNumbers = parseInts(StringWinningNumbers);

        return winningNumbers;

    }


    public int parseLottoBonusNumber(String input, List<Integer> WinningNumbers) {

        int bonusNum = parseInt(input);
        checkNumberInRange(bonusNum);
        checkNumberDuplicated(bonusNum, WinningNumbers);

        return bonusNum;
    }


    public int parseInt(String input) {
        try {
            int inputNum = Integer.parseInt(input);
            return inputNum;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_INPUT_IS_NOT_NUMBER.getMessage());
        }
    }

    public List<Integer> parseInts(String[] numbers) {

        List<Integer> WinningNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            try {
                int num = Integer.parseInt(numbers[i]);
                checkNumberDuplicated(num, WinningNumbers);
                WinningNumbers.add(num);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(ErrorMessage.ERROR_INPUT_IS_NOT_NUMBER.getMessage());
            }
        }

        return WinningNumbers;
    }

    public void divideBy1000(int num) {
        if (num % 1000 != 0) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_PURCHASE_NOT_DIVISIBLE_BY_1000.getMessage());
        }
    }

    public void validateSize(String[] numbers) {
        if (numbers.length != 6) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_WINNING_NUMBER_IS_NOT_SIX_NUMBERS.getMessage());
        }
    }


    public void checkNumberDuplicated(int num, List<Integer> WinningNumbers) {

        for (int i = 0; i < WinningNumbers.size(); i++) {
            if (num == WinningNumbers.get(i)) {
                throw new IllegalArgumentException(ErrorMessage.ERROR_BONUS_NUMBER_IS_NOT_DUPLICATION.getMessage());
            }
        }
    }

    public void checkNumberInRange(int num) {
        if (1 > num || num > 45) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_BONUS_NUMBER_NOT_IN_RANGE.getMessage());
        }
    }


}
