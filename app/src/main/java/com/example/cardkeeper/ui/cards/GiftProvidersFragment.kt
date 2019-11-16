package com.example.cardkeeper.ui.cards

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.example.cardkeeper.MainActivity
import com.example.cardkeeper.R
import com.example.cardkeeper.di.viewModelModule
import com.example.cardkeeper.model.Card
import com.example.cardkeeper.shared.SharedGiftCard
import kotlinx.android.synthetic.main.fragment_gift_providers.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class GiftProvidersFragment: Fragment() {

    private val cardsViewModel: CardsViewModel by viewModel()
    private val sharedGiftCard: SharedGiftCard by inject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gift_providers, container, false)
    }

    override fun onResume() {
        super.onResume()
        setupViewModel()
        cardsViewModel.onStart()
    }

    private fun setupViewModel(){
        cardsViewModel.gifProvidersUI.observe(this, Observer{ it ->
            val adapter = GiftProvidersRecyclerAdapter {
                sharedGiftCard.card = it
                (requireActivity() as MainActivity).getNavigator().navigateToGiftDetails()
            }
            adapter.setData(it)
            recyclerViewFragmentGiftProviders.adapter = adapter
        })
    }
}