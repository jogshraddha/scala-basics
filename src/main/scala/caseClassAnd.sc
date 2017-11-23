case class Student(name: String, id: Int)


val student = Student("abc", 1)
val yetAnotherStudent = Student("abc", 1)

if (student == yetAnotherStudent) {
  println(student + " and " + yetAnotherStudent + " are the same.")
} else {
  println(student + " and " + yetAnotherStudent + " are different.")
}