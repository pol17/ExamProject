package suits;

import allTests.ClosedCasinoTest;
import allTests.GermanLocalisationSwitcherTest;
import allTests.LoginWindowTest;
import allTests.SeeOtherCasinosButtonTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                ClosedCasinoTest.class,
                GermanLocalisationSwitcherTest.class,
                LoginWindowTest.class,
                SeeOtherCasinosButtonTest.class
        }
)

public class TestSuite {
}
