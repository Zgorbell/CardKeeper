package com.example.cardkeeper.ui.cards

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cardkeeper.model.GiftProvidersUI
import com.example.entity.GiftProvidersRepository

class CardsViewModel(
    private val giftProvidersRepository: GiftProvidersRepository)
    : ViewModel() {

    val gifProvidersUI = MutableLiveData<GiftProvidersUI>()

    fun onStart(){
        gifProvidersUI.value = GiftProvidersUI(giftProvidersRepository.getGiftProviders())
    }


}