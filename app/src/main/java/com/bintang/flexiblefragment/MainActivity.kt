package com.bintang.flexiblefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val homeFragment = HomeFragment()
        val fragment = fragmentManager.findFragmentByTag(HomeFragment::class.simpleName)

        if( fragment !is HomeFragment){
            Log.d("FlexibleFragment", "FragmentName :"+HomeFragment::class.java.simpleName)
            fragmentManager
                .beginTransaction()
                .add(R.id.frame_container,homeFragment,HomeFragment::class.java.simpleName)
                .commit()
        }
    }
}