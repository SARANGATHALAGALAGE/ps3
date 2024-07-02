import scala.io.StdIn.readLine

object StringReverser {
  def reverseString(s: String): String = {
    if (s.isEmpty) ""
    else reverseString(s.tail) + s.head
  }

  def main(args: Array[String]): Unit = {
    println("Please enter a string to reverse:")
    val originalString = readLine()
    val reversedString = reverseString(originalString)
    println(s"Original string: $originalString")
    println(s"Reversed string: $reversedString")
  }
}
