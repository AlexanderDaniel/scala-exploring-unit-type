package explore

/**
 * The type [[scala.Unit]] has an instance...
 */
object Unit2 extends App {

  println(nothingToBeDone())
  println(returningTheInstance())

  def nothingToBeDone() {
    println("Nothing to be done!")
  }

  def returningTheInstance() {
    val useLessCalculation = 1-1
    ()
  }

}
