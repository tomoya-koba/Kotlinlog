package jp.techacademy.tomoya.kobayashi5.kotlinlog

abstract class Animal {

    open var name: String
    open var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    abstract fun say()

}