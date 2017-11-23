//original function
//def add(x: Int, y: Int): Int = x + y

//And after currying:
//def add(x:Int) = (y:Int) => x + y

//def curriedAdd = (add _).curried

//Simple syntax for curried functions
def add(x: Int)(y: Int): Int = x + y
//add(1, 2)   // 3
//add(7, 3)   // 10

add(1)(3)



val addOne = add(1)_
//
addOne(6)



