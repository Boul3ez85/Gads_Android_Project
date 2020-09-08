package com.example.gadsleaderboard.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.gadsleaderboard.UI.LearningLeaderFragment

class BroadViewPagerAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = TABS.size

    override fun createFragment(position: Int): Fragment {
        return this[position]
    }

    operator fun get(pos: Int): Fragment = when (pos) {
        0 -> LearningLeaderFragment()
        else -> SkillIQFragment()
    }
    companion object {
        @JvmStatic
        val TABS = arrayOf(
            "Learning Leaders",
            "Skill IQ Leaders"
        )
    }
}