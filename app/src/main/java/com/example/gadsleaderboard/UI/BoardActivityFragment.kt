package com.example.gadsleaderboard.UI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gadsleaderboard.R
import com.example.gadsleaderboard.adapters.BaseRecyclerViewAdapter

abstract class BoardActivityFragment<T> : BaseFragment(R.layout.fragment_board_activity) {
    lateinit var adapter: BaseRecyclerViewAdapter<T, out BaseRecyclerViewAdapter.ViewHolder<T>>
    val listLearners by lazy {
        view?.findViewById<RecyclerView>(R.id.list_learners)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = initAdapter()

        listLearners?.adapter = adapter
    }

    abstract fun initAdapter(): BaseRecyclerViewAdapter<T, out BaseRecyclerViewAdapter.ViewHolder<T>>
}