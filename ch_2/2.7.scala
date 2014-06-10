def getUnicodeProduct2(input: String) = {
	input.foldLeft(1L)(_ * _.toInt)
}
