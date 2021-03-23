import com.poc.singleton.threadSafety.TowerThreadSafety;

public class TowerThreadSafetyTest extends SingletonTest<TowerThreadSafety> {

    public TowerThreadSafetyTest() {
        super(TowerThreadSafety::getInstance);
    }
}
