package com.example.cardkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.example.cardkeeper.navigation.NavigatorImpl

class MainActivity : AppCompatActivity() {

    private lateinit var navigator: NavigatorImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigator = NavigatorImpl(
            Navigation.findNavController(this, R.id.activity_main_nav_host_fragment)
        )
    }

    fun getNavigator(): Navigator{
        return navigator
    }
}
