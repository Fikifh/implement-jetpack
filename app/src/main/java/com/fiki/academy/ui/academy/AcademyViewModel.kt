package com.fiki.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.fiki.academy.data.CourseEntity
import com.fiki.academy.utils.DataDummy

class AcademyViewModel : ViewModel() {
    fun getCourses() : List<CourseEntity> = DataDummy.generateDummyCourses()
}