val nestedNumbers = List(List(1,2),List(3,4))
val nestedNumbers2 = List(nestedNumbers, nestedNumbers);


nestedNumbers.map(( x: List[Int] ) => x.map( _ * 2 ))


nestedNumbers.flatMap( ( x: List[Int] ) => x.map( _ * 2 ))

nestedNumbers.flatten


//nestedNumbers2.map(( x: List[Int] ) => x.map( _ * 2 ))
//nestedNumbers.flatMap( ( x: List[Int] ) => x.map( _ * 2 ))

nestedNumbers2
nestedNumbers2.flatten
//nestedNumbers2.flatten.flatten.flatten

val numbers = List(1,2,3,4)
val numbers2 = numbers.map( (x: Int) => x * 2 )
numbers


class MyList[A] {
  def const[B >: A](x : B , tail : MyList[A]) = new MyList[B]

  def ::[B >: A] (x: B) : MyList[B] = const(x, this)
}

object test3 {
  val a1 : MyList[Cola] = new MyList
  val a2 = new Cola :: a1
  val a3 = new TonicWater :: a2
}