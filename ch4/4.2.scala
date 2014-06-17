val in = new java.util.Scanner(new java.io.File("data.txt"))
var wordCount = new scala.collection.mutable.HashMap[String, Int]
while(in.hasNext()) {
	val s = in.next()
	wordCount(s) = wordCount.getOrElse(s, 0) + 1
}

for((k,v) <- wordCount) { print(k); println(v);}
