package android.elsa.themoviedb.service

import android.elsa.themoviedb.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=fd5ad134323370b2ee8e1063b0adc14c")
    fun getMovieList(): Call<MovieResponse>
}