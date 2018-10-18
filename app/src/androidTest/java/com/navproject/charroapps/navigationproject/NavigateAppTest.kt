package com.navproject.charroapps.navigationproject

import android.support.test.runner.AndroidJUnit4
import org.junit.Assert.*
import android.support.test.rule.ActivityTestRule
import android.support.test.espresso.Espresso.*
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NavigateAppTest{

    @Rule @JvmField
    val mainActivity = ActivityTestRule(MainActivity::class.java)

    @Test
    fun navigateApp(){

        onView(withId(R.id.btn_fg_next)).perform(click())
        onView(withId(R.id.btn_fg2_next)).perform(click())
        onView(withId(R.id.btn_fg3_begin)).perform(click())

    }

    @Test
    fun enterText(){

        onView(withId(R.id.btn_fg_next)).perform(click())
        onView(withId(R.id.btn_fg2_next)).perform(click())

        // With this String the test will not pass because we have put the maximum length in the EditText to 20
        val value = "Testing with Espresso"
        // With this one the test passes
        //val value = "Testing Espresso"

        onView(withId(R.id.editText_fr3_text)).perform(replaceText(value))
        onView(withId(R.id.btn_fg3_begin)).perform(click())
        onView(withId(R.id.txt_fg1_text)).check(matches(withText(value)))
    }
}