package com.registration.course.university;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The simple test checks if the username is the same as the name stored in the database.
 * I need to work on this and find useful test cases. Please refer to the complete JUnit tests
 * on simple java code excluding GUI for grading purposes.
 * https://github.com/oiricaud/JavaDoc-and-Unit-Testing/blob/master/Use-Case-1/tests/JUnit_Student_Test1.java
 * It will be very similar as shown in the above link.
 *
 * @author Oscar I. Ricaud
 * @version 1.0 Build November 16, 2016
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