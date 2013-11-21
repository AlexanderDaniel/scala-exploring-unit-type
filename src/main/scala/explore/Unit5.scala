package explore

/** Value Discarding. If e has some value type and the expected type is Unit,
  * e is converted to the expected type by embedding it in the term `{ e; () }`.
  *
  * [[http://www.scala-lang.org/files/archive/nightly/pdfs/ScalaReference.pdf The Scala Language Specification]]
  */
object Unit5 extends App {

  println(inc(2))

  /** wrong implementation of inc just for demonstration */
  private def inc(x: Int) {
    x + 1
    () // inserted by compiler
  }

}
