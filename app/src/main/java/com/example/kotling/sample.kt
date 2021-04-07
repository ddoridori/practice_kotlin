package com.example.kotling



fun main() {
    helloworld()
    println(add(4, 5))
    checkNum(1)
}

//4. 조건식

fun maxBy(a : Int, b : Int) :Int{
    if (a > b) {
        return a
    }else {
        return b
    }
}

fun maxBy2(a: Int, b:Int) : Int = if(a>b) a else b

fun checkNum(score : Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don`t konw")

    }

    var b = when(score){
        1-> 1
        2-> 2
        else -> 3

    }


    println ("b : ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

fun helloworld() {
    println("Hello world!")
}

fun add(a : Int, b : Int) : Int {
    return a+b
}

///2. val vs var
//val = value

fun hi() {

    val a : Int = 10//변할수없는
    var b : Int = 9 //변할수있는값

    b = 100
    println(b)

    val c : Int = 100
    var d = 100


}

//expression vs Statement
// 모든 코틀린은 1

//5.Array 크기를 할당해줘야함
/*
List 1. List(읽기전용) 2. MutableList(읽,쓰가능)

 */

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)
    val array2 = arrayOf(1,"d",3.4f)

    array[0] = 3
    list.get(0)



}