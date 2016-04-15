package tests;

/**
 * Created by joe on 4/15/16.
 */
import android.app.Application;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;
import com.example.joe.sum.MainActivity;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

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

