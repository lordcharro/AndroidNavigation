package com.navproject.charroapps.navigationproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), FirstFragment.OnFragmentInteractionListener, SecondFragment.OnFragmentInteractionListener, ThirdFragment.OnFragmentInteractionListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onFragmentInteractionFragment1(string: String) {
        // Do stuff
    }

    override fun onFragmentInteractionFragment2(string: String) {
        // Do stuff
    }

    override fun onFragmentInteractionFragment3(string: String) {
        // Do stuff
    }
}
