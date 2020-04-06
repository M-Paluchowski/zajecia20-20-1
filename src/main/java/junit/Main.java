package junit;

import java.util.stream.Stream;

public class Main {
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        Double result = calculator.add(-1.0, 1.0);
//        System.out.println(result == 0.0);
////        System.out.println(result.intValue());
//
////        Double aDouble = calculator.addWithSpecialValue(-1.0, 1.0);
////        System.out.println(aDouble);
//    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Double result = calculator.add(-1.0, 0.0);
        System.out.println(result == -1.0);
//        System.out.println(result.intValue());

//        Double aDouble = calculator.addWithSpecialValue(-1.0, 1.0);
//        System.out.println(aDouble);
    }
}
