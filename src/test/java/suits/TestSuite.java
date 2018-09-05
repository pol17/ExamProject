package suits;

import allTests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                ClosedCasinoTest.class,
                GermanLocalisationSwitcherTest.class,
                LoginWindowTest.class,
                SeeOtherCasinosButtonTest.class,
                YourLocationSwitcherTest.class
        }
)

public class TestSuite {
}
