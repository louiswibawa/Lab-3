package tests;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.example.joe.sum.MainActivity;
import com.example.joe.sum.R;

/**
 * Created by joe on 4/13/16.
 */
public class JUnit_test extends  ActivityInstrumentationTestCase2<MainActivity>{

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
