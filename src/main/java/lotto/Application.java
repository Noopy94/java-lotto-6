package lotto;


import camp.nextstep.edu.missionutils.Randoms;
import lotto.controller.LottoController;

public class Application {
    public static void main(String[] args) {

        LottoController lottoController = new LottoController();
        lottoController.play();
    }
}
