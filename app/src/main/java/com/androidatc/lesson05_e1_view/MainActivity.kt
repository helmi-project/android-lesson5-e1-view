package com.androidatc.lesson05_e1_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Hello_Button = findViewById<View>(R.id.test_main_layout) as LinearLayout

        // Creating the button
        val button_dynamic = Button(this)

        // Setting layout_width and layout_height using layout parameters
        button_dynamic.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        button_dynamic.text = "Hello Android ATC"

        // Add Button to LinearLayout
        Hello_Button.addView(button_dynamic)
    }
}
