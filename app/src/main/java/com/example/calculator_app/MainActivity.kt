package com.example.calculator_app

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
        sayi1 = binding.editTextNumber.text.toString().toDoubleOrNull()
        sayi2 = binding.editTextNumber2.text.toString().toDoubleOrNull()

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    }

    fun arti (view : View)
    {


        if(sayi1 != null && sayi2 != null)
        {
            sonuc = sayi1!! + sayi2!!
            binding.textView.text = "Sonuç: ${sonuc}"

        }
        else{
            binding.textView.text = "Lütfen numara giriniz: "
        }
    }
    fun eksi(view : View)
    {
        if(sayi1 != null && sayi2!=null) {
            sonuc = sayi1!! - sayi2!!
            binding.textView.text = " Sonuc: ${sonuc}"
        }
        else
        {
            binding.textView.text ="Lütfen numara giriniz: "
        }
    }
    fun bolu (view : View)
    {
        if(sayi1 != null && sayi2!=null) {
            sonuc = sayi1!! / sayi2!!
            binding.textView.text = " Sonuc: ${sonuc}"
        }
        else
        {
            binding.textView.text ="Lütfen numara giriniz: "
        }
    }
    fun carpi (view : View)
    {
        if(sayi1 != null && sayi2!=null) {
            sonuc = sayi1!! * sayi2!!
            binding.textView.text = " Sonuc: ${sonuc}"
        }
        else
        {
            binding.textView.text ="Lütfen numara giriniz: "
        }
    }
}