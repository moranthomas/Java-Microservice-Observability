import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;


//@Slf4j
@Log4j2
public class TestLoggingFrameworks {

    //private static final org.apache.commons.logging.Log commonsLoggingLog = org.apache.commons.logging.LogFactory.getLog(TestLoggingFrameworks.class);
    //private static final org.slf4j.Logger slf4jLog = org.slf4j.LoggerFactory.getLogger(TestLoggingFrameworks.class);
    private static final java.util.logging.Logger javaUtilLog = java.util.logging.Logger.getLogger(TestLoggingFrameworks.class.getName());

    @Test
    public void logUsingMultipleFrameworks() {

        // commonsLoggingLog.info("Example log from commonsLoggingLog ");
        // slf4jLog.info("Example log from slf4jLog ");
        javaUtilLog.info("Example log from javaUtilLog ");

        log.info("Example Log4j2 log from {}", TestLoggingFrameworks.class.getSimpleName());

    }
}
