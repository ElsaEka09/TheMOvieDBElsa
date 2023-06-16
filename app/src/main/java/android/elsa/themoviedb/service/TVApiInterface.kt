package android.elsa.themoviedb.service


import android.elsa.themoviedb.model.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=fd5ad134323370b2ee8e1063b0adc14c")
    fun getTVList(): Call<TVResponse>
}