package com.example.uielementsp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.nextPButton).setOnClickListener{getInfo()}
        findViewById<Switch>(R.id.numSwitch).setOnClickListener{getNumber(findViewById<Switch>(R.id.numSwitch).isChecked)}
        findViewById<SeekBar>(R.id.ageSeekBar).setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val age = findViewById<TextView>(R.id.ageText)  as TextView
                age.text = progress.toString()
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }
            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }

        })
    }
    private fun getInfo() {
        val f_name = findViewById<EditText>(R.id.firstname).text
        val l_name = findViewById<EditText>(R.id.lastname).text
        val email = findViewById<EditText>(R.id.email).text
        val age = findViewById<TextView>(R.id.ageText).text
        val p_num = findViewById<EditText>(R.id.phonenumber).text

        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("f_name",f_name.toString())
        intent.putExtra("l_name",l_name.toString())
        intent.putExtra("email",email.toString())
        intent.putExtra("age",age.toString())
        intent.putExtra("p_num",p_num.toString())

        startActivity(intent)
    }
    private fun getNumber(status: Boolean){
        val number = findViewById<EditText>(R.id.phonenumber) as EditText
        if(status){
            number.isVisible = true
        }else{
            number.isInvisible = true
        }
    }
}