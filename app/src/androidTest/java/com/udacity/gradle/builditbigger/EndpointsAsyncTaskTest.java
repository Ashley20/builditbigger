package com.udacity.gradle.builditbigger;

import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import com.example.javajokesprovider.MyClass;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class EndpointsAsyncTaskTest{
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void check_if_AsyncTask_returns_nonempty_string() {
        // Perform click operation on the joke button
        onView(withId(R.id.joke_button)).perform(click());

        MyClass provider = new MyClass();

        // Check if we get the correct joke provided by java lib
        onView(withId(R.id.joke_tv)).check(matches(ViewMatchers.withText(provider.getJoke())));
    }

}