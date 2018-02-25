import scala.io.Source

object Main extends App {
  println("Scala Program")
  println(BasicSum(1,2))
  FileRead("/home/jahans/repos/scala/basic-functions/resources/test-read-file.txt")
  MultiplicationFactor.ByTwo(10)

  MultiplicationFactor.ByTen(100)

  MultiplicationFactor.JustLocal()
  
  def BasicSum (a:Int, b:Int): Int ={
    return a+b
  }

  def FileRead(fileName:String):Unit ={

    for (line <- Source.fromFile(fileName).getLines){
      println(line)
    }

  }
}


object MultiplicationFactor {

  var local_x:Int = 2
  def ByTwo(x:Int):Unit ={
    println(x*2)
  }

  def ByTen(x:Int):Unit ={
    println(x*10)
  }

  def JustLocal():Unit ={
    println(local_x)
  }
}

