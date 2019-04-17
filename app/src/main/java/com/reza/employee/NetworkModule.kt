package com.reza.employee

import android.content.Context
import dagger.Module
import dagger.Provides
import io.reactivex.schedulers.Schedulers
import okhttp3.Cache
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import java.io.File
import javax.inject.Singleton

@Module
class NetworkModule {

//    @Provides
//    fun provideFlightPricesApi(retrofit: Retrofit): CityLookupApi {
//        return retrofit.create(CityLookupApi::class.java)
//    }

    @Provides
    @Singleton
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

//    @Provides
//    @Singleton
//    fun provideApiInterceptor(): ApiInterceptor {
//        return ApiInterceptor()
//    }

//    @Provides
//    @Singleton
//    fun provideHttpClient(loggingInterceptor: HttpLoggingInterceptor, cache: okhttp3.Cache, apiInterceptor: ApiInterceptor): OkHttpClient {
//
//        return OkHttpClient.Builder()
//            .addInterceptor(loggingInterceptor)
//            .addInterceptor(apiInterceptor)
//            .connectTimeout(TIMEOUT_IN_MS, TimeUnit.MILLISECONDS)
//            .cache(cache).build()
//    }

    @Provides
    @Singleton
    fun provideCache(context: Context): Cache {

        val cacheSize: Long = 5 * 1024 * 1024
        var cacheDir: File = context.cacheDir
        return Cache(cacheDir, cacheSize)
    }

    @Provides
    @Singleton
    fun provideRxJavaCallAdapterFactory(): RxJava2CallAdapterFactory {

        return RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io())
    }

//    @Provides
//    fun provideRetrofit(okHttpClient: OkHttpClient, rxAdaptor: RxJava2CallAdapterFactory): Retrofit {
//        return Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .addCallAdapterFactory(rxAdaptor)
//            .client(okHttpClient)
//            .build()
//    }
}