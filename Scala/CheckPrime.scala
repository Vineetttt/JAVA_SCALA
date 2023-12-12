object Main {
	def main(args: Array[String]): Unit = {
	  print("Enter a number: ")
	  val n = scala.io.StdIn.readInt()
	  var i = 2
	  var flag = true
	  
	  do{
	    if(n % i == 0){
	      flag = false
	    }
	    i = i+1
	  } while( i <= Math.sqrt(n) && flag )
	  
	  if(flag){
	    print("Prime Number")
	  } else{
	    print("Not a Prime Number")
	  }
	}
}
