package com.example.a38

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun main(args: Array<String>) {
            //입력 받을때 쓰이는 함수!
            val (a, b) = readLine()!!.split(' ').map(String::toInt)
            for(i in 1..b){
                for(j in 1..a){
                    print("*")
                }
                println()
            }
        }
    }
}