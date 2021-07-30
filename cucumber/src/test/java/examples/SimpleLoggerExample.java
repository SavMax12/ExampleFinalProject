package examples;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleLoggerExample {

    private static final Logger logger = LogManager.getLogger(SimpleLoggerExample.class);

    public static void main(String args[]){
        logger.info("info logs");
        logger.debug("debug logs");
        logger.warn("warn logs");
        logger.error("error logs");
    }
}
