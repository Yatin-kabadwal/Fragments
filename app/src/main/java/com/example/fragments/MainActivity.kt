package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragments.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonClock = findViewById<Button>(R.id.btnClock)
        val buttonExam = findViewById<Button>(R.id.btnExam)
        val buttonValidate = findViewById<Button>(R.id.btnValidate )


        buttonClock.setOnClickListener {
            replaceFrameWithFragment(Clock_Fragment())

        }

        buttonExam.setOnClickListener {

            replaceFrameWithFragment(Exam_Fragment())
        }

        buttonValidate.setOnClickListener {
            replaceFrameWithFragment(LoginFragment())
        }


    }

    private fun replaceFrameWithFragment(frag: Fragment) {

        val fragManager = supportFragmentManager
        val fraTransaction = fragManager.beginTransaction()
        fraTransaction.replace(R.id.frameLayout,frag)
        fraTransaction.commit()

    }
}