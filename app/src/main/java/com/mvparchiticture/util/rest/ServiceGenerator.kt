package com.mvparchiticture.util.rest

import com.mvparchiticture.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.jackson.JacksonConverterFactory
import java.util.concurrent.TimeUnit


object ServiceGenerator {

    private val httpClient = OkHttpClient.Builder()
    private var retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(JacksonConverterFactory.create(JSONUtils.getJsonMapper()))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl(BuildConfig.BASE_URL)

    fun <T> createService(clazz: Class<T>): T {
        httpClient.addInterceptor { chain ->
            val original = chain.request()
            val requestBuilder = original.newBuilder()
//            requestBuilder.addHeader("Authorization", MVPArchitictureApplication.user?.accessToken ?: "")
            val request = requestBuilder.build()
            return@addInterceptor chain.proceed(request)
        }
        httpClient.connectTimeout(5, TimeUnit.MINUTES)
        httpClient.writeTimeout(5, TimeUnit.MINUTES)
        httpClient.readTimeout(5, TimeUnit.MINUTES)

        val mHttpLoggingInterceptor = HttpLoggingInterceptor()
        mHttpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        if (BuildConfig.DEBUG)
            httpClient.addInterceptor(mHttpLoggingInterceptor)

        val client = httpClient.build()

        // if you want to set time out.

        val retrofit = retrofitBuilder.client(client).build()
        return retrofit.create(clazz)
    }

}