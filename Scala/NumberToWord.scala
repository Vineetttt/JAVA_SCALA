object Main {
	def main(args: Array[String]): Unit = {
	  print("Enter a number: ")
	  val num = scala.io.StdIn.readInt()
	  printNumberToWord(num)
	}
	def printNumberToWord(num :Int):Unit={
	  var number = num
	  var reverse = 0
	  
	  while (number > 0){
	    val digit = number % 10
	    reverse = reverse*10 + digit
	    number = number / 10
	  }
	  while(reverse > 0){
	    val digit = reverse % 10
	    digit match{
	      case 0 => print("zero ")
	      case 1 => print("one ")
	      case 2 => print("two ")
	      case 3 => print("three ")
	      case 4 => print("four ")
	      case 5 => print("five ")
	      case 6 => print("six ")
	      case 7 => print("seven ")
	      case 8 => print("eight ")
	      case 9 => print("nine ")
	    }
	    reverse = reverse / 10
	  }
	}
}