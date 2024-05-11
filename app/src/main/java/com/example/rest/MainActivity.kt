package com.example.rest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonGetData = findViewById<Button>(R.id.buttonGetData)
        val textViewData = findViewById<TextView>(R.id.textViewData)

        buttonGetData.setOnClickListener {
            val service = ZipCodeClient.service
            val call = service.getZipInfo("us", "33162")
            call.enqueue(object : Callback<Model> {
                override fun onResponse(call: Call<Model>, response: Response<Model>) {
                    if (response.isSuccessful) {
                        val data = response.body()
                        // Обновляем TextView с полученными данными
                        textViewData.text = "Данные: ${data?.toString()}"
                    } else {
                        // Обработка ошибки
                    }
                }

                override fun onFailure(call: Call<Model>, t: Throwable) {
                    // Обработка ошибки
                }
            })
        }
    }
}