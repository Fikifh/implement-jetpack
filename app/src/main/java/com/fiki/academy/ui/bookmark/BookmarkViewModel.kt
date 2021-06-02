package com.fiki.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.fiki.academy.data.CourseEntity
import com.fiki.academy.utils.DataDummy

class BookmarkViewModel : ViewModel() {
    fun getBookmarks() : List<CourseEntity> = DataDummy.generateDummyCourses()
}