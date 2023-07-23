package com.techyourchance.dagger2course.screens.common.viewmodels

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

abstract class SaveStateViewModel: ViewModel() {

    abstract fun init(savedStateHandle: SavedStateHandle)

}