package lotto.controller;


import lotto.domain.Lotto;
import lotto.service.LottoService;

public class LottoController {

    private final LottoService lottoService = new LottoService();

    public LottoController() {
    }

    public void play() {
        lottoService.inputLottoPurchase();
        onGoingGame();
        lottoService.outputPurchased();
        lottoService.inputLottoWinningNumbers();
        lottoService.inputLottoBonusNumber();
        lottoService.countLotto();
        outputLottoInfo();
    }


    private void onGoingGame() {
        for (int i = 0; i < lottoService.getPurchaseNum(); i++) {
            Lotto lotto = lottoService.generateLotto();
            lottoService.saveLotto(lotto);
        }
    }

    private void outputLottoInfo() {
        lottoService.outputStatics();
        lottoService.outputRateOfReturn();
    }


}
