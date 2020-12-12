package com.example.studentinfoapp

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

    fun buttonclickevent(view: View) {
        var getName=findViewById<EditText>(R.id.name)
        var getRoll=findViewById<EditText>(R.id.roll)
        var getAdm=findViewById<EditText>(R.id.adm)
        var getColl=findViewById<EditText>(R.id.coll)
        var getPname=findViewById<EditText>(R.id.pname)
        var getPmail=findViewById<EditText>(R.id.pmail)
        var getPmob=findViewById<EditText>(R.id.pmob)
        var getPuser=findViewById<EditText>(R.id.puser)
        var getPass=findViewById<EditText>(R.id.pass)
        var getCpass=findViewById<EditText>(R.id.cpass)
        Toast.makeText(this,getName.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getRoll.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getAdm.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getColl.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getPname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getPmail.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getPmob.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getPuser.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getPass.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getCpass.text.toString(),Toast.LENGTH_LONG).show()

    }
}