import com.poc.factory.CarFactory;
import com.poc.factory.model.Hyundai;
import com.poc.factory.type.CarType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarFactoryTest {

    @Test
    void returnHyundai() {
        var hyundai = CarFactory.getCar(CarType.HYUNDAI);
        assertTrue(hyundai instanceof Hyundai);
    }
}
