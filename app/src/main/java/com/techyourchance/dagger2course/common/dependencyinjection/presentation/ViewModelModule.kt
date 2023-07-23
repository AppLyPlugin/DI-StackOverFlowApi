package com.techyourchance.dagger2course.common.dependencyinjection.presentation

import androidx.lifecycle.ViewModel
import com.techyourchance.dagger2course.screens.viewmodel.MyViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

//CLASS USE FOR MULTIBINDING
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MyViewModel::class)
    abstract fun viewModel(myViewModel: MyViewModel): ViewModel

}