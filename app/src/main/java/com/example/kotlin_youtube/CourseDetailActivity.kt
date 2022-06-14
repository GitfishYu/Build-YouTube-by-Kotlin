package com.example.kotlin_youtube

import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class CourseDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        recyclerView_main.layoutManager = LinearLayoutManager(this)
        recyclerView_main.adapter = CourseDetailAdapter()

    }

    private class CourseDetailAdapter: RecyclerView.Adapter<CourseLessonViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseLessonViewHolder {

            val layoutInflater = LayoutInflater.from(parent.context)
            val customView = layoutInflater.inflate(R.layout.course_lesson_row, parent, false)
            return CourseLessonViewHolder(customView)
        }

        override fun onBindViewHolder(holder: CourseLessonViewHolder, position: Int) {

        }

        override fun getItemCount(): Int {
            return 5
        }

    }

    private class CourseLessonViewHolder(val customView: View): RecyclerView.ViewHolder(customView) {

    }
}