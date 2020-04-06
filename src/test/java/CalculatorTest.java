import junit.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Calculator test")
public class CalculatorTest {

    private Calculator systemUnderTest;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After All");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before Each");
        systemUnderTest = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each");
    }

//    @Test
//    void whenDividingTenByTwo_shouldReturnFive() {
//
//    }

    @Nested
    @DisplayName("divide test")
    class DivideTest {

        @Test
        @DisplayName("should return correct value when dividing ten by two")
        void shouldReturnFiveWhenDividingTenByTwo() {
            //given
//            Calculator systemUnderTest = new Calculator();
            int dividend = 10;
            int divisor = 2;

            //when
            int result = systemUnderTest.divide(dividend, divisor);

            //then
            int expectedResult = 5;
            assertEquals(expectedResult, result);

            assertThat(result, is(expectedResult));
            assertThat(result, is(equalTo(expectedResult)));
        }

        @Test
        void shouldThrowArithmeticExceptionWhenDividingByZero() {
            //given
//            Calculator systemUnderTest = new Calculator();
            int dividend = 10;
            int divisor = 0;

            //when
            Executable methodCall = () -> systemUnderTest.divide(dividend, divisor);
//        Executable methodCall = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                systemUnderTest.divide(dividend, divisor);
//            }
//        };

            //then
            assertThrows(ArithmeticException.class, methodCall);
        }
    }

    @Nested
    @DisplayName("add test")
    class AddTest {

        @Test
        void shouldReturnFourWhenTwoPlusTwo() {
            //given
            double operandOne = 2.0;
            double operandTwo = 2.0;

            //when
            Double result = systemUnderTest.add(operandOne, operandTwo);

            //then
            double expectedResult = 4.0;
            assertEquals(expectedResult, result);
        }
    }

    @Nested
    @DisplayName("Hamcrest matchers")
    class HamcrestMatchers {

        @Test
        void testHamcrest() {
            assertThat(1, is(not(equalTo(2))));
            assertNotEquals(1, 2);

            assertThat(List.of(1, 2, 3), hasItem(2));
            assertTrue(List.of(1, 2, 3).contains(2));
        }
    }
}
