object Main{
  def main(args:Array[String]):Unit={
    var result = (a:Int, b:Int)=> if(a==b) {(a+b)*3} else {a+b}
    print(result(3,4))
  }
}
