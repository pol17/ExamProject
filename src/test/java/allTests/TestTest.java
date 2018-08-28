package allTests;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TestTest {
    Logger logger = Logger.getLogger(getClass());

    @Test
    public void test () {
        logger.info("test");
    }
}
