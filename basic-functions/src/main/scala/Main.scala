import scala.io.Source

object Main extends App {
  println("Scala Program")
  println(BasicSum(1,2))
  FileRead("/home/jahans/repos/scala/basic-functions/resources/test-read-file.txt")

  def BasicSum (a:Int, b:Int): Int ={
    return a+b
  }

  def FileRead(fileName:String):Unit ={

    for (line <- Source.fromFile(fileName).getLines){
      println(line)
    }

  }
}


