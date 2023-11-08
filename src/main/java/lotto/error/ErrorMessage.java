package lotto.error;

public enum ErrorMessage {

    ERROR_PURCHASE_IS_NOT_NUMBER("[ERROR] 로또 구입 금액은 숫자만 입력 가능합니다."),
    ERROR_PURCHASE_IS_NOT_ZERO("[ERROR] 로또 구입 금액은 0이 입력  불가능합니다."),
    ERROR_PURCHASE_NOT_DIVISIBLE_BY_1000("[ERROR] 로또 구입 금액은 1000으로 나누어지는 숫자만 입력 가능합니다."),
    ERROR_WINNING_NUMBER_IS_NOT_SIX_NUMBERS("[ERROR] 로또 당첨 숫자는 6개만 입력 가능합니다."),
    ERROR_WINNING_NUMBER_IS_NOT_DUPLICATION("[ERROR] 로또 당첨 숫자는 중복되지 않은 수만 입력 가능합니다."),
    ERROR_WINNING_NUMBER_NOT_IN_RANGE("[ERROR] 로또 당첨 숫자는 1~45사이의 숫자만 입력 가능합니다."),
    ERROR_INPUT_IS_NOT_NUMBER("[ERROR] 입력값은 숫자만 입력 가능합니다."),
    ERROR_BONUS_NUMBER_IS_NOT_DUPLICATION("[ERROR] 보너스 번호는 당첨 번호와 중복될 수 없습니다."),
    ERROR_BONUS_NUMBER_NOT_IN_RANGE("[ERROR] 보너스 번호는 1~45사이의 숫자만 입력 가능합니다.");


    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}