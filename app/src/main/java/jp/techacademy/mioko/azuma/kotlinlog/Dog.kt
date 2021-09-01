package jp.techacademy.mioko.azuma.kotlinlog

import android.util.Log

open class Dog: Animal, Movable {
    /*
    //プロパティ
    var name: String
    var age: Int

    //コンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
    */
    //引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {
    }

    //Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
    //Movableインターフェイスのメソッドをオーバーライド
    override  fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }

    /*
    //メソッド
    open fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
    */
}