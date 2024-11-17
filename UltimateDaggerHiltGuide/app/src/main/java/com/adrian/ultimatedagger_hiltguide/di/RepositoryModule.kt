package com.adrian.ultimatedagger_hiltguide.di

import com.adrian.ultimatedagger_hiltguide.data.repository.MyRepositoryImpl
import com.adrian.ultimatedagger_hiltguide.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMyRepository(
        myRepositoryImpl: MyRepositoryImpl
    ): MyRepository

}