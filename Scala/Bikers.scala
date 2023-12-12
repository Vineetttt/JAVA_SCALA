object Main {
  def main(args: Array[String]): Unit = {
    print("Enter speed for biker 1")
    var s1 = scala.io.StdIn.readInt()
    
    print("Enter speed for biker 2")
    var s2 = scala.io.StdIn.readInt()
    
    print("Enter speed for biker 3")
    var s3 = scala.io.StdIn.readInt()
    
    print("Enter speed for biker 4")
    var s4 = scala.io.StdIn.readInt()
    
    print("Enter speed for biker 5")
    var s5 = scala.io.StdIn.readInt()
    
    var sum = s1 + s2 + s3 + s4 + s5
    var avg = sum / 5
    
    if (s1 > avg){
      print("\nBiker 1 qualifies")
    }
    if (s2 > avg){
      print("\nBiker 2 qualifies")
    }
    if (s3 > avg){
      print("\nBiker 3 qualifies")
    }
    if (s4 > avg){
      print("\nBiker 4 qualifies")
    }
    if (s5 > avg){
      print("\nBiker 5 qualifies")
    }
  }
}
