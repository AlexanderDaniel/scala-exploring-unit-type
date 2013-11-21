package explore

/**
 * Functions returning [[scala.Unit]] can be defined in different ways...
 */
object Unit1 extends App {
  greet()
  topic()
  question()

  /** type inference */
  def greet() =
    println("Hello, Vienna Scala User Group")

  /** specifying explicitly */
  def topic(): Unit =
    println("Exploring the Unit Type")

  /** no type, but `{ ... }` syntax */
  def question() {
    println("What is there to know??? It is straight-forward, isn't it?")
  }

}
