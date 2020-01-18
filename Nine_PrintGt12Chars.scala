package Assignment

object Nine_PrintGt12Chars {

  def main(args: Array[String]): Unit = {

    //read the file
    val fileSample = scala.io.Source.fromFile("/home/ravindra/fileSample.txt").getLines.toList

    //convert the lines into words
    val wordList = fileSample.map(rec => rec.split(" ")).flatten

    //Find only words which has more then 12 characters
    val listOfGr12Char = wordList.filter(w => w.length>12)

    //print those words
    listOfGr12Char.foreach(println)
  }

}


// Problem Statement and Solution
/*
9) Write a Scala code snippet that reads a file and prints all words with more
than 12 characters to the console.
 */

/* INPUT from LFS /home/ravindra/fileSample.txt
The biodiversity of this lake is extremely high, with several dozen species of fish and birds living in or near it
Of all the different environments on Earth, the ocean has the highest level of biodiversity, with the widest array of species calling it home
The Amazon Rainforest has an extremely high level of biodiversity, with many species of mammals, reptiles, insects, amphibians, and birds calling it home
On a technicality, a human city has a very low level of biodiversity since it is mostly occupied by one species
You can find a great deal of biodiversity in your own backyard, because there are many species of insects living there
My concentration was disturbed by the sound of a lawnmower outside my office window
If you’re sleepy, you’ll find it difficult to maintain the concentration required for safe driving
Flying a jet requires the pilot's full concentration
When you’re called up to bat, it’s important to maintain your concentration on the ball
The difficult exam demanded my complete concentration
Being the first one in my family to graduate from college is an accomplishment that I’m very proud of
After saving to buy a home for several years, Tracy was finally able to reach this accomplishment
Tara’s doctor agreed that losing fifty pounds in a year was quite an accomplishment
Every time my daughter earns all A’s on their report card, I reward her with ice cream for her accomplishment
Becoming the youngest fire chief in the state, John’s family was very proud of his professional accomplishment
*/

/* OUTPUT
biodiversity,
biodiversity,
technicality,
concentration
concentration
concentration
concentration
concentration
accomplishment
accomplishment
accomplishment
accomplishment
accomplishment
 */