package lotto.view;

public class InputView {

    public static final String LOTTO_PURCHASE_MESSAGE = "구입금액을 입력해 주세요.";
    public static final String LOTTO_NUMBERS_MESSAGE = "당첨 번호를 입력해 주세요.";
    public static final String LOTTO_BONUS_NUMBER_MESSAGE = "보너스 번호를 입력해 주세요.";

    public static void inputLottoPurchaseMessage() {
        System.out.println(LOTTO_PURCHASE_MESSAGE);
    }

    public static void inputLottoNumbersMessage() {
        System.out.println(LOTTO_NUMBERS_MESSAGE);
    }

    public static void inputLottoBonusNumberMessage() {
        System.out.println(LOTTO_BONUS_NUMBER_MESSAGE);
    }
}
