import scala.io.StdIn

class Employee {
  var empid: Int = 0
  var empname: String = ""
  var designation: String = ""
  var salary: Double = 0.0

  def getEmployee(): Unit = {
    print("Enter Employee ID: ")
    empid = StdIn.readInt()

    print("Enter Employee Name: ")
    empname = StdIn.readLine()

    print("Enter Designation: ")
    designation = StdIn.readLine()

    print("Enter Salary: ")
    salary = StdIn.readDouble()
  }

  def showGrade(): Char = {
    if (salary < 10000) 'D'
    else if (salary >= 10000 && salary < 25000) 'C'
    else if (salary >= 25000 && salary < 50000) 'B'
    else 'A'
  }

  def showEmployee(): Unit = {
    println(s"\nEmployee ID: $empid")
    println(s"Employee Name: $empname")
    println(s"Designation: $designation")
    println(s"Salary: $salary")
    println(s"Grade: ${showGrade()}")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val emp = new Employee()
    emp.getEmployee()
    emp.showEmployee()
  }
}
