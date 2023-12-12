object Main {
  def main(args: Array[String]): Unit = {
    var h = new HourlyEmployee();
    h.accessor();
    h.calculateWeeklyPay();
    h.mutator();
    h.calculateWeeklyPay();

    var w = new WeeklyEmployee();
    w.accessor();
    w.calculateWeeklyPay();
    w.mutator();
    w.calculateWeeklyPay();
  }
}

abstract class Employee {
  var name: String = null;
  var jobtitle: String = null;

  def accessor();

  def mutator();

  def calculateWeeklyPay();
}

class HourlyEmployee extends Employee {
  var payrate: Int = 0;
  var hoursworked: Int = 0;

  def accessor() {
    println("Enter payrate: ")
    payrate = scala.io.StdIn.readInt();
    println("Enter Hours worked this week: ")
    hoursworked = scala.io.StdIn.readInt();
  }

  def mutator() {
    println("Enter changed payrate: ")
    payrate = scala.io.StdIn.readInt();
    println("Enter the changed hours worked this week: ")
    hoursworked = scala.io.StdIn.readInt();
  }

  def calculateWeeklyPay() {
    println("Weekly pay is: " + (this.payrate * this.hoursworked));
  }
}

class WeeklyEmployee extends Employee {
  var weeklysalary: Int = 0;

  def accessor() {
    println("Enter Weekly Salary: ")
    weeklysalary = scala.io.StdIn.readInt();
  }

  def mutator() {
    println("Enter changed Weekly Salary: ")
    weeklysalary = scala.io.StdIn.readInt();
  }

  def calculateWeeklyPay() {
    println("Weekly pay is: " + this.weeklysalary);
  }
}
