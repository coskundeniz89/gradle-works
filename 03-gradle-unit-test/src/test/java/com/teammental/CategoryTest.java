package com.teammental;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

@Category(UnitTest.class)
public class CategoryTest {

    @Test
    public void categoryTest() {
        assertEquals(1,1);
        System.out.println("The category: UnitTest");
    }

}
