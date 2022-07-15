package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

//This is Kotlin file is where we're going to handle user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Show the layout file: activity_main
        setContentView(R.layout.activity_main)

        // Display customized to show "Hello from {name}"
        //User can tap a button to change the text color of the label
        //1. Add a button to our layout

        //Get a reference to button
        findViewById<Button>(R.id.button).setOnClickListener {
            //Handle button tap
            //2. change the color of text
            Log.i("Gideon","Tapped on button")
            //1. Get a reference to the text view
            //2.Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }
        //2. Set up a logic to know when the user has tapped on button


    }
}