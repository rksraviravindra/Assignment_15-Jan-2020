package Assignment

object Five_LtEqGt {

  def ltEqGt(values: Array[Int], v: Int):(Int,Int,Int) = {

    val lt = values.partition(x => x<v)._1.length
    val el = values.partition(y => y==v)._1.length
    val gt = values.partition(z => z>v)._1.length

    (lt,el,gt)
  }

  def main(args: Array[String]): Unit = {
    val list1 = Array(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    val out = ltEqGt(list1,6)
    println("(Less_Values_Count, Equal_Values_Count, Greater_Values_Count) : = "+out)
  }
}

// Problem Statement and Solution
/*
5) Write a function lteqgt(values: Array[Int], v: Int) that returns a triple(tuple with 3 fields) containing
the counts of values less than v , equal to v , and greater than v .
 */

/* OUTPUT
(Less_Values_Count, Equal_Values_Count, Greater_Values_Count) : = (5,1,9)
 */