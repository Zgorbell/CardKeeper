package com.example.cardkeeper.navigation

import androidx.navigation.NavController
import com.example.cardkeeper.Navigator
import com.example.cardkeeper.R

class NavigatorImpl(private val navController: NavController): Navigator {

    override fun navigateToGiftDetails() {
        navController.navigate(R.id.giftDetailsFragment)
    }
}