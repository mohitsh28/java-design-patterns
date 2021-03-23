import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AppRunnerTest {

    @Test
    void shouldExecuteWithoutException() {
        assertDoesNotThrow(() -> AppRunner.main(new String[]{}));
    }
}