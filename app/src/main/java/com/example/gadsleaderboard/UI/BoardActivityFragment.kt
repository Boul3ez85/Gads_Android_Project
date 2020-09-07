package com.example.gadsleaderboard.UI

import androidx.recyclerview.widget.RecyclerView
import com.example.gadsleaderboard.R

abstract class BoardActivityFragment : BaseFragment(R.layout.fragment_board_activity) {
    val listLearners by lazy {
        view?.findViewById<RecyclerView>(R.id.list_learners)
    }
}