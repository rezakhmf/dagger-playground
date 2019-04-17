package com.reza.employee

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = arrayOf(MainActivityBuilder::class))
class EmployeeAppModule {

    @Provides
    @Singleton
    fun provideContex(app: EmployeeApp) : Context {
        return app.applicationContext
    }

}