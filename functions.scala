object Functions {
	
	def main(args: Array[String]){
		println("The addition of two numbers are:" +addnumbers(27,9));
	}
	def addnumbers (a: Int, b: Int): Int ={
		var sum : Int =0
		sum= a+b
		return sum
	}
}