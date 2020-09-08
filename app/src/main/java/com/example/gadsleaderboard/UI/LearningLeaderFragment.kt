package com.example.gadsleaderboard.UI

import android.content.ContentValues.TAG
import android.os.Bundle
import android.telecom.Call
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gadsleaderboard.R
import com.example.gadsleaderboard.UI.BoardActivityFragment
import com.example.gadsleaderboard.adapters.BaseRecyclerViewAdapter
import com.example.gadsleaderboard.adapters.LearningLeadersAdapter
import com.example.gadsleaderboard.models.LearnerHours
import com.example.gadsleaderboard.services.ServiceBuilder
import javax.security.auth.callback.Callback
import retrofit2.CallBack
import retrofit2.Response
import android.util.Log
import retrofit2


class LearningLeaderFragment : BoardActivityFragment<LearnerHours>() {
    val TAG = "LearningLeadersFragment"

    override fun initAdapter() = LearningLeadersAdapter()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
    }

    private fun loadData() {
        val service = ServiceBuilder.create(LearningLeaderFragment::class.java)
        val data = service.getLearnersHours()

        data.enqueue(hoursCallBack)

    }
    val hoursCallBack by lazy {
        object : Callback<List<LearnerHours>> {
            override fun onResponse(
                call: Call<List<LearnerHours>>,
                response: Response<List<LearnerHours>>
            ) {
                val body = response.body()



                if (body != null) {
                    adapter.listItems = body
                }
                else{
                    Log.d(TAG, "Failed with response: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<List<LearnerHours>>, t: Throwable) {}
                Log.d(TAG, "Failed:${t.message}")
        }
    }

}
