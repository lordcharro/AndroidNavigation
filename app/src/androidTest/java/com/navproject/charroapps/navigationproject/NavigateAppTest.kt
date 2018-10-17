package com.navproject.charroapps.navigationproject

import android.support.test.runner.AndroidJUnit4
import org.junit.Assert.*
import android.support.test.rule.ActivityTestRule
import android.support.test.espresso.Espresso.*
import android.support.test.espresso.action.ViewActions.*
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
}