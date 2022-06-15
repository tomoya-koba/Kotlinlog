package jp.techacademy.tomoya.kobayashi5.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable {
    constructor(name: String, age: Int, hobby:String): super(name, age, hobby){
    }

    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年齢は" + this.age + "歳です。")
    }

    override fun think() {
        Log.d("kotlintest", this.name + "は" + this.hobby + "について考える。")
    }
}