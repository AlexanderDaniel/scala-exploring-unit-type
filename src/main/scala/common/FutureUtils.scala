package common

import scala.concurrent.{Awaitable, Await}
import scala.concurrent.duration.Duration

object FutureUtils {

  def await[T](awaitable: Awaitable[T]): T =
    Await.result(awaitable, Duration.Inf)

}
