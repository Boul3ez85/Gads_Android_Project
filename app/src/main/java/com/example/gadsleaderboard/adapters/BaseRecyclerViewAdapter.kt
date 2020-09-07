package com.example.gadsleaderboard.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerViewAdapter<M, ViewHolder : BaseRecyclerViewAdapter.ViewHolder<M>>(
    @LayoutRes var layout: Int,
    listItems: List<M> = listOf()
) :
    RecyclerView.Adapter<ViewHolder>() {

    var listItems = listOf<M>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    init {
        this.listItems = listItems
    }

    override fun getItemCount(): Int = listItems.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return initViewHolder(LayoutInflater.from(parent.context).inflate(layout, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listItems[position], position)
    }

    abstract class ViewHolder<T>(view: View) : RecyclerView.ViewHolder(view) {
        abstract fun bind(m: T, position: Int)
    }

    abstract fun initViewHolder(inflate: View): ViewHolder
}