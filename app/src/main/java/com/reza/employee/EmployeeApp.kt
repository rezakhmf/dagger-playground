package com.reza.employee

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


class EmployeeApp: DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerEmployeeAppComponent.factory().create(this)
    }

}

