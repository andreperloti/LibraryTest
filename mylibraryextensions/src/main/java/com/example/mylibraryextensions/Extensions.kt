package com.example.mylibraryextensions

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast


fun String.toastLongCustom() {
    val toast = Toast.makeText(MyApplicationModule.context, this, Toast.LENGTH_LONG)

    val toastView: View = toast.view

    val toastMessage = toastView.findViewById(android.R.id.message) as TextView
    toastMessage.textSize = 18f
    toastMessage.setTextColor(Color.WHITE)
    toastMessage.setCompoundDrawablesWithIntrinsicBounds(R.drawable.icon_toast, 0, 0, 0)
    toastMessage.gravity = Gravity.CENTER
    toastMessage.compoundDrawablePadding = 8
    toastView.setBackgroundColor(Color.BLACK)
    toast.show()
}