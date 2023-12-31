package com.coolyeah.ecocleanx.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coolyeah.ecocleanx.R
import com.coolyeah.ecocleanx.databinding.ActivityOnboardingEndBinding

class OnboardingEndActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardingEndBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingEndBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMasuk.setOnClickListener{
            startActivity(Intent(this, SigninActivity::class.java))
            finish()
        }

        binding.btnDaftar.setOnClickListener{
            startActivity(Intent(this, SignupActivity::class.java))
            finish()
        }
    }
}