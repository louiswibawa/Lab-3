package com.example.joe.sum;

import android.app.Application;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    /**
     * Created by joe on 4/13/16.
     */
    public static class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

        MainActivity mainActivity;

        public JUnit_test(){
            super(MainActivity.class);
        }

        public void test_first(){
            mainActivity = getActivity();

            int i = 2;
            int j = 32;
            int y = mainActivity.sum(i,j);

            assertEquals(34, y);

        }

    }
}