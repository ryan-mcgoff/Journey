package com.stealbox.journey.di

import com.stealbox.journey.PreferenceManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class ApplicationModule{

    @Provides
    @Singleton
    fun providesPreferenceManager() = PreferenceManager("Hello")

}