import com.poc.factory.CarFactory;
import com.poc.factory.type.CarType;

/**
 * Factory: Object for creating other objects.
 * Static Methods used for creating and returning objects.
 * Focus on code and implementation rather than object management / initialization.
 */

public class AppRunner {

    public static void main(String[] args) {
        var car1 = CarFactory.getCar(CarType.FORD);
        var car2 = CarFactory.getCar(CarType.HYUNDAI);

        System.out.println(car1.getSpecs());
        System.out.println(car2.getSpecs());
    }
}
