package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Validation;

public class InputView {

    private final Validation validation;

    public InputView() {
        validation = new Validation();
    }

    public String inputCarsName() {
        String carsName = Console.readLine();
        try{
            validation.validateNameSize(carsName);
            return carsName;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputCarsName();
        }
    }

    public int inputNumberOfTrial() {
        String numberOfTrial = Console.readLine();
        try{
            validation.validateInteger(numberOfTrial);
            return Integer.parseInt(numberOfTrial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputNumberOfTrial();
        }
    }
}
