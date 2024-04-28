package com.example.examfood

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ProfileAdapter(
    private val context: Activity,
    private val title: Array<String>,
    private val imageId: Array<Int>
): ArrayAdapter<String>(context,R.layout.profile_list, title){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.profile_list, parent, false)

        val titleTxt = rowView.findViewById<TextView>(R.id.nameMenu)
        val image = rowView.findViewById<ImageView>(R.id.menuImg)

        titleTxt.text = title[position]
        image.setImageResource(imageId[position])

        return rowView
    }
}