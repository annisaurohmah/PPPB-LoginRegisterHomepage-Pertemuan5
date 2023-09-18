package com.example.loginregisterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginregisterapp.databinding.ActivitySecondBinding
import com.example.loginregisterapp.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            regLink.setOnClickListener {
                val IntentToMainActivity = Intent(this@ThirdActivity, MainActivity::class.java)
                startActivity(IntentToMainActivity)
            }
        }


    }

}