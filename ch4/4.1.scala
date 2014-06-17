val prices = Map("pencil" -> 100, "pen" -> 200, "paper" -> 50, "eraser" -> 75)
for((product, price) <- prices)  yield (product, price * .9)
