package com.example.gadsleaderboard.adapters

import android.os.Bundle
import android.view.View
import com.example.gadsleaderboard.UI.BoardActivityFragment
import com.example.gadsleaderboard.models.LearnerHours


class SkillIQFragment : BoardActivityFragment<LearnerHours>() {

    override fun initAdapter() = LearningLeadersAdapter()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
    }

    private fun loadData() {

    }

}

