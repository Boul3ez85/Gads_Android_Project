package com.example.gadsleaderboard.adapters

import android.view.View
import android.widget.TextView
import com.example.gadsleaderboard.R
import com.example.gadsleaderboard.models.LearnerHours

class LearningLeadersAdapter :
    BaseRecyclerViewAdapter<LearnerHours, LearningLeadersAdapter.ViewHolder>(R.layout.item_learner_hours) {

    override fun initViewHolder(view: View): ViewHolder = ViewHolder(view)

    class ViewHolder(view: View) : BaseRecyclerViewAdapter.ViewHolder<LearnerHours>(view) {

        val learnersName by lazy {
            view.findViewById<TextView>(R.id.learners_name)
        }

        override fun bind(m: LearnerHours, position: Int) {
            learnersName.text = m.name
        }
    }
}