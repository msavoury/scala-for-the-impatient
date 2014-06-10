def recursivePower(x: Int, n: Int): Int = {
	if (n == 0) { 1 }
	else if (n < 0) { 1 / recursivePower(x, -n)}
	else if (n % 2 == 0) { recursivePower(x, n/2) * recursivePower(x, n/2)}
	else { x * recursivePower(x, n -1 ) }
}
