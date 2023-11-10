package com.example.midtherm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var phoneText: EditText
    private lateinit var smsText: EditText
    private lateinit var passText: EditText
    private lateinit var confPassText: EditText

    private lateinit var restButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        phoneText = findViewById(R.id.editTextNumber)
        smsText = findViewById(R.id.editTextText2)
        passText = findViewById(R.id.editTextText3)
        confPassText = findViewById(R.id.editTextText4)

        restButton = findViewById(R.id.button)

        restButton.setOnClickListener {


            val phone = phoneText.text.toString()
            val sms = smsText.text.toString()
            val pass = passText.text.toString()
            val confPass = confPassText.text.toString()

            val isValidPassword = Regex("^(?=.*[0-9]).{8,}$").matches(pass)



            if (phone.length == 9 && sms.length == 4  && pass==confPass && pass.length >= 8 && isValidPassword){

                Toast.makeText(applicationContext, "You will receive your new password", Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(applicationContext, "Your information is not valid ", Toast.LENGTH_SHORT).show()
            }
            
            




        }





    }
}