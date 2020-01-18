package Assignment

object Four_MinMaxFromArray {

  def minMax(values:Array[Int]):(Int,Int) = {
    val sortArr = values.sortBy(x => x)
    (sortArr(0),sortArr(sortArr.length-1))
  }

  def main(args: Array[String]): Unit = {

    val arr = Array(10,2,4,32,23,33,1)
    val out = minMax(arr)

    println("(Minimum and Maximum) : "+out)
  }
}

// Problem Statement and Solution
/*
4) Write a function minmax(values: Array[Int]) that returns a pair containing the
smallest and largest values in the array.
 */

/* OUTPUT
(Minimum and Maximum) : (1,33)
 */
