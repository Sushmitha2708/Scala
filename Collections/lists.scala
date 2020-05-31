object Lists {
	def main(args:Array[String]){
		val days1 = "monday"::("tuesday"::("wednesday":: Nil))
		val days2 = "thursday"::("friday":: ("saturday":: Nil))

		println("Head of days"+days1.head)
		println("Tail of days"+days1.tail)
		println("Is days empty?"+days1.isEmpty)

		val days = List.concat(days1,days2)
		println("The joined list is:"+days)

		println("reverse order is "+days.reverse)
	}
}