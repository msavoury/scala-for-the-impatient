def productRecursive(input: String): Long = {
	if (input.length == 0) 1 else input(0).toInt * productRecursive(input.tail)
}
