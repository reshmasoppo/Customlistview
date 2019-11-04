package com.example.customlistview

import android.app.Activity
import android.content.Context
import android.icu.text.CaseMap
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MyListAdapter(private val context: Activity, private val title:Array<String>,
                    private  val description:Array<String>)

    :ArrayAdapter<String>(context, R.layout.list_layout, title)

{
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.list_layout, null, true)

        val titleText = rowView.findViewById(R.id.title) as TextView
      //  val imageView = rowView.findViewById(R.id.icon) as ImageView
        val subtitleText = rowView.findViewById(R.id.description) as TextView

        titleText.text = title[position]
        subtitleText.text = description[position]

        return rowView
    }

}


