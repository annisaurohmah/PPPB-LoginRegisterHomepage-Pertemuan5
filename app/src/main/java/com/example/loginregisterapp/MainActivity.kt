package com.example.loginregisterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginregisterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivityLifecycle"
    private lateinit var binding: ActivityMainBinding
    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            buttonReg.setOnClickListener {
                val intentToSecondActivity =
                    Intent(this@MainActivity, SecondActivity::class.java)
                        .apply {
                            putExtra(EXTRA_NAME, usernameFieldInner.text.toString())
                            putExtra(EXTRA_EMAIL, emailFieldInner.text.toString())
                            putExtra(EXTRA_PHONE, phoneFieldInner.text.toString()) }
                startActivity(intentToSecondActivity)
            }
            loginLink.setOnClickListener {
                Intent(this@MainActivity, ThirdActivity::class.java).apply {
                        startActivity(this)
                    }
            }
        }
    }
}