package racingcar.domain;

public class Validation {

    private static final String CAR_NAME_SIZE_ERROR_MESSAGE = "[ERROR] 자동차 이름은 0자 초과 5자 이하로 입력해주세요.";
    private static final String IS_NOT_INTEGER_ERROR_MESSAGE = "[ERROR] 문자가 아닌 숫자를 입력해주세요.";

    public void validateNameSize(String carsName) {
        String[] cars = carsName.split(",");
        for (String car: cars) {
            if (car.length() == 0 || car.length() > 5) {
                throw new IllegalArgumentException(CAR_NAME_SIZE_ERROR_MESSAGE);
            }
        }
    }

    public void validateInteger(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(IS_NOT_INTEGER_ERROR_MESSAGE);
        }
    }
}
