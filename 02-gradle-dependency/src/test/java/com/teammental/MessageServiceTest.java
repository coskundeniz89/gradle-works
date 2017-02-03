package com.teammental;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

/**
 * Created by Coşkun on 3.2.2017.
 */
public class MessageServiceTest {

    private MessageService messageService;

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageServiceTest.class);

    @Before
    public void setUp() {
        messageService = new MessageService();
    }

    @Test
    public void getMessage_ShouldReturnMessage(){
        LOGGER.debug("Test start");
        assertEquals("Merhaba Türkiye", messageService.getMessage());
    }

}
