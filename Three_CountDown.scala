package Assignment

object Three_CountDown {

  def main(args: Array[String]): Unit = {

    //defined countDown from n to 0
    def countDown(n:Int):Unit = {
      for(itr <- n to 0 by -1){
        print(itr + "\t")
      }
    }

    countDown(10)
  }
}

// Problem Statement and Solution
/*
3) Write a function countdown(n: Int) that prints the numbers from n to 0.
 */

/* OUTPUT
10	9	8	7	6	5	4	3	2	1	0
 */