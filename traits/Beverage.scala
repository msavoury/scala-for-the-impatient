class Beverage(val name:String, val ounces:Int) {

	def size:String = {
		if (ounces < 8 ) { "small" }
		else if (ounces < 16) { "medium"}
		else if (ounces < 32) {"large"}
		else { "extra large" }
	}

}

class Coffee(name:String, ounces:Int) extends Beverage(name,  ounces) {
	def brand = name
	override def size:String = {
		if (ounces < 8 ) { "pequi" }
		else if (ounces < 16) { "medi"}
		else if (ounces < 32) {"grande"}
		else { "venti " }
	}
}

object BeverageShop extends App {

	val b = new Beverage("hot chocolate", 12)
	println(b.size)
	val c = new Coffee("starbucks", 12)
	println(c.size)
	println(c.brand)

}
