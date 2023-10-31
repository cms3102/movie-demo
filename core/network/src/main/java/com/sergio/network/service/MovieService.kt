package com.sergio.network.service

import retrofit2.http.GET

interface MovieService {

    @GET
    fun getMovies()

}