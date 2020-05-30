object Recursion{
	def main (args: Array[String]){
		for(i <- 1 to 5){
			println("Factorial of"+ i + "is:"+ factorial(i))
		}
	}
	def factorial(n: BigInt): BigInt = {
		if (n<= 1)
			1
		else 
			n* factorial(n-1)
	}
}