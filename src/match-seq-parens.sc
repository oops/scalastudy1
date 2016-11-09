// src/main/scala/progscala2/patternmatching/match-seq-parens.sc

val nonEmptySeq    = Seq(1, 2, 3, 4, 5)
val emptySeq       = Seq.empty[Int]
val nonEmptyMap    = Map("one" -> 1, "two" -> 2, "three" -> 3)

def seqToString2[T](seq: Seq[T]): String = seq match {
  case head1 +: tail1 => s"($head1 +: ${seqToString2(tail1)})"           // <1>
  case Nil => "(Nil)"
}

for (seq <- Seq(nonEmptySeq, emptySeq, nonEmptyMap.toSeq)) {
  println(seqToString2(seq))

}

def tupleDemo(expr: Any)= {
  expr match {
    case ( b, c ) => println("matched " + b + c )
    case ( a, b, c ) => println("matched " + a + b + c )
      case _ =>
  }
}

tupleDemo( ( "a " , 3, "-tuple"))
