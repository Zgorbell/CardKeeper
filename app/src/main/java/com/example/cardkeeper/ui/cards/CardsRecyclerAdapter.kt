package com.example.cardkeeper.ui.cards

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.cardkeeper.R
import com.example.cardkeeper.databinding.LayoutCardBinding
import com.example.cardkeeper.model.Card


class CardsRecyclerAdapter(private val listener: (Card) -> Unit)
    : RecyclerView.Adapter<CardsRecyclerAdapter.CardsRecyclerViewHolder>() {

    private val cards = ArrayList<Card>()

    fun setData(cards: List<Card>){
        this.cards.clear()
        this.cards.addAll(cards)
    }

    override fun getItemCount(): Int {
        return cards.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardsRecyclerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: LayoutCardBinding
                = DataBindingUtil.inflate(inflater, R.layout.layout_card, parent, false)
        return CardsRecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardsRecyclerViewHolder, position: Int) {
        holder.bind(cards[position])
    }

    inner class CardsRecyclerViewHolder(private val binding: LayoutCardBinding)
        : RecyclerView.ViewHolder(binding.root) {


        fun bind(card: Card){
            binding.card = card
            binding.root.setOnClickListener {
                listener(card)
            }
            binding.executePendingBindings()
        }
    }
}