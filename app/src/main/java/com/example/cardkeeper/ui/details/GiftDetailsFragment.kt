package com.example.cardkeeper.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.cardkeeper.MainActivity
import com.example.cardkeeper.R
import com.example.cardkeeper.databinding.FragmentGiftDetailsBinding
import com.example.cardkeeper.shared.SharedGiftCard
import org.koin.android.ext.android.inject

class GiftDetailsFragment: Fragment() {

    private lateinit var giftFragmentGiftDetailsBinding: FragmentGiftDetailsBinding
    private val sharedGiftCard: SharedGiftCard by inject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        giftFragmentGiftDetailsBinding = DataBindingUtil
            .inflate(inflater, R.layout.fragment_gift_details, container, false)
        return giftFragmentGiftDetailsBinding.root
    }

    override fun onResume() {
        super.onResume()
        giftFragmentGiftDetailsBinding.card = sharedGiftCard.card
    }
}