import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Coşkun on 18.2.2017.
 */
public class HelloWorld {

    public static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        CoreMessageService coreMessageService = new CoreMessageService();

        String message = coreMessageService.getMessage();
        LOGGER.info(message);
    }

}
