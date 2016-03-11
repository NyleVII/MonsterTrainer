package seng301.monstertrainer;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Alex Thompson on 3/10/2016.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainLaunchActivityTest {

    @Rule
    public ActivityTestRule<MainLaunchActivity> mActivityRule = new ActivityTestRule(MainLaunchActivity.class);

    @Test
    public void ChooseOgreActivityTest() {
        onView(withText("Ogre")).perform(click());
    }
}

