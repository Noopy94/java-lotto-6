package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class LottoGame {

    private List<Integer> lottoWinningNumbers;
    private int lottoBonusNumber;
    private int lottoPurchaseNumber;
    private int firstPlaceCnt = 0;
    private int secondPlaceCnt = 0;
    private int thirdPlaceCnt = 0;
    private int fourthPlaceCnt = 0;
    private int fifthPlaceCnt = 0;
    private Long totalPrice = 0l;
    private Long purchasePrice = 0l;
    private List<Lotto> lottos = new ArrayList<>();

    public LottoGame() {
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

    public List<Lotto> getLottos() {
        return lottos;
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

    public void setPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
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

    public void incrementTotalPrice(int price) {
        totalPrice += price;
    }

    public void saveLotto(Lotto lotto) {
        lottos.add(lotto);
    }

    public int getFirstPlaceCnt() {
        return firstPlaceCnt;
    }

    public int getSecondPlaceCnt() {
        return secondPlaceCnt;
    }

    public int getThirdPlaceCnt() {
        return thirdPlaceCnt;
    }

    public int getFourthPlaceCnt() {
        return fourthPlaceCnt;
    }

    public int getFifthPlaceCnt() {
        return fifthPlaceCnt;
    }

    public int getLottoPurchaseNumber() {
        return lottoPurchaseNumber;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public Long getPurchasePrice() {
        return purchasePrice;
    }
}
