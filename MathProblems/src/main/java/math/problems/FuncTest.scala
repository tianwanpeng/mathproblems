
package math.problems

object FuncTest {

  def log() {

  }

  def main(args: Array[String]): Unit = {

    val x = (2 to 10000 by 100).toArray

    x.map { i =>

      (i, Math.log(i), i * Math.log(i), i * 1.0 / Math.log(i))

    }.foreach {
      a =>
        println(a._2 + "\t" + a._4)
    }

  }

}
