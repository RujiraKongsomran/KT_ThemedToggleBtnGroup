package com.rujirakongsomran.kt_themedtogglebtngroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.rujirakongsomran.kt_themedtogglebtngroup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        binding.fruitButtonGroup.setOnSelectListener {
            Toast.makeText(applicationContext, it.text, Toast.LENGTH_SHORT).show()
        }
        binding.btnDone.setOnClickListener {
            val text = binding.fruitButtonGroup.selectedButtons
            val fruitList = mutableListOf<String>()

            for (fruit in text) {
                fruitList.add(fruit.text)
            }
            Toast.makeText(applicationContext, "You selected $fruitList", Toast.LENGTH_SHORT).show()
        }
    }
}