package com.cretlabs.kotlinapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * recycler view initializing
         */
        val rv = findViewById<RecyclerView>(R.id.recyclerView)
        /**
         * setting layout manger
         */
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val arrayList = ArrayList<UserModel>()
        arrayList.add(UserModel("John", "Doe"))
        arrayList.add(UserModel("Jane", "Doe"))
        arrayList.add(UserModel("John", "Doe"))
        arrayList.add(UserModel("Amy", "Doe"))
        arrayList.add(UserModel("John", "Doe"))
        arrayList.add(UserModel("Jane", "Doe"))
        arrayList.add(UserModel("John", "Doe"))
        arrayList.add(UserModel("Amy", "Doe"))
        arrayList.add(UserModel("John", "Doe"))
        arrayList.add(UserModel("Jane", "Doe"))
        arrayList.add(UserModel("John", "Doe"))
        arrayList.add(UserModel("Amy", "Doe"))
        /**
         * setting adapter
         */
        val adapter = CustomAdapter(arrayList)
        rv.adapter = adapter
    }
}
