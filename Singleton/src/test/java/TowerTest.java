import com.poc.singleton.Tower;

public class TowerTest extends SingletonTest<Tower> {

    public TowerTest() {
        super(Tower::getInstance);
    }

}
