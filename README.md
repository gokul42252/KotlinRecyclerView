# KotlinRecyclerview

http://thoughtnerds.com/recyclerview-using-kotlin-android-tutorial/

<h1><span style="color: #000000;"><a href="http://thoughtnerds.com/recyclerview-using-kotlin-android-tutorial/" style="color: #000000;">Recyclerview Using Kotlin</a></span></h1>
<span>Recycling is one of those things that is good for the planet, and it’s a common sense way to make sure we don’t find ourselves buried in our own rubbish or without sufficient resources in the future.</span>Its easy to implement Recyclerview with Kotlin. Kotlin using recyclerview reduce the codes than recyclerview in java. We can easily impplement Recyclerview using Kotlin.
<span>
</span>Follow the steps to build a recyclerview android application using kotlin

1) Create a UserModel.kt<span style="color: #ff6600;"></span>
<pre><span style="color: #ff6600;">package com.cretlabs.kotlinapplication</span>

<span style="color: #ff6600;">/**
 * Created by Gokul on 2/10/2018.
 */
data class UserModel(val name: String, val title: String)</span></pre>
2) Create a Custom Adapter layout item for Recyclerview layout_item.xml
<pre><span style="color: #ff6600;">&lt;?xml version="1.0" encoding="utf-8"?&gt;
&lt;LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_margin="2dp"
    android:orientation="vertical"&gt;
    &lt;LinearLayout
        android:background="@drawable/ic_launcher_background"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="10dp"&gt;
        &lt;android.support.v7.widget.AppCompatTextView
            android:id="@+id/txtName"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Name"
            android:textAppearance="@style/Base.TextAppearance.AppCompat.Large" /&gt;

        &lt;android.support.v7.widget.AppCompatTextView
            android:id="@+id/txtTitle"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Occupation"
            android:textAppearance="@style/Base.TextAppearance.AppCompat.Medium" /&gt;
    &lt;/LinearLayout&gt;
&lt;/LinearLayout&gt;

</span></pre>
3) Create a Custom Adapter Recyclerview CustomAdapter.kt
<pre><span style="color: #ff6600;">package com.cretlabs.kotlinapplication</span>


<span style="color: #ff6600;">import android.support.v7.widget.AppCompatTextView</span>
<span style="color: #ff6600;">import android.support.v7.widget.RecyclerView</span>
<span style="color: #ff6600;">import android.view.LayoutInflater</span>
<span style="color: #ff6600;">import android.view.View</span>
<span style="color: #ff6600;">import android.view.ViewGroup</span>

<span style="color: #ff6600;">/**
 * Created by Gokul on 2/10/2018.
 */
class CustomAdapter(val userList: ArrayList&lt;UserModel&gt;) : RecyclerView.Adapter&lt;CustomAdapter.ViewHolder&gt;() {</span>
<span style="color: #ff6600;">    /**
     * get Item count
     */
    override fun getItemCount(): Int {</span>
<span style="color: #ff6600;">        return userList.size;
    }</span>

<span style="color: #ff6600;">    /**
     * binding view
     */
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {</span>
<span style="color: #ff6600;">        holder?.txtName?.text = userList[position].name
        holder?.txtTitle?.text = userList[position].title
    }</span>

<span style="color: #ff6600;">    /**
     * creating view holder
     */
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {</span>
<span style="color: #ff6600;">        val v = LayoutInflater.from(parent?.context).inflate(R.layout.layout_item, parent, false)</span>
<span style="color: #ff6600;">        return ViewHolder(v);
    }</span>

<span style="color: #ff6600;">    /**
     * view holder
     */
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {</span>
<span style="color: #ff6600;">        val txtName = itemView.findViewById&lt;AppCompatTextView&gt;(R.id.txtName)</span>
<span style="color: #ff6600;">        val txtTitle = itemView.findViewById&lt;AppCompatTextView&gt;(R.id.txtTitle)</span>
<span style="color: #ff6600;">    }</span>
<span style="color: #ff6600;">}</span>

</pre>
4) Create an activity_main.xml add Recyclerview widget to layout
<pre><span style="color: #ff6600;"> &lt;?xml version="1.0" encoding="utf-8"?&gt;
 &lt;android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.cretlabs.kotlinapplication.MainActivity"&gt;

    &lt;android.support.v7.widget.RecyclerView
        android:id="@+id/recyclerView"
        android:layout_width="match_parent"
        android:layout_height="match_parent" /&gt;
</span><span><span style="color: #ff6600;">&lt;/android.support.constraint.ConstraintLayout&gt;</span>
</span></pre>
4) Write MainActivity.kt to initialize recyclerview ,set layout manger,setting adapter to recyclerview.
<pre><span style="color: #ff6600;">package com.cretlabs.kotlinapplication

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
        val rv = findViewById&lt;RecyclerView&gt;(R.id.recyclerView)
        /**
         * setting layout manger
         */
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val arrayList = ArrayList&lt;UserModel&gt;()
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

</span></pre>
Its all done. Its simple to implement recyclerview in kotlin language.

&nbsp;

<img src="http://thoughtnerds.com/wp-content/uploads/2018/02/Screenshot-55-165x300.png" alt="" width="256" height="465" class="alignnone wp-image-473" />

Download Source Code From Github <a href="https://github.com/gokul42252/KotlinRecyclerview" target="_blank" rel="noopener">Repo</a>
