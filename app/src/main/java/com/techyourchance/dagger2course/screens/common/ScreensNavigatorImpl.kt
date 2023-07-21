package com.techyourchance.dagger2course.screens.common

import androidx.appcompat.app.AppCompatActivity
import com.techyourchance.dagger2course.common.dependencyinjection.activity.ActivityScope
import com.techyourchance.dagger2course.screens.questiondetails.QuestionDetailsActivity
import com.techyourchance.dagger2course.screens.viewmodel.ViewModelActivity
import javax.inject.Inject

@ActivityScope
class ScreensNavigatorImpl @Inject constructor(
    private val activity: AppCompatActivity
): ScreensNavigator {

    override fun toQuestionDetails(questionId: String) {
        QuestionDetailsActivity.start(activity, questionId)
    }

    override fun navigateBack() {
        @Suppress("DEPRECATION")
        activity.onBackPressed()
    }

    override fun toViewModel() {
        ViewModelActivity.start(activity)
    }

}