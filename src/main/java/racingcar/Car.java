package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private String name;
    private int position = 0; //초기화

    // 생성자
    public Car(String name) {
        this.name = validateName(name);
    }

    private String validateName(String name) { //필드는 private 궈장
        // TODO: 1. null 체크
        if (name == null) throw new IllegalArgumentException("이름을 입력해주세요.");

        // TODO: 2. 이름이 비었는지 체크(공백만으로 이루어졌는지)
        String s = name.strip();
        if (s.isEmpty()) throw new IllegalArgumentException("이름은 공백만으로 이루어질 수 없습니다.");

        // TODO: 길이 > 5 체크
        if (s.length() > 5) throw new IllegalArgumentException("이름은 5글자 이하여야 합니다");


        return s;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
    //4 이상이면 전진
    void moveIf(int num) {
        if (num >= 4) {
            position++;
        }
    }

}