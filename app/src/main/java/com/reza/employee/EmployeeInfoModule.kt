package com.reza.employee

import dagger.Module
import dagger.Provides

@Module
class EmployeeInfoModule {

    @Provides
    fun provideEmmployee() : Employee {
        return Employee()
    }

}