package com.reza.employee

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityBuilder {

    @ContributesAndroidInjector(modules = [EmployeeInfoModule::class])
    abstract fun bindingMainActivity() : MainActivity
}