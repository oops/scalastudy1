object test2 {
  def m1[A](a: A)(f: A => String) = f(a)

  m1(100)(i => s"$i+$i")
}