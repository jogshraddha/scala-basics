/**
  * Created by synerzip on 20/11/17.
  */
class Greeter(prefix: String, suffix: String) {
  def greet(name: String): Unit =
    println(prefix + name + suffix)
}

