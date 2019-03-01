package com.example.nb201803m079.test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclerview.*
import java.util.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.recyclerview)

        val recyclerview =  findViewById<RecyclerView>(R.id.recycler_view)

        recyclerview.setHasFixedSize(true)
        /*****************************************重要 */
        val gridLayoutManagerVertical = GridLayoutManager(this, 6, LinearLayoutManager.VERTICAL, false)


        gridLayoutManagerVertical.spanSizeLookup = Custom_Spansize(6, 3, 2)
        recyclerview.layoutManager = gridLayoutManagerVertical
        /** */
        val adapter = custom_recyclerview_adapter(this, 20)//20個itemを作る
        recyclerview.adapter = adapter
    }
}