object Main {
  def lengthfive(newlist: List[String]): List[String] = {
    newlist.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    print("Enter the number of elements: ")
    var num: Int = scala.io.StdIn.readInt()
    print("Enter the list: ")
    var list = List.fill(num)(scala.io.StdIn.readLine())
    println(lengthfive(list))
  }
}
