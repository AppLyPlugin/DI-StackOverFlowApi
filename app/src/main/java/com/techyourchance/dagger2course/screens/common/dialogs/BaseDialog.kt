package com.techyourchance.dagger2course.screens.common.dialogs

import androidx.fragment.app.DialogFragment
import com.techyourchance.dagger2course.MyApplication
import com.techyourchance.dagger2course.common.dependencyinjection.activity.ActivityModule
import com.techyourchance.dagger2course.screens.common.activity.BaseActivity

open class BaseDialog: DialogFragment() {

   private val presentationComponent by lazy {
       (requireActivity() as BaseActivity).activityComponent.newPresentationComponent()
   }

    protected val injector get() = presentationComponent


}