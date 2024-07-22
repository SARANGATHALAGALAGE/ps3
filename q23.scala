object Main {
  def Average(n1: Float, n2: Float): Float = {
    return (n1 + n2) / 2
  }
  def main(args: Array[String]): Unit = {
    print("Enter the value of num1: ")
    var num1: Float = scala.io.StdIn.readFloat()
    print("Enter the value of num2: ")
    var num2: Float = scala.io.StdIn.readFloat()
    var num3: Float = Average(num1, num2)
    print(
      BigDecimal(num3)
        .setScale(2, BigDecimal.RoundingMode.HALF_UP)
        .toFloat
    )
  }
}
