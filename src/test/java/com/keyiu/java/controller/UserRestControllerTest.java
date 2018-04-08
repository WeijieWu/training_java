package com.keyiu.java.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserRestControllerTest {
    @Test
    public void testUserRestController() {
        assertEquals("all users", new UserRestController().findAllUsers());
    }
}
