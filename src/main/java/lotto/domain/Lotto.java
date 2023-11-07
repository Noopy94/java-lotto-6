package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class LottoNumber {

    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

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
