package racingcar;

import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


class CarTest {
    @Test
    void 자동차의_이름은_5글자_넘으면_예외발생() {
        // 이름이 6자 이상인 자동차를 만들면 예외 발생
        assertThatThrownBy(() -> new Car("abcdef"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 이름이_비었으면_예외발생() {
        assertThatThrownBy(() -> new Car("   "))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 이름이_null이면_예외발생() {
        assertThatThrownBy(() -> new Car(null))
                .isInstanceOf(IllegalArgumentException.class);
    }

    //2번
//    @Test
//    void 게임횟수는_1미만이면_예외발생() {
//        assertThatThrownBy(() -> new Car("1"))
//                .isInstanceOf(IllegalArgumentException.class);
//    }

//    @Test
//    void 자동차는_숫자가_4이상일때_전진() { //테스트는 경계값을 기준으로 설정
//        Car car = new Car("test1");
//        car.moveIf(4);
//        assertThat(???).isEqualTo(???);
//    }

    @Test
    void 자동차는_숫자가_3이하면_정지() {
        Car car = new Car("test1");

        car.moveIf(3); // 3 이하 → 멈춤

        // 자동차의 위치가 0인지 검증
        // assertThat(???).isEqualTo(???);
    }
}
