def maybeItWillReturnSomething(flag: Boolean): Option[String] = {
  if (flag) Some("Found value") else None
}

maybeItWillReturnSomething(false)
maybeItWillReturnSomething(true)

maybeItWillReturnSomething(true).get
maybeItWillReturnSomething(false).getOrElse("Blank")

maybeItWillReturnSomething(true) match {
  case Some(value) => println(value)
  case None => println("None")
}


