/**
  * Created by student on 2016-11-09.
  */
object MatchVariables {
  def main(args: Array[String]): Unit = {
    for {
      x <- Seq(1, 2, 2.7, "one", "two", 'four)
    } {
      val str = x match {
        case 1 => "int 1"
        case _: Int => "other int: " + x
        case _: Double => "a double: " + x
        case "one" => "string one"
        case _: String => "other string: " + x
        case _ => "unexpected"
      }
      println(str)
    }

    checkY(100)
  }

  def checkY(y: Int) = {
    for {
      x <- Seq(99, 100, 101)
    } {
      val str = x match {
        case `y` => "found y!"
        case i: Int => "int : " + i
      }
      println(str)
    }
  }

}
