/*
Singleton Patterns ensure that the class can have only one existing instance per Java classLoader
instance and provides global access to it.
 */

import com.poc.singleton.Tower;
import com.poc.singleton.doubleCheck.ThreadSafetyDoubleCheckLock;
import com.poc.singleton.enums.EnumTower;
import com.poc.singleton.threadSafety.TowerThreadSafety;

public class AppRunner {

    public static void main(String[] args) {
        var tower1 = Tower.getInstance();
        var tower2 = Tower.getInstance();
        System.out.println("Tower1= " + tower1);
        System.out.println("Tower2= " + tower2);

        var threadSafeTower1 = TowerThreadSafety.getInstance();
        var threadSafeTower2 = TowerThreadSafety.getInstance();
        System.out.println("threadSafeTower1= " + threadSafeTower1);
        System.out.println("threadSafeTower2= " + threadSafeTower2);

        var threadSafetyDoubleCheckLock1 = ThreadSafetyDoubleCheckLock.getInstance();
        var threadSafetyDoubleCheckLock2 = ThreadSafetyDoubleCheckLock.getInstance();
        System.out.println("threadSafetyDoubleCheckLock1= " + threadSafetyDoubleCheckLock1);
        System.out.println("threadSafetyDoubleCheckLock2= " + threadSafetyDoubleCheckLock2);

        var enumTowe1 = EnumTower.INSTANCE;
        var enumTower2 = EnumTower.INSTANCE;
        System.out.println("enumTowe1= " + enumTowe1);
        System.out.println("enumTower2= " + enumTower2);

    }

}
