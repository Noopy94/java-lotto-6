package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class Lotto {

    private List<Integer> lottoWinningNumbers;
    private int lottoBonusNumber;
    private int lottoPurchaseNumber;
    private int firstPlaceCnt = 0;
    private int secondPlaceCnt = 0;
    private int thirdPlaceCnt = 0;
    private int fourthPlaceCnt = 0;
    private int fifthPlaceCnt = 0;

    public Lotto() {
    }

    public List<Integer> getLottoWinningNumbers() {
        return lottoWinningNumbers;
    }

    public int getLottoBonusNumber() {
        return lottoBonusNumber;
    }

    public int getLotteryPurchaseNumber() {
        return lottoPurchaseNumber;
    }

    public void setLottoWinningNumbers(List<Integer> lottoWinningNumbers) {
        this.lottoWinningNumbers = lottoWinningNumbers;
    }

    public void setLottoBonusNumber(int lottoBonusNumber) {
        this.lottoBonusNumber = lottoBonusNumber;
    }

    public void setLotteryPurchaseNumber(int lotteryPurchaseNumber) {
        this.lottoPurchaseNumber = lotteryPurchaseNumber;
    }

    public void incrementFirstPlaceCnt() {
        firstPlaceCnt++;
    }

    public void incrementSecondPlaceCnt() {
        secondPlaceCnt++;
    }

    public void incrementThirdPlaceCnt() {
        thirdPlaceCnt++;
    }

    public void incrementFourthPlaceCnt() {
        fourthPlaceCnt++;
    }

    public void incrementFifthPlaceCnt() {
        fifthPlaceCnt++;
    }
}
