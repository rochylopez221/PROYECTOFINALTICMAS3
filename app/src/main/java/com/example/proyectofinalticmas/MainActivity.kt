package com.example.proyectofinalticmas

import android.content.Context
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {

    private lateinit var mvvm: Mvvm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mvvm = ViewModelProvider(this)[Mvvm::class.java]

        val edittext1: EditText= findViewById(R.id.edittext1)
        val edittext2: EditText= findViewById(R.id.edittext2)
        val compareButton: Button = findViewById(R.id.buttonComparar)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        compareButton.setOnClickListener{
            val value1 = edittext1.text.toString()
            val value2 = edittext2.text.toString()

            val areEqual = mvvm.compareValues(value1, value2)

            resultTextView.text = if (areEqual) {
                getString(R.string.same_values)
            } else {
                getString(R.string.different_values)
            }

            // Hide the keyboard
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(it.windowToken, 0)

        }

    }

}



