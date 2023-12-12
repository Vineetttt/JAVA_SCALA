object Main{
  def main(args: Array[String]): Unit ={
    print("Enter a Number: ")
    var num = scala.io.StdIn.readInt()
    var ans = fib(num)
    print(s"Fibonacci is ${ans}")
  } 
  def fib(num:Int):Int={
    if(num <= 1){
      return num
    }
    return fib(num-1)+fib(num-2)
  }
}
