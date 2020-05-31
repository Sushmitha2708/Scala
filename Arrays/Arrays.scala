object Arrays {
	def main(args: Array[String]){
		var list1= Array(2,5,8,1,4,7,9,6,3);
		for (x <- list1){
			println(x)
		}
		var total = 0.0;
		for (i <- 0 to (list1.length-1)){
			total += list1(i);
		}
		println("Total is "+ total);

		var max = list1(0);
		for (i <- 1 to (list1.length-1)){
			if (list1(i)> max) max= list1(i);
		}
		println("Max is "+ max)
	}
}
