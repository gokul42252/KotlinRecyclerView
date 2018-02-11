# KotlinRecyclerview

http://thoughtnerds.com/recyclerview-using-kotlin-android-tutorial/

Recyclerview Using Kotlin
 

Recycling is one of those things that is good for the planet, and it’s a common sense way to make sure we don’t find ourselves buried in our own rubbish or without sufficient resources in the future.Its easy to implement Recyclerview with Kotlin. Kotlin using recyclerview reduce the codes than recyclerview in java. We can easily impplement Recyclerview using Kotlin.

Follow the steps to build a recyclerview android application using kotlin

1) Create a UserModel.kt

package com.cretlabs.kotlinapplication

/**
 * Created by Gokul on 2/10/2018.
 */
data class UserModel(val name: String, val title: String)
2) Create a Custom Adapter layout item for Recyclerview layout_item.xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_margin="2dp"
    android:orientation="vertical">
    <LinearLayout
        android:background="@drawable/ic_launcher_background"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="10dp">
        <android.support.v7.widget.AppCompatTextView
            android:id="@+id/txtName"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Name"
            android:textAppearance="@style/Base.TextAppearance.AppCompat.Large" />

        <android.support.v7.widget.AppCompatTextView
            android:id="@+id/txtTitle"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Occupation"
            android:textAppearance="@style/Base.TextAppearance.AppCompat.Medium" />
    </LinearLayout>
</LinearLayout>

3) Create a Custom Adapter Recyclerview CustomAdapter.kt

package com.cretlabs.kotlinapplication


import android.support.v7.widget.AppCompatTextView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Gokul on 2/10/2018.
 */
class CustomAdapter(val userList: ArrayList<UserModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    /**
     * get Item count
     */
    override fun getItemCount(): Int {
        return userList.size;
    }

    /**
     * binding view
     */
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.txtName?.text = userList[position].name
        holder?.txtTitle?.text = userList[position].title
    }

    /**
     * creating view holder
     */
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.layout_item, parent, false)
        return ViewHolder(v);
    }

    /**
     * view holder
     */
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtName = itemView.findViewById<AppCompatTextView>(R.id.txtName)
        val txtTitle = itemView.findViewById<AppCompatTextView>(R.id.txtTitle)
    }
}

4) Create an activity_main.xml add Recyclerview widget to layout

 <?xml version="1.0" encoding="utf-8"?>
 <android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.cretlabs.kotlinapplication.MainActivity">

    <android.support.v7.widget.RecyclerView
        android:id="@+id/recyclerView"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
</android.support.constraint.ConstraintLayout>
4) Write MainActivity.kt to initialize recyclerview ,set layout manger,setting adapter to recyclerview.

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

Its all done. Its simple to implement recyclerview in kotlin language.

 



Download Source Code From Github Repo

Categories:	KOTLIN
Tags: kotlin android recyclerviewkotlin example recyclerview examplekotlin recyclerviewkotlin recyclerview examplekotlin recyclerview example projectrecyclerview androidrecyclerview kotlin androidRecyclerview Using KotlinRecyclerview Using Kotlin Android Tutorial
