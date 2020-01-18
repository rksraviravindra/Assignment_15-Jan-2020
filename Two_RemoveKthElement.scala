package Assignment

object Two_RemoveKthElement {
  def main(args: Array[String]): Unit = {

    def dropEle(ints: List[Int], k: Int) ={
      val newList = ints.take(k-1) ::: ints.takeRight(ints.length-k) //remove element and form an new List
      val delEle = ints.take(k).last    // removed element
      (newList, delEle)     // returns tuple( list, element)
    }

    val li = List(1,2,3,4,5,6,7,8,9,10)
    val out = dropEle(li, 4)

    println(out)
  }
}


// Problem Statement and Solution
/*
2) Remove the Kth element from a list.
Return the list and the removed element in a Tuple. Elements are numbered from 0.
 */

/* OUTPUT
(List(1, 2, 3, 5, 6, 7, 8, 9, 10),4)
 */