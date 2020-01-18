package Assignment

object One_Palindrome {

  def pal(x:List[Int]):String = {
    if(x==x.reverse) return "a Palindrome List \n"
    else return "NOT Palindrome \n"
  }

  def main(args:Array[String]):Unit = {

    val l1 = List(1,2,3,4,5)
    val l2 = List(3,5,7,5,3)

    println(l1 + " : List is " + pal(l1))
    println(l2 + " : List is " + pal(l2))

  }
}

// Problem Statement and Solution
/*
1) Find out whether a list passed as input is a palindrome or not.
Ex: List(1, 2, 3, 2, 1) is a palindrome
 */

/* OUTPUT
List(1, 2, 3, 4, 5) : List is NOT Palindrome

List(3, 5, 7, 5, 3) : List is a Palindrome List
 */