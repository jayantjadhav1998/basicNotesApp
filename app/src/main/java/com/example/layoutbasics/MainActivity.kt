package com.example.layoutbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.note_layout.*
  private const val TAG="ManActivity"
  private const val TEXT_CONTENTS="TextContent"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // textview?.findViewById<TextView>(R.id.tvnotelayout)
        Log.d(TAG,"onCreate: Called")
        setContentView(R.layout.note_layout)
        val userinput:EditText=findViewById(R.id.etName)
        val button:Button=findViewById(R.id.btn)
        tvnotelayout.text=""
        tvnotelayout.movementMethod=ScrollingMovementMethod()
        userinput.setText("")
        button.setOnClickListener {
            tvnotelayout.append(userinput.text.toString())
            tvnotelayout.append("\n")
            // userinput.text.clear()
            userinput.setText("")
            Log.d(TAG,"onClick: Called")

        }
    }

    override fun onStart() {
        Log.d(TAG,"onStart: Called")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG,"onRestoreInstanceState: Called")
        super.onRestoreInstanceState(savedInstanceState)
            tvnotelayout.text=savedInstanceState.getString(TEXT_CONTENTS,"")
    }

    override fun onResume() {
        Log.d(TAG,"onResume: Called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"onPause: Called")
        super.onPause()
    }



    override fun onStop() {
        Log.d(TAG,"onStop: Called")
        super.onStop()
    }
    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG,"onSaveInstanceState: Called")
        super.onSaveInstanceState(outState)
        outState.putString(TEXT_CONTENTS,tvnotelayout.text.toString())
    }

    override fun onRestart() {
        Log.d(TAG,"onRestart: Called")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy: Called")
        super.onDestroy()
    }
}
