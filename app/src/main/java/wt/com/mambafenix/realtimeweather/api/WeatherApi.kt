package wt.com.mambafenix.realtimeweather.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import wt.com.mambafenix.realtimeweather.api.WeatherModel

interface WeatherApi {


    @GET("/v1/current.json")
    suspend fun getWeather(
        @Query("key") apikey : String,
        @Query("q") city : String
    ) : Response<WeatherModel>

}