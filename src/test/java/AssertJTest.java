import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJTest {

    @Test
    void testAssertJ() {
        assertThat(2 + 2)
                .isEqualTo(4);

        assertThat(1 + 3)
                .isEqualTo(4)
                .isNotEqualTo(5)
                .isNotEqualTo(3);
    }

}
