import math._;

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println(1.to(10))
    println("Hello".intersect("world"))
    val x = 10
    val y = if (x > 9) 1
    else if
    (x == 0) 0
    else -1
    println(y)

    def show(r:Int)= {
      var rr = r
      println("rr:"+rr)
      for (i <- 1 until 10) {
        if (rr <= 700) {
          rr = rr * i
          println(rr)
        }
      }
      rr
    }

   val result= show(r=1)
    for(i <- 1 to 3; from = 4 - i; j <-from to 3) print((10 * i + j) + " ")
    println("\nresult:"+result)
    val s= {for (i <- 1 to 10) yield i%3}

    //变长参数
    def sum(args: Int*) ={
      var result = 0
      for (arg <- args) result += arg
      result
    }
    println(sum(1,2,3,4,5))

    val s = sum(1 to 5:_*) //
  }
}
