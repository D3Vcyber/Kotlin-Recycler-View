package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var numbersList: ArrayList<NumbersClass>
    lateinit var imageList: Array<Int>
    lateinit var titleList: Array<String>
    lateinit var otherlistofmonths: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        imageList = arrayOf(
            R.drawable.toxgazxvtcwzv1ukubi2__1__89rd7 ,
            R.drawable.toxgazxvtcwzv1ukubi2__1__89rd7,
            R.drawable.toxgazxvtcwzv1ukubi2__1__89rd7,
            R.drawable.toxgazxvtcwzv1ukubi2__1__89rd7,
            R.drawable.toxgazxvtcwzv1ukubi2__1__89rd7,
            R.drawable.toxgazxvtcwzv1ukubi2__1__89rd7,
            R.drawable.toxgazxvtcwzv1ukubi2__1__89rd7,
            R.drawable.toxgazxvtcwzv1ukubi2__1__89rd7,
            R.drawable.toxgazxvtcwzv1ukubi2__1__89rd7,

        );
        titleList = arrayOf(
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten", /* !!! Hit visitElement for element type: class org.jetbrains.kotlin.nj2k.tree.JKErrorExpression !!! */
        )

        otherlistofmonths = arrayOf(
            "jan",
            "feb",
            "march",
            "april",
            "may",
            "june",
            "july",
            "august",
            "september",
            "october", /* !!! Hit visitElement for element type: class org.jetbrains.kotlin.nj2k.tree.JKErrorExpression !!! */
        )
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)


        numbersList = arrayListOf()
        getData()
    }
    private fun getData(){
        for (i in imageList.indices){
            val numberClass = NumbersClass(imageList[i], titleList[i],"harmony",otherlistofmonths[i])
            numbersList.add(numberClass)
        }

        recyclerView.adapter = Adapter(numbersList)
    }
}
