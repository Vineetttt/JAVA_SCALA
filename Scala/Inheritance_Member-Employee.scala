class Member{
  var Name : String = ""
  var age : Int = 0
  var phone : String =""
  var salary: Int = 0
  
  def getMember() : Unit ={
    print("Enter Name: ")
    this.Name = scala.io.StdIn.readLine()
    print("Enter Age: ")
    this.age = scala.io.StdIn.readInt()
    print("Enter Phone: ")
    this.phone = scala.io.StdIn.readLine()
    print("Enter Salary: ")
    this.salary = scala.io.StdIn.readInt()
  }
  def showMember():Unit={
    print("\nName = ",this.Name)
    print("\nAge = ",this.age)                    
    print("\nPhone = ",this.phone)
    print("\nSalary = ",this.salary)
  }
  def printSalary():Unit={
    print("Salary : ",this.salary)
  }
}

class Employee extends Member{
  var specialization : String = ""
  override def getMember(){
    super.getMember
    print("Enter specialization: ")
    this.specialization = scala.io.StdIn.readLine()
  }
  override def showMember(){
    super.showMember
    print("\nSpecialoization = ",this.specialization)
  }
}


object Main {
	def main(args: Array[String]): Unit = {
    val employee = new Employee()
    employee.getMember()
    employee.showMember()
    employee.printSalary()
  }
}
