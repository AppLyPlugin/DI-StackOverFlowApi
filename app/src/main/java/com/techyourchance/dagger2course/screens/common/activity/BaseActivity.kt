package com.techyourchance.dagger2course.screens.common.activity

import androidx.appcompat.app.AppCompatActivity
import com.techyourchance.dagger2course.MyApplication
import com.techyourchance.dagger2course.common.dependencyinjection.activity.ActivityModule

open class BaseActivity : AppCompatActivity() {

    private val appComponent get() = (application as MyApplication).appComponent

    val activityComponent by lazy {
        appComponent.newActivityComponentBuilder()
            .activity(this)
            .activityModule(ActivityModule)
            .build()
    }

    private val presentationComponent by lazy {
        activityComponent.newPresentationComponent()
    }

    protected val injector get() = presentationComponent
}