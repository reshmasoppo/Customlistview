package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var listview:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        listview=findViewById<ListView>(R.id.listview)

        val name= arrayOf<String>("A","B","C")
        val city= arrayOf<String>("Mumbai","Chennai","Kochi")
        //val imgid= arrayOf<Int>(R.drawable.ic_launcher_background,R.drawable.ic_launcher_background)
       val mylistAdapter = MyListAdapter(this,name,city)
        listview.adapter=mylistAdapter
        listview.setOnItemClickListener { adapterview, view, position, id ->

            var item=adapterview.getItemAtPosition(position)
            var itemIdposition=adapterview.getItemIdAtPosition(position)

            Toast.makeText(this,"valaues are $item  its item isd is $itemIdposition",Toast.LENGTH_SHORT).show()


        }





    }
}
