package com.example.ageinminutes

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe =findViewById<Button>(R.id.chosedate)
        //val textbutton =findViewById<TextView>(R.id.tvSelectedDate)

        btnClickMe.setOnClickListener {view ->
            clickDatePicker(view)
            Toast.makeText(this,"button is working", Toast.LENGTH_LONG).show()
        }
    }
    // Creating function
    fun clickDatePicker(view:View){

        val myCalender =Calendar.getInstance()
        val year=myCalender.get(Calendar.YEAR)
        val month=myCalender.get(Calendar.MONTH)
        val day=myCalender.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener {
                    view, i, i2, i3 ->
            Toast.makeText(this,"The chosen year is $i,the month is $i2 and the day is $i3",
                Toast.LENGTH_LONG).show()
               val textbutton =findViewById<TextView>(R.id.tvSelectedDate)
                val textbutton2 =findViewById<TextView>(R.id.tvSelectedDateInMinutes)


                val selectedDate ="$i3/${i2+1}/$i"
                 textbutton.setText(selectedDate)

                val sdf=SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)

                val theDate = sdf.parse(selectedDate)
                val selectedDateInMinutes =theDate!!.time/60000
                val currentDate=sdf.parse(sdf.format(System.currentTimeMillis()))
                val currentDateInMinutes =currentDate!!.time/60000
                val differenceInMinutes=currentDateInMinutes-selectedDateInMinutes
                textbutton2.setText(differenceInMinutes.toString())

            },year
        ,month
        ,day).show()
    }

}