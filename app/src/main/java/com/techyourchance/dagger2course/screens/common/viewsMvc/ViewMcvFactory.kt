package com.techyourchance.dagger2course.screens.common.viewsMvc

import android.view.LayoutInflater
import android.view.ViewGroup
import com.techyourchance.dagger2course.screens.questiondetails.QuestionDetailsViewMvc
import com.techyourchance.dagger2course.screens.questionslist.QuestionsListViewMvc
import javax.inject.Inject

class ViewMvcFactory @Inject constructor(
    private val layoutInflater: LayoutInflater
) {

    fun newQuestionsListViewMvc(parent: ViewGroup?): QuestionsListViewMvc{
        return QuestionsListViewMvc(layoutInflater, parent)
    }

    fun newQuestionsDetailsViewMvc(parent: ViewGroup?): QuestionDetailsViewMvc{
        return QuestionDetailsViewMvc(layoutInflater, parent)
    }

}