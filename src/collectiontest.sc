//val numbers = List(1,2,3,4 )
//
//Set(1,1,2)
//
//val hostPort = ("localhost", 80)
//
//numbers map ( _ * 2 )
//
//
//def timesTwo(i: Int): Int  = i * 2
//numbers map timesTwo
//
//numbers.foreach(  println(_) )
//

//======================================================

val numbers = List(1,2,3,4,5,6,7,8,9,10 )

numbers.foldLeft(0){( m: Int, n:Int ) => println ( "m: " + m + " n: " + n ) ; m + n }
numbers.foldRight(0){( m: Int, n:Int ) => println ( "m: " + m + " n: " + n ) ; m + n }

numbers.fold(0){( m: Int, n:Int ) => println ( "m: " + m + " n: " + n ) ; m + n }
numbers.fold(false){( m: Int, n:Int ) => println ( "m: " + m + " n: " + n ) ; m + n }
numbers.takeRight(4)
numbers.drop(6)
