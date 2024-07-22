object Main {
  def reverseString(str: String): String = {
    if (str.isEmpty()) {
      return str
    } else {
      return (reverseString(str.tail) + str.head)
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter the String: ")
    var result: String = scala.io.StdIn.readLine()
    print(reverseString(result))
  }
}

