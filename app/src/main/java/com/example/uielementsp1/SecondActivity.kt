package com.example.uielementsp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

var birthday = "01/01/2020"
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        findViewById<Button>(R.id.comButton).setOnClickListener{ getTxts() }
        val calendarView = findViewById<CalendarView>(R.id.calendarView)
        calendarView.setOnDateChangeListener{calendarView: CalendarView, year: Int, month: Int, day: Int ->
            birthday =  ""+ (month + 1) + "/" + day + "/" + year
    }
}
    private fun getTxts() {
        val xfn = intent.extras!!.getString("f_name")
        val xln = intent.extras!!.getString("l_name")
        val xemail = intent.extras!!.getString("email")
        val xage = intent.extras!!.getString("age")
        val xpn = intent.extras!!.getString("p_num")

        val intent = Intent(this@SecondActivity, ThirdActivity::class.java)
        intent.putExtra("f_name", xfn.toString())
        intent.putExtra("l_name", xln.toString())
        intent.putExtra("email", xemail.toString())
        intent.putExtra("age", xage.toString())
        intent.putExtra("p_num", xpn.toString())
        intent.putExtra("birthday", birthday)

        startActivity(intent)
    }
}
