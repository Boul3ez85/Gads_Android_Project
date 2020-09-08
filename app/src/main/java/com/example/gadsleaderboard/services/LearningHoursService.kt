package com.example.gadsleaderboard.services

import android.telecom.Call
import com.example.gadsleaderboard.models.LearnerHours
import retrofit2.http.GET

interface LearningHoursService {
    @GET("hours")
    fun getLearnersHours(): Call<List<LearnerHours>>
}