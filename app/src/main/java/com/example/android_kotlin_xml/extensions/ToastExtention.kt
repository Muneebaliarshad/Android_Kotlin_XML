package com.example.android_kotlin_xml.extensions

import android.app.Activity
import android.widget.Toast

fun Activity.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    val toast = Toast.makeText(this, message, duration)
    toast.show()
}