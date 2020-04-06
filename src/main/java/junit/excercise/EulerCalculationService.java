package junit.excercise;

public class EulerCalculationService {

    public int calculate(int limit) {
        int sum = 0;

        for (int number = 1; number < limit; number++) {
            if (number % 3 == 0 || number % 5 == 0) {
                sum += number;
            }
        }

        return sum;
    }
}
