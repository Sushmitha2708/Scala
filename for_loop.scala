object For_loop{
	def main(args:Array[String]){
		var s= 1;
		var t=6;
		var a=0;
		var daysList= Array("Monday","Tuesday","Wednesday");
		for (s <- 1 to 5){
			println("The value of s is:"+s);
		}
		for ( t<- 6 until 10){
			println("The value of t is:"+t);

		}
		for (a <- daysList){
			println("Days are" +a);
		}
	}
}