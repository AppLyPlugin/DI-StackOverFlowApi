package com.techyourchance.dagger2course.screens.common.fragment

import androidx.fragment.app.Fragment
import com.techyourchance.dagger2course.common.dependencyinjection.Injector
import com.techyourchance.dagger2course.common.dependencyinjection.PresentationCompositionRoot
import com.techyourchance.dagger2course.screens.common.activity.BaseActivity

open class BaseFragment : Fragment() {

    private val compositionRoot by lazy {
        PresentationCompositionRoot((requireActivity() as BaseActivity).activityCompositionRoot)
    }

    protected val injector get() = Injector(compositionRoot)


}