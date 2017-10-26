package com.example.admin.roboelectric;

import android.content.Intent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowApplication;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Admin on 10/25/2017.
 */

@RunWith(RobolectricTestRunner.class)
@Config(manifest= Config.NONE)
public class MainActivityTest {

    @Test
    public void clickingLogin_shouldStartLoginActivity() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.login).performClick();

        Intent expectedIntent = new Intent(activity, LoginActivity.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }
}