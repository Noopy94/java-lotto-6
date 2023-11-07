package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class LottoNumber {

    private List<Integer> lottoNumbers;

    public LottoNumber() {
    }

    public List<Integer> getLottoNumbers() {
        return lottoNumbers;
    }

    public void setLottoNumbers(List<Integer> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public void setRandomLottoNumbers() {
        this.lottoNumbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }

}
