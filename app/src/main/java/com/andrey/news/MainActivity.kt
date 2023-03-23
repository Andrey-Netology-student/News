package com.andrey.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.navigation.ui.setupWithNavController
import com.andrey.news.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater) //Инициализируем _binding. layoutInflater пишется с маленькой буквы!
        setContentView(R.layout.fragment_splash)
        Handler(Looper.myLooper()!!).postDelayed({
            setContentView(binding.root)
            binding.bottomNavMenu.setupWithNavController(
                navController = binding.nav_host_fragment.findNavController()
            )
        }, 5000)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}