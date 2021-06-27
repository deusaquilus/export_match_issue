package io.getquill

object Example {
  def main(args: Array[String]): Unit = {
    import mytest._
    ParseMacro.parse(stuff)
  }
}
