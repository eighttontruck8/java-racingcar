package racingcar;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        //1. 이름 입력 받기
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분합니다.)");
        String participations = Console.readLine();

        System.out.println("시도할 회수는 몇 회입니까?");
        String tryCounts = Console.readLine(); //readLine은 String으로 받아야 함. (int 불가x)

        //1-1. 이름 나누기
        String[] carNames = participations.split(","); //String을 콤마를 기준으로 나누어 리스트로 변환

        //객체 배열 생성
        Car[] cars = new Car[carNames.length];

        for (int i = 0; i < carNames.length; i++) {
            cars[i] = new Car(carNames[i]);
        }

        //체킹
        for (Car car : cars) {
            System.out.println("참가자 : " + car.getName());
        }
    }
}
