package com.example.testingapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var itemAdapter: ItemAdapter
    lateinit var dataList: ArrayList<ModelClass>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recyclerView :RecyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        dataList = ArrayList()
        dataList.add(ModelClass(R.drawable.bird, "Birds","Birds are very beautiful"))
        dataList.add(ModelClass(R.drawable.student, "Students","Student go to college to attend biology class"))
        dataList.add(ModelClass(R.drawable.peacock, "Peacock beauty","Peacock feathers are very beautiful"))
        dataList.add(ModelClass(R.drawable.tiger, "Tiger","Tiger is very dangerous aniaml"))
        dataList.add(ModelClass(R.drawable.newspaper, "Headlines","Read newspapers daily"))
        dataList.add(ModelClass(R.drawable.bird, "Birds","Birds are very beautiful"))
        dataList.add(ModelClass(R.drawable.student, "Students","Student go to college to attend biology class"))
        dataList.add(ModelClass(R.drawable.peacock, "Peacock beauty","Peacock feathers are very beautiful"))
        dataList.add(ModelClass(R.drawable.tiger, "Tiger","Tiger is very dangerous aniaml"))
        dataList.add(ModelClass(R.drawable.newspaper, "Headlines","Read newspapers daily"))

        itemAdapter = ItemAdapter(dataList, this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = itemAdapter




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}