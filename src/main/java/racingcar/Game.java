package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Game { //게임 진행 클래스
    // 랜덤 넘버 생성
    public int pickRandomNumber(){
        return Randoms.pickNumberInRange(0,9);
    }

    //라운드 진행
    public void runRound(Car[] cars){
        //모든 차에 대해 랜덤 수를 뽑고, 전진 여부를 판단하기
        for (Car car : cars) {
            int n = pickRandomNumber();
            car.moveIf(n);
        }
    }

    //라운드 결과 출력(라운드마다 실행!)
    public void printRound(Car[] cars){
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + car.printPosition());
        }
    }
//    public void checkFinalPosition(Car[] cars){
//        for (Car car : cars) {
//
//        }
//    }
//    public void printWinner(Car[] cars){
//        for (Car car : cars) {
//            System.out.println(max()
//        }
//    }


}
