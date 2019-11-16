package com.example.cardkeeper.ui.cards

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.cardkeeper.R
import com.example.cardkeeper.databinding.LayoutCardsBinding
import com.example.cardkeeper.model.Card
import com.example.cardkeeper.model.GiftProviderUI
import com.example.cardkeeper.model.GiftProvidersUI

class GiftProvidersRecyclerAdapter(private val cardClickListener: (Card) -> Unit)
    : RecyclerView.Adapter<GiftProvidersRecyclerAdapter.GiftProvidersViewHolder>() {

    private val providers = ArrayList<GiftProviderUI>()

    fun setData(giftProvidersUI: GiftProvidersUI){
        this.providers.clear()
        this.providers.addAll(giftProvidersUI.getProviders())
    }

    override fun getItemCount(): Int {
        return providers.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GiftProvidersViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: LayoutCardsBinding =
            DataBindingUtil.inflate(inflater, R.layout.layout_cards, parent, false)
        return GiftProvidersViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GiftProvidersViewHolder, position: Int) {
        holder.bind(providers[position])
    }

    inner class GiftProvidersViewHolder(private val binding: LayoutCardsBinding)
        : RecyclerView.ViewHolder(binding.root){

        fun bind(giftProvider: GiftProviderUI){
            binding.giftProvider = giftProvider
            val adapter = CardsRecyclerAdapter(cardClickListener)
            adapter.setData(giftProvider.getCards())
            binding.recyclerViewGiftProviders.adapter = adapter
            binding.executePendingBindings()
        }
    }
}