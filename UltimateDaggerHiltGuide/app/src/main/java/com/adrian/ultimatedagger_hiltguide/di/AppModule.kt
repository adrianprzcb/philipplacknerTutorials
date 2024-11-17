package com.adrian.ultimatedagger_hiltguide.di

import android.app.Application
import androidx.navigation.Navigator
import com.adrian.ultimatedagger_hiltguide.data.remote.MyApi
import com.adrian.ultimatedagger_hiltguide.data.repository.MyRepositoryImpl
import com.adrian.ultimatedagger_hiltguide.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesMyApi() : MyApi {
        return Retrofit.Builder().baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }

/*
    @Provides
    @Singleton
    fun providesMyRepository(api: MyApi , app: Application , @Named("hello") hello: String) : MyRepository {
        return MyRepositoryImpl(api , app)
    }
*/
    @Provides
    @Singleton
    @Named("hello")
    fun providesString1() = "hgello"

    @Provides
    @Singleton
    @Named("adios")
    fun providesString2() = "adios"
}