package com.registration.course.university;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by oscarricaud on 11/17/16.
 */
public class RegisterActivityTest {

    @Test
    public void testOnCreate() throws Exception {
        final String name = "oscar";
        final String username = "oiricaud";
        final int age = 22;
        final String password = "apple48";
        final boolean doYouHaveAccount = false;

        assertEquals("oscar", name);
        assertFalse(doYouHaveAccount);
    }

}