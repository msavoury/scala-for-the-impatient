def product(input: String) = {
	input.foldLeft(1L)(_ * _.toInt)
}
