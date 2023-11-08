package lotto.service;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import lotto.domain.Lotto;
import lotto.domain.LottoGame;
import lotto.error.ErrorMessage;
import lotto.util.Parser;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoService {

    private static final int MIN_LOTTO_NUM = 1;
    private static final int MAX_LOTTO_NUM = 45;
    private static final int LOTTO_NUM = 6;
    private static final int FIRST_PRIZE = 2_000_000_000;
    private static final int SECOND_PRIZE = 30_000_000;
    private static final int THIRD_PRIZE = 1_500_000;
    private static final int FOURTH_PRIZE = 50_000;
    private static final int FIFTH_PRIZE = 5_000;
    public static int purchaseNum = 0;

    private final LottoGame lottoGame = new LottoGame();
    private final Parser parser = new Parser();

    public LottoService() {
    }

    /* 입력 */

    public void inputLottoPurchase() {
        while (true) {
            try {
                InputView.inputLottoPurchaseMessage();
                int purchaseNum = parser.parseLottoPurchaseNum(Console.readLine());
                lottoGame.setPurchasePrice(purchaseNum * 1000l);
                lottoGame.setLotteryPurchaseNumber(purchaseNum);
                setPurchaseNum(purchaseNum);
                break;
            } catch (IllegalArgumentException e) {

            }
        }
        System.out.println();
    }

    public void inputLottoWinningNumbers() {
        while (true) {
            try {
                InputView.inputLottoWinningNumbersMessage();
                List<Integer> winningNumbers = parser.parseLottoWinningNumbers(Console.readLine());
                lottoGame.setLottoWinningNumbers(winningNumbers);
                break;
            } catch (IllegalArgumentException e) {
            }
        }
        System.out.println();
    }

    public void inputLottoBonusNumber() {
        while (true) {
            try {
                InputView.inputLottoBonusNumberMessage();
                int bonusNum = parser.parseLottoBonusNumber(Console.readLine(), lottoGame.getLottoWinningNumbers());
                lottoGame.setLottoBonusNumber(bonusNum);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(ErrorMessage.ERROR_INPUT_IS_NOT_NUMBER);
            }
        }
        System.out.println();
    }
    /* 게임 진행 */

    public Lotto generateLotto() {

        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(MIN_LOTTO_NUM, MAX_LOTTO_NUM, LOTTO_NUM);
        Lotto lotto = new Lotto(numbers);
        lotto.sortNumbers();
        return lotto;
    }

    public void saveLotto(Lotto lotto) {
        lottoGame.saveLotto(lotto);
    }

    public void countLotto() {
        int cnt = 0;
        int bonusCnt = 0;

        for (Lotto lotto : lottoGame.getLottos()) {

            List<Integer> lottoNumbers = lotto.getNumbers();
            List<Integer> winningNumbers = lottoGame.getLottoWinningNumbers();
            int bonusNumber = lottoGame.getLottoBonusNumber();

            for (int number : lottoNumbers) {
                if (number == bonusNumber) {
                    bonusCnt++;
                }

                if (winningNumbers.contains(number)) {
                    cnt++;
                }
            }

            lottoResult(cnt, bonusCnt);
        }

    }

    private void lottoResult(int cnt, int bonusCnt) {

        if (cnt == 3) {
            lottoGame.incrementTotalPrice(FIFTH_PRIZE);
            lottoGame.incrementFifthPlaceCnt();
            return;
        }

        if (cnt == 4) {
            lottoGame.incrementTotalPrice(FOURTH_PRIZE);
            lottoGame.incrementFourthPlaceCnt();
            return;
        }

        if (cnt == 5 && bonusCnt < 0) {
            lottoGame.incrementTotalPrice(THIRD_PRIZE);
            lottoGame.incrementThirdPlaceCnt();
            return;
        }

        if (cnt == 5 && bonusCnt == 1) {
            lottoGame.incrementTotalPrice(SECOND_PRIZE);
            lottoGame.incrementSecondPlaceCnt();
            return;
        }

        if (cnt == 6) {
            lottoGame.incrementTotalPrice(FIRST_PRIZE);
            lottoGame.incrementFirstPlaceCnt();
        }

    }


    /* 출력 */
    public void outputPurchased() {
        OutputView.printLottoPurchaseFinishedMessage(lottoGame.getLotteryPurchaseNumber());
        for (Lotto lotto : lottoGame.getLottos()) {
            OutputView.printPurchasedLottoNumbers(lotto.getNumbers());
        }
        System.out.println();
    }

    public void outputStatics() {
        OutputView.printStaticsMessage();
        OutputView.printFifthPlaceResultMessage(lottoGame.getFifthPlaceCnt());
        OutputView.printFourthPlaceResultMessage(lottoGame.getFourthPlaceCnt());
        OutputView.printThirdPlaceResultMessage(lottoGame.getThirdPlaceCnt());
        OutputView.printSecondPlaceResultMessage(lottoGame.getSecondPlaceCnt());
        OutputView.printFirstPlaceResultMessage(lottoGame.getFirstPlaceCnt());
    }

    public void outputRateOfReturn() {
        OutputView.printRateOfReturnMessage((double) lottoGame.getTotalPrice() / lottoGame.getPurchasePrice());

    }

    public int getPurchaseNum() {
        return purchaseNum;
    }

    public static void setPurchaseNum(int purchaseNum) {
        LottoService.purchaseNum = purchaseNum;
    }


}
