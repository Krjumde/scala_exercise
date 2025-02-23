package com.krj.exercise_2

class RunClass2 {

  def testRun() = {
    val x1 = new Class2()
    val x2 = new Class2()
    println(x1 == x2) //false

    var c1 = Object2;
    var c2 = Object2
    println(c1 == c2) //ture
  }


}
