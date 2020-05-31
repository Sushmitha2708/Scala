import java.io._
class Point(var xc: Int, var yc:Int){
	var x: Int =xc
	var y: Int =yc
	def addd(  dx:Int, dy:Int){
		x=x+dx
		y=y+dy
		println("The value of x after adding dx is:"+x);
		println("The value of y after adding dy is:"+y);
		
	}
}
object Class_and_object{
	def main(args: Array[String]){
		val pt= new Point(10,20)
		pt.addd(10,10)
	}
}