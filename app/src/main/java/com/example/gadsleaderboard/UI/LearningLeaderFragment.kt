package com.example.gadsleaderboard.UI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gadsleaderboard.R
import com.example.gadsleaderboard.adapters.BaseRecyclerViewAdapter
import com.example.gadsleaderboard.adapters.LearningLeadersAdapter


class LearningLeaderFragment : BoardActivityFragment() {

    override fun initAdapter(): BaseRecyclerViewAdapter<*, *> = LearningLeadersAdapter()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
    }

    private fun loadData() {

    }

}
