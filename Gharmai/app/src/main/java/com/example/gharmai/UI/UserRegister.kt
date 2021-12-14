package com.example.gharmai.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.gharmai.R

class UserRegister : AppCompatActivity() {

    private lateinit var GenderSpinner:Spinner

    val GenderType = arrayOf("Male,Female,Other")
    var gender = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_register)

        GenderSpinner = findViewById(R.id.Genderspinner)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, GenderType)
        GenderSpinner.adapter = adapter
        GenderSpinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    gender= parent?.getItemAtPosition(position).toString()

                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }
    }
}