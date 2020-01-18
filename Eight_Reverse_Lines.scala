package Assignment

import java.io._

object Eight_Reverse_Lines {

  def main(args: Array[String]): Unit = {

    //Read the file from source for reverse lines
    val fileData = scala.io.Source.fromFile("/home/ravindra/sample.txt").getLines.toList
    fileData.foreach(println)

    //Read the file from source for reverse lines
    println("\n\nThis is the reversed data form file : ")

    val reverseData = fileData.reverse
    reverseData.foreach(println)

    //Write the output in the new file at given path
    val file = new File("/home/ravindra/reverse_file.txt")
    val bw = new BufferedWriter(new FileWriter(file))
    for (line <- reverseData) {
      bw.write(line + "\n")
    }
    bw.close()
  }
}

// Problem Statement and Solution
/*
8) Write a Scala code snippet that reverses the lines in a file (making the last
line the first one, and so on).
 */

/* INPUT from LFS /home/ravindra/sample.txt
This is Spark and Scala Class
This is Scala Class
This is Spark Mastering Class
This is Scala
This is Spark
*/

/* OUTPUT Written at LFS /home/ravindra/reverse_file.txt
This is Spark and Scala Class
This is Scala Class
This is Spark Mastering Class
This is Scala
This is Spark
 */