object Sets{
	def main(args : Array[String]){
		val vegetables1 = Set("Carrot","Potato","Cauliflower")
		val fruits1= Set("Pears","Apple","Orange")
		val num1= Set(3,5,7,8,10,11)
		val num2= Set(3,8,4,1,2,13)

		println("set1 is"+ vegetables1)
		var all = vegetables1 ++ fruits1 
		println("Total set is"+all)

		println("Min element is"+num1.min)
		println("Max element is"+num1.max)

		println("Common elements are: "+num1.&(num2))
	}
}
