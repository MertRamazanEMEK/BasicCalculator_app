package com.example.calculator_app

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculator_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var sayi1 : Double? = null
    var sayi2 : Double? = null
    var sonuc : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
    }

    @SuppressLint("SetTextI18n")
    fun arti (view : View)
    {


        if(sayi1 != null && sayi2 != null)
        {
            sayi1 = binding.editTextNumber.text.toString().toDoubleOrNull()
            sayi2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
            sonuc = sayi1!! + sayi2!!
            binding.textView.text = "Sonuç: ${sonuc}"

        }
        else{
            binding.textView.text = "Lütfen numara giriniz: "
        }
    }
    @SuppressLint("SetTextI18n")
    fun eksi(view : View)
    {
        sayi1 = binding.editTextNumber.text.toString().toDoubleOrNull()
        sayi2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
        if(sayi1 != null && sayi2!=null) {
            sonuc = sayi1!! - sayi2!!
            binding.textView.text = " Sonuc: $sonuc"
        }
        else
        {
            binding.textView.text ="Lütfen numara giriniz: "
        }
    }
    @SuppressLint("SetTextI18n")
    fun bolu (view : View)
    {
        sayi1 = binding.editTextNumber.text.toString().toDoubleOrNull()
        sayi2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
        if(sayi1 != null && sayi2!=null) {
            sonuc = sayi1!! / sayi2!!
            binding.textView.text = " Sonuc: $sonuc"
        }
        else
        {
            binding.textView.text ="Lütfen numara giriniz: "
        }
    }

    @SuppressLint("SetTextI18n")
    fun carpi (view : View)
    {
        sayi1 = binding.editTextNumber.text.toString().toDoubleOrNull()
        sayi2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
        if(sayi1 != null && sayi2!=null) {
            sonuc = sayi1!! * sayi2!!
            binding.textView.text = "Sonuç: ${sonuc}"
        }
        else
        {
            binding.textView.text ="Lütfen numara giriniz: "
        }
    }
}