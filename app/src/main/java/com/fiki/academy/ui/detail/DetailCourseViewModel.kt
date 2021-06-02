package com.fiki.academy.ui.detail

import android.util.Log
import androidx.lifecycle.ViewModel
import com.fiki.academy.data.CourseEntity
import com.fiki.academy.data.ModuleEntity
import com.fiki.academy.utils.DataDummy

class DetailCourseViewModel : ViewModel() {
    private lateinit var courseId : String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun getCourse() : CourseEntity {
        Log.d("course_log", courseId)
        lateinit var course : CourseEntity
        val courseEntities = DataDummy.generateDummyCourses()
        for (courseEntity in courseEntities) {
            if (courseEntity.courseId == courseId) {
                course = courseEntity
            }
        }
        return course
    }

    fun getModules() : List<ModuleEntity> = DataDummy.generateDummyModules(courseId)
}