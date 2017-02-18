import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoreMessageServiceTest {

    private CoreMessageService messageService;

    @Before
    public void setUp() {
        messageService = new CoreMessageService();
    }

    @Test
    public void getMessage_ShouldReturnMessage(){
        assertEquals("Merhaba Türkiye", messageService.getMessage());
    }
}
