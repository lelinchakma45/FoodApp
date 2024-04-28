package com.example.examfood

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter(
    private val context: Activity,
    private val title: Array<String>,
    private val desc: Array<String>,
    private val imageId: Array<Int>
): ArrayAdapter<String>(context,R.layout.list_item, title){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.list_item, parent, false)

        val titleTxt = rowView.findViewById<TextView>(R.id.foodNameItem)
        val descTxt = rowView.findViewById<TextView>(R.id.foodCategory)
        val image = rowView.findViewById<ImageView>(R.id.itemImg)

        titleTxt.text = title[position]
        descTxt.text = desc[position]
        image.setImageResource(imageId[position])

        return rowView
    }
}