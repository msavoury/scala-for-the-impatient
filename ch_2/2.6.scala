def getUnicodeProduct(input: String) = {
	var product:Long = 1
	for (ch <- input) {
		product *= ch.toInt
	}
	product
}
