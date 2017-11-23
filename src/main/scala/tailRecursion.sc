import scala.annotation.tailrec

//Examples to show recursion and memory allocation
def countDown(n: Int): Unit = {
    if (n > 0) {
        println(n)
        countDown(n - 1)
    }
}

countDown(5)

def countUp(n: Int): Unit = {
    if (n > 0) {
        countUp(n - 1)
        println(n)
    }
}

countUp(5)


//factorial example with tail recursion
def fact(n: Int): Int = {
  if(n == 0)
    1
  else
    n* fact(n -1)
}

fact(5)



def factRec(acc: Int, n: Int): Int = {
  if(n == 0)
    acc
  else
    factRec(n* acc, n -1)
}

factRec(1, 5)

def factRec(n : Int): Int = {
  @tailrec
  def internal(acc: Int, n: Int): Int = {
    if(n == 0)
      acc
    else
      internal(n* acc, n -1)
  }

  internal(1, n)
}

factRec(5)

