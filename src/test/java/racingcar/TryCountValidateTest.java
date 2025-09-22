package racingcar;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import org.junit.jupiter.api.Test;

public class TryCountValidateTest {

    @Test
    void 숫자가_0이하면_예외처리(){
        assertThatThrownBy(() -> Application.validateTryCount("0"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 숫자가_10초과면_예외처리(){
        assertThatThrownBy(() -> Application.validateTryCount("11"))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
