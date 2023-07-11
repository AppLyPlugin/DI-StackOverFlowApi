package com.techyourchance.dagger2course.screens.common.fragment

import androidx.fragment.app.Fragment
import com.techyourchance.dagger2course.screens.common.activity.BaseActivity

open class BaseFragment: Fragment() {

    protected val compositionRoot get() = (requireActivity() as BaseActivity).compositionRoot

}