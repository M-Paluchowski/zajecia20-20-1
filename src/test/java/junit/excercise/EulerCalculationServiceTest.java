package junit.excercise;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EulerCalculationServiceTest {

    private EulerCalculationService systemUnderTest = new EulerCalculationService();

    @Test
    void shouldCalculateCorrectValueForTen() {
        //given
        int limit = 10;

        //when
        int result = systemUnderTest.calculate(limit);

        //then
        assertThat(result, is(equalTo(23)));
    }


    @Test
    void shouldCalculateCorrectValueForEleven() {
        //given
        int limit = 11;

        //when
        int result = systemUnderTest.calculate(limit);

        //then
        assertThat(result, is(equalTo(33)));
    }
}