package com.example.gadsleaderboard.adapters;;

import android.os.Bundle
import android.view.View
import com.example.gadsleaderboard.UI.BoardActivityFragment


class SkillIQFragment : BoardActivityFragment() {

        override fun initAdapter(): BaseRecyclerViewAdapter<*, *> = LearningLeadersAdapter()

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            loadData()
        }

        private fun loadData() {

        }

}