package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lv=findViewById<ListView>(R.id.lv)
       val name=resources.getStringArray(R.array.name)
       var arrayAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,name)
        lv.adapter=arrayAdapter
  /*     lv.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this,"language selected is: "+name[i],Toast.LENGTH_SHORT).show()

        }*/
      lv.onItemClickListener= AdapterView.OnItemClickListener { adapterView, view, i, l ->
          val selectedItem=adapterView.getItemAtPosition(i) as String
          val itemPosition=adapterView.getItemIdAtPosition(i)
          Toast.makeText(this,"selected item is $selectedItem \n position: $itemPosition",Toast.LENGTH_SHORT).show()
      }
    }
}


