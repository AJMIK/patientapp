package com.ajmi.patientapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun patientdetails(view: View) {
        var getPname=findViewById<EditText>(R.id.pname)
        var getDctr=findViewById<EditText>(R.id.dctr)
        var getSym=findViewById<EditText>(R.id.sym)
        Toast.makeText(this,getPname.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getDctr.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getSym.text.toString(),Toast.LENGTH_SHORT).show()
    }
}