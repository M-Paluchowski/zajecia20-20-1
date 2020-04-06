package junit;

public class Calculator {

//    public Double addWithSpecialValue(double first, double second) {
//        return addOperation(first, second);
//    }

    public Double add(double first, double second) {
        System.out.println(String.format("Add: %f + %f", first, second));
        return addOperation(first, second);
    }

    public int divide(int first, int second) {
        return first / second;
    }

    private Double addOperation(double first, double second) {
//        double result = first + second;
//        return result == 0.0 ? null : result;
        return first + second;
    }
}
