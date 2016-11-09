object scalastudy {
  println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet

  1 + 1 //> res0: Int(2) = 2


}


// 파셜 펑션 사용하기.
val pf1: PartialFunction[Any, String] = {
  case s: String => if (s.equals("어쩌구")) "YES" else "NO"
}

printf("%s \n", pf1("오호"))
printf("%s", pf1("어쩌구"))


val pf2: PartialFunction[Any, String] = {
  case s: String if s.equals("어쩌구") => "YES"
  case _ => "NO"
}

printf("%s \n", pf2("오호"))
printf("%s", pf2("어쩌구"))

case class Point(x: Double = 0.0, y: Double = 0.0) {
  def shift(dx: Double = 0.0, dy: Double = 0.0) = {
    copy(x + dx, y + dy)
  }
}

val p1 = new Point(1.1, 2.2)
p1.shift(0.1, 0.2)
