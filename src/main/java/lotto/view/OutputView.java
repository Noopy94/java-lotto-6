package lotto.view;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    public static final String LOTTO_PURCHASE_FINISHED_MESSAGE = "개를 구매했습니다.";
    public static final String LOTTO_STATISTICS_MESSAGE = "당첨 통계\n---";
    public static final String LOTTO_FIFTH_PLACE_MESSAGE = "3개 일치 (5,000원) - %d개";
    public static final String LOTTO_FOURTH_PLACE_MESSAGE = "4개 일치 (50,000원) - %d개";
    public static final String LOTTO_THIRD_PLACE_MESSAGE = "5개 일치 (1,500,000원) - %d개";
    public static final String LOTTO_SECOND_PLACE_MESSAGE = "5개 일치, 보너스 볼 일치 (30,000,000원) - %d개";
    public static final String LOTTO_FIRST_PLACE_MESSAGE = "6개 일치 (2,000,000,000원) - %d개";

    public static final String LOTTO_RATE_OF_RETURN = "총 수익률은 %.1f%%입니다.";

    public static void printLottoPurchaseFinishedMessage(int num) {
        System.out.println(num + LOTTO_PURCHASE_FINISHED_MESSAGE);
    }

    public static void printPurchasedLottoNumbers(List<Integer> lottoNumbers) {

        String joinedNumbers = lottoNumbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println("[" + joinedNumbers + "]");
    }

    public static void printStaticsMessage() {
        System.out.println(LOTTO_STATISTICS_MESSAGE);
    }

    public static void printFifthPlaceResultMessage(int num) {

        System.out.println(String.format(LOTTO_FIFTH_PLACE_MESSAGE, num));

    }

    public static void printFourthPlaceResultMessage(int num) {
        System.out.println(String.format(LOTTO_FOURTH_PLACE_MESSAGE, num));
    }

    public static void printThirdPlaceResultMessage(int num) {
        System.out.println(String.format(LOTTO_THIRD_PLACE_MESSAGE, num));
    }

    public static void printSecondPlaceResultMessage(int num) {
        System.out.println(String.format(LOTTO_SECOND_PLACE_MESSAGE, num));
    }

    public static void printFirstPlaceResultMessage(int num) {
        System.out.println(String.format(LOTTO_FIRST_PLACE_MESSAGE, num));
    }

    public static void printRateOfReturnMessage(double num) {
        System.out.println(String.format(LOTTO_RATE_OF_RETURN, num));
    }

}
