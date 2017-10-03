package com.example.devfesttanzania;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Locale;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Nsubuga on 9/16/2017.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class CalculatectivityTest {
    private String X;
    private String Y;
    private String Result;
    Calculator calc;
    @Rule
    public ActivityTestRule<Calculatectivity> mActivityTestRule = new ActivityTestRule<>(
            Calculatectivity.class
    );
    @Before
    public void setmTypedUsername(){
        calc = new Calculator();
        X = "12";
        Y = "2";
    }


    @Test
    public void testAdditionUIFunctionality(){
        int x = Integer.parseInt(X);
        int y = Integer.parseInt(Y);

        onView(withId(R.id.etX)).perform(typeText(X),closeSoftKeyboard());
        onView(withId(R.id.etY)).perform(typeText(Y),closeSoftKeyboard());
        onView(withText(R.string.add)).perform(click());
        onView(withId(R.id.tvResults)).check( matches( withText( Integer.toString(  new Calculator().add(x,y))) ) );


    }

    @Test
    public void testSubtractionUIFunctionality(){
        int x = Integer.parseInt(X);
        int y = Integer.parseInt(Y);
        onView(withId(R.id.etX)).perform(typeText(X),closeSoftKeyboard());
        onView(withId(R.id.etY)).perform(typeText(Y),closeSoftKeyboard());
        onView(withText(R.string.subract)).perform(click());
        onView(withId(R.id.tvResults)).check( matches( withText( Integer.toString(  new Calculator().subrack(x,y))) ) );
    }

    @Test
    public void testDivisionUIFunctionality(){
        int x = Integer.parseInt(X);
        int y = Integer.parseInt(Y);
        onView(withId(R.id.etX)).perform(typeText(X),closeSoftKeyboard());
        onView(withId(R.id.etY)).perform(typeText(Y),closeSoftKeyboard());
        onView(withText(R.string.divide)).perform(click());
        onView(withId(R.id.tvResults)).check( matches( withText( String.format(Locale.ENGLISH, "%f",  new Calculator().divide(x,y))) ) );
    }

    @Test
    public void testMultiplationUIFunctionality(){
        int x = Integer.parseInt(X);
        int y = Integer.parseInt(Y);
        onView(withId(R.id.etX)).perform(typeText(X),closeSoftKeyboard());
        onView(withId(R.id.etY)).perform(typeText(Y),closeSoftKeyboard());
        onView(withText(R.string.multiply)).perform(click());
        onView(withId(R.id.tvResults)).check( matches( withText( String.format(Locale.ENGLISH, "%d",  new Calculator().multiply(x,y))) ) );
    }

}