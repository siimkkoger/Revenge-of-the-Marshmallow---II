import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ ArmorTest.class,
        HumanTest.class,
        WeaponTest.class,
        AttackTest.class })
public class AllTests {

}