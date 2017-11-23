class Example {
  private var _name: String = ""
  private var _id: Int = 101

  def name = _name
  def name_= (value:String):Unit = _name = value
  def id = _id
  def id_= (value:Int):Unit = _id = value
}

var ex = new Example()

ex.id = 102
ex.name = "abc"

