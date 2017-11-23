
//pattern matching
trait Animal
case class Dog(name: String) extends Animal
case class Cat(name: String) extends Animal
case class Rat(name: String) extends Animal
case object Woodpecker extends Animal

def determineType(x: Animal): String = x match {
  case Dog(s) => "Got a Dog, name = " + s
  case _: Cat => "Got a Cat (ignoring the name)"
  case Woodpecker => "That was a Woodpecker"
  case _ => "That was something else"
}

println(determineType(Dog("Rocky1")))
println(determineType(Cat("Rusty the Cat")))
println(determineType(Woodpecker))
println(determineType(Rat("m")))


/*def describe(x: Any) = x match {
  case 5 => "five"
  case true => "truth"
  case "hello" => "hi!"
  case Nil => "the empty list"
  case _ => "something else"
}

describe(5)*/
