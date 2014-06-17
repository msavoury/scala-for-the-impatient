def initRandom(n: Int) = {
	val a = new Array[Int](n) map (x => Random.nextInt(n))
	a
}
