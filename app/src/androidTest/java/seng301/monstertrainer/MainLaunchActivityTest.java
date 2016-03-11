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
    public void testChooseOgreActivityTest() throws Exception {
        onView(withText("Ogre")).perform(click());
    }

    @Test
    public void testChooseOrcActivityTest() throws Exception {
        onView(withText("Orc")).perform(click());
    }

    @Test
    public void testChooseTrollActivityTest() throws Exception {
        onView(withText("Troll")).perform(click());
    }

    @Test
    public void testChooseImpActivityTest() throws Exception {
        onView(withText("Imp")).perform(click());
    }

    @Test
    public void testChooseGremlinActivityTest() throws Exception {
        onView(withText("Gremlin")).perform(click());
    }

    @Test
    public void testChooseGoblinActivityTest() throws Exception {
        onView(withText("Goblin")).perform(click());
    }
}

