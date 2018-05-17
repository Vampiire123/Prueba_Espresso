package com.example.winecta.pruebaespresso;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withInputType;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.v4.content.ContextCompat.startActivity;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule<>(MainActivity.class, true, false);

    private MainActivity startActivity() {
        return activityRule.launchActivity(null);
    }

    @Test
    public void shouldWriteSomethingInEditText() {
        startActivity();

        onView(withId(R.id.button)).check(matches(isDisplayed()));
        onView(withId(R.id.button)).check(matches(withText("Clic")));
        onView(withId(R.id.button)).perform(click());

        onView(withId(R.id.textView)).check(matches(isDisplayed()));
        onView(withId(R.id.textView)).check(matches(withText("nice")));
    }
}