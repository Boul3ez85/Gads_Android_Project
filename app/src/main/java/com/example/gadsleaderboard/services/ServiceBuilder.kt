package com.example.gadsleaderboard.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServiceBuilder {

    companion object {
        @JvmStatic
        val baseUrl = "https://gadsapi.herokuapp.com/api/"

        @JvmStatic
        val builder by lazy {
            Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
        }

        @JvmStatic
        val retrofit by lazy{
            builder.build()
        }

        @JvmStatic
        fun <S> create(`class`: Class<S>): S {
            return retrofit.create(`class`)
        }
    }
}