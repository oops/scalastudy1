/**
  * Created by student on 2016-11-08.
  */
object Futuretest {
  // src/main/scala/progscala2/typelessdomore/futures.sc
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.Future

  // 쓸모는 없는데 바쁜 일 ;)
  def doWork(index: Int): Int = {
    val sl = math.random * 1000
    println(s"============Index $index  sleep: $sl")
    Thread.sleep(sl.toLong)
    index
  }

  def main(args: Array[String]): Unit = {
    (1 to 5) foreach { index =>
      val future = Future {
        doWork(index)
      }
      future onSuccess {
        case answer: Int => println(s"Success! returned: $answer")
        //case _  => println(s"Success! returned?")
      }
      future onFailure {
        case th: Throwable => println(s"FAILURE! returned: $th")
        //case _ => println(s"FAILURE! returned?")
      }
    }

    Thread.sleep(1000) // '작업' 이 끝날 때까지 충분히 기다린다.
    println("Finito!")
  }
}
