package com.sinothk.storage.dbhelper.demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sinothk.storage.dbhelper.DBHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        DBHelper.with(this).saveOrUpdate()
    }
}
