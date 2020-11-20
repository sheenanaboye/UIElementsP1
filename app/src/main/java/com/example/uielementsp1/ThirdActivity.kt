package com.example.uielementsp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val xfn = intent.extras!!.getString("f_name")
        val xln = intent.extras!!.getString("l_name")
        val xemail = intent.extras!!.getString("email")
        val xage = intent.extras!!.getString("age")
        val xpn = intent.extras!!.getString("p_num")
        val xbd = intent.extras!!.getString("birthday")

        val fn = findViewById<TextView>(R.id.fn)  as TextView
        val ln = findViewById<TextView>(R.id.ln)  as TextView
        val a = findViewById<TextView>(R.id.a)  as TextView
        val bd = findViewById<TextView>(R.id.bd)  as TextView
        val e = findViewById<TextView>(R.id.e)  as TextView
        val pn = findViewById<TextView>(R.id.pn)  as TextView


        fn.append(" $xfn")
        ln.append(" $xln")
        a.append(" $xage")
        bd.append(" $xbd")
        e.append(" $xemail")
        pn.append(" $xpn")
    }
}