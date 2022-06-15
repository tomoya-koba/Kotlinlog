package jp.techacademy.tomoya.kobayashi5.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("小林",32, "ポーカー")

        human1.say()
        human1.think()

        val human2 = Human("友哉",5, "ドラえもん")

        human2.say()
        human2.think()

    }
}