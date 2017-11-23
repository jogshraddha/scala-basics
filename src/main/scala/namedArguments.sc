def printName(first: String = "abc", last: String): Unit = {
  println(s"First :  ${first} and Last: ${last}")
}

printName(last = "pqr", first = "xyz")

printName(last = "P")
