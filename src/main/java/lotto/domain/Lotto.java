package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class Lotto {

    private List<Integer> lottoWinningNumbers;
    private int lottoBonusNumber;
    private int lotteryPurchaseNumber;

    public Lotto() {
    }

    public List<Integer> getLottoWinningNumbers() {
        return lottoWinningNumbers;
    }

    public int getLottoBonusNumber() {
        return lottoBonusNumber;
    }

    public int getLotteryPurchaseNumber() {
        return lotteryPurchaseNumber;
    }

    public void setLottoWinningNumbers(List<Integer> lottoWinningNumbers) {
        this.lottoWinningNumbers = lottoWinningNumbers;
    }

    public void setLottoBonusNumber(int lottoBonusNumber) {
        this.lottoBonusNumber = lottoBonusNumber;
    }

    public void setLotteryPurchaseNumber(int lotteryPurchaseNumber) {
        this.lotteryPurchaseNumber = lotteryPurchaseNumber;
    }
}
