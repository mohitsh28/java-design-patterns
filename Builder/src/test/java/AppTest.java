import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AppTest {
    @Test
    void executeWithoutExceptions() {
        assertDoesNotThrow(() -> AppRunner.main(new String[]{}));
    }
}
