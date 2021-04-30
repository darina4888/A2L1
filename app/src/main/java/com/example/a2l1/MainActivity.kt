package com.example.a2l1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.example.a2l1.R

class MainActivity : AppCompatActivity() {

    private val tag = "mainActive"
    private val tagInd = "index"
    private val tagUntil = "until"
    private val tagStep = "step"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataClass = DataClass(10, 20)
        val copy = dataClass.copy(20, 50)

        findViewById<Button>(R.id.btn).setOnClickListener{
            Toast.makeText(this,
                    "Sum dataClass: ${dataClass.c} \n Sum copyData: ${copy.c}",
                    Toast.LENGTH_SHORT).show()

        }

        findViewById<Button>(R.id.btnObj).setOnClickListener{
            Toast.makeText(this,
                    "Object data: ${ObjectClass.getOurRepository()}",
                    Toast.LENGTH_SHORT).show()

        }

        val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        for(i in array) {
            Log.i(tag, "${i} \n")
        }

        for(i in array.indices) {
            Log.i(tagInd, "${array[i]} \n")
        }

        for(i in 0 until 7) {
            Log.i(tagUntil, "${i} \n")
        }

        for(i in 10 downTo 1 step 2) {
            Log.i(tagStep, "${i} \n")
        }

        for(i in 0..10) {
            Log.i(tag, "${i} \n")
        }

        val iterator = array.iterator()
        iterator.forEach {
            Log.i(tag, "The element is $it \n")
        }
    }
}