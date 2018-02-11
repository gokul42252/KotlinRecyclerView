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


