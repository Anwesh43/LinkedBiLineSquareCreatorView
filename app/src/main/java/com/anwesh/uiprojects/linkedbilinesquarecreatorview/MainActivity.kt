package com.anwesh.uiprojects.linkedbilinesquarecreatorview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.bilinesquarecreatorview.BiLineSquareCreatorView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BiLineSquareCreatorView.create(this)
    }
}
