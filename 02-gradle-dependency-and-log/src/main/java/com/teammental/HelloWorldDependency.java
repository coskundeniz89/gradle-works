package com.teammental;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Coşkun on 31.1.2017.
 */
public class HelloWorldDependency {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldDependency.class);

    public static void main(String[] args) {
        LOGGER.info("Main start");

        MessageService messageService = new MessageService();
        String message = messageService.getMessage();
        System.out.println(message);
    }

}
