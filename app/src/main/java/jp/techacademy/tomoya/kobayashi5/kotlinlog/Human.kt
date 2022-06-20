package jp.techacademy.tomoya.kobayashi5.kotlinlog

import android.util.Log

class Human: Animal, Thinkable {

    var hobby = "どうせ初期化するので何か適当に入れておく"
    constructor(name: String,age: Int,hobby: String): super(name,age){
        this.hobby = hobby
    }

    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年齢は" + this.age + "歳です。")
    }

    override fun think() {
        Log.d("kotlintest", this.name + "は" + this.hobby + "について考える。")
    }
}