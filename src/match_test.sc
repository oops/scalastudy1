object match_test {
  var booleans = Seq(true, false)

  for (bool <- booleans) {
    booleans match {
      case true => println("true")
      case false => println("false")
    }
  }

  //booleans foreach println


  for {
    x <- Seq(1, 2, 2.7, "one", "two", 'four)
  } {
    val str = x match {
      case 1 => "int 1"
      case _: Int => "other int: " + x
      case _: Double => "a double: " + x
      case "one" => "string one"
      case _: String => "other string: " + x
      case _ => "unexpected value: " + x
    }
    println(str)
  }

}