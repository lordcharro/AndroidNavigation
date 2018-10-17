package com.navproject.charroapps.navigationproject

import org.junit.Test

import org.junit.Assert.*

class ThirdFragmentTest {

    @Test
    fun onButtonPressed() {
        val value = "Going to Fragment 1"
        val valueReal = ThirdFragment.Values.commValue
        assertEquals(value,valueReal)
    }
}