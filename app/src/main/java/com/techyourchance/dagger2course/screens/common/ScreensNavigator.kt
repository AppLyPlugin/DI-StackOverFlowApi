package com.techyourchance.dagger2course.screens.common

interface ScreensNavigator {

    fun toQuestionDetails(questionId: String)
    fun navigateBack()
    fun toViewModel()
}