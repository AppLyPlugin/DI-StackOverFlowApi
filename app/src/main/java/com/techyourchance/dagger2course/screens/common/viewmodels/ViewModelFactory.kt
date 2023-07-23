package com.techyourchance.dagger2course.screens.common.viewmodels

import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.savedstate.SavedStateRegistryOwner
import com.techyourchance.dagger2course.questions.FetchQuestionDetailsUseCase
import com.techyourchance.dagger2course.questions.FetchQuestionsUseCase
import com.techyourchance.dagger2course.screens.viewmodel.MyViewModel
import javax.inject.Inject
import javax.inject.Provider

class ViewModelFactory @Inject constructor(
//    Dependecy Injection Multibinding
    private val providers: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>,
    savedStateRegistryOwner: SavedStateRegistryOwner
) : AbstractSavedStateViewModelFactory(savedStateRegistryOwner, null) {

    override fun <T : ViewModel?> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ): T {
        val provider = providers[modelClass]
        val viewModel= provider?.get() as T ?: throw java.lang.RuntimeException("Unsupported View Model Class: $modelClass")

        if(viewModel is SaveStateViewModel){
            viewModel.init(handle)
        }

        return viewModel as T
    }
}

//
//      Dependency Injection
//        val viewModel = when (modelClass) {
//            MyViewModel::class.java ->
//                 MyViewModel(
//                    fetchQuestionUseCaseProvider.get(),
//                    fetchQuestionDetailsUseCaseProvider.get()
//                ) as T
//            else -> throw java.lang.RuntimeException("Unsupported View Model Class: $modelClass")
//        }
//
//        if(viewModel is SaveStateViewModel){
//            viewModel.init(handle)
//        }
//
//
//      Dependecy Injection Multibinding
//    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//        val provider = providers[modelClass]
//        return provider?.get() as T ?: throw java.lang.RuntimeException("Unsupported View Model Class: $modelClass")
//    }

