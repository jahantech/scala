import scala.io.Source

object Main extends App {
  val Timer = new FunctionTimers()
  val CVC = new ClosedVarsClass()
  Timer.StartTimer()
  println("Scala Program")
  CVC.GetPrivateVarVal()
  println(BasicSum(1,2))
  FileRead("/home/jahans/repos/scala/basic-functions/resources/test-read-file.txt")
  MultiplicationFactor.ByTwo(10)
CVC.GetPrivateVarVal()
  MultiplicationFactor.ByTen(100)
CVC.GetPrivateVarVal()
  MultiplicationFactor.JustLocal()

  println(AnotherObject.ObjectsElem)
  Timer.EndTimer()

  val alphanum = new AlphaNumeric(3333)
  println(alphanum.Test)
  Timer.GetTime()

  CVC.GetPrivateVarVal()
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

case class AlphaNumeric(Test:Int)