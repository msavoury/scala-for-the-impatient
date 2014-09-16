object SodaDispenser extends App {
	val machine = new SodaMachine()
	println(machine.inventory)
	println(machine.purchase(.60).name)
	println(machine.purchase(.34).name)

}
class SodaMachine(private var count:Int = 20, private val cost:Double = .50){

  def purchase(money:Double):Beverage = {
    if (money > cost && count > 0) {
      count -= 1
      new Beverage("Pop")
    }
    else new Beverage("Water")
  }
  
  def inventory:Int = count
  
  
}

class Beverage(val name:String)

