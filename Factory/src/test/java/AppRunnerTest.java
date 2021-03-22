import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AppRunnerTest {

    @Test
    void executeWithoutExceptions() {
        assertDoesNotThrow(() -> AppRunner.main(new String[]{}));
    }

}