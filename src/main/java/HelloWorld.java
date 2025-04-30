// https://logging.apache.org/log4j/2.x/manual/api.html

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {
    private static final Logger logger = LogManager.getLogger("HelloWorld");
    public static void main(String[] args) {
        String secret = "QnkgQmxhY2sgRHVjaw==";
        logger.info("Hello, World!");
    }
}
