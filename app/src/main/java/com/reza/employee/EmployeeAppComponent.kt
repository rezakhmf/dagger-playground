package com.reza.employee

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component( modules = [AndroidSupportInjectionModule::class, EmployeeAppModule::class])
interface EmployeeAppComponent : AndroidInjector<EmployeeApp> {

    @Component.Factory
    abstract class Factory: AndroidInjector.Factory<EmployeeApp>
}