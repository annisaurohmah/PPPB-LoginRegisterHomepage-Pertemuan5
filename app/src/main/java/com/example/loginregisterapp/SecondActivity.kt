package com.example.loginregisterapp

import android.app.Activity
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import com.example.loginregisterapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private val EXTRA_NAME = "EXT_NAME"
    private lateinit var binding: ActivitySecondBinding

    companion object{
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val username = intent.getStringExtra(MainActivity.EXTRA_NAME)
        val email = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val phone = intent.getStringExtra(MainActivity.EXTRA_PHONE)

// Buat SpannableString untuk masing-masing teks
        val spannableUsername = SpannableString("Welcome $username")
        val spannableEmail = SpannableString("Your $email has been activated")
        val spannablePhone = SpannableString("Your $phone has been registered")

// Tentukan warna untuk masing-masing teks
        val colorBlue = ForegroundColorSpan(ContextCompat.getColor(this, R.color.blue))

// Terapkan warna ke masing-masing teks
        spannableUsername.setSpan(colorBlue, "Welcome".length, spannableUsername.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableEmail.setSpan(colorBlue, "Your".length, "Your".length + (email?.length ?:0), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannablePhone.setSpan(colorBlue, "Your".length, "Your".length + (phone?.length?:0), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)


        with(binding) {
            usernameField.text = spannableUsername
            emailField.text = spannableEmail
            phoneField.text = spannablePhone
        }
    }

}