package repository

import scala.concurrent.Future
import java.util.concurrent.TimeUnit
import scala.concurrent.ExecutionContext.Implicits.global

object Repo {

  def addOrganization(name: String): Future[Int] = Future {
    TimeUnit.SECONDS.sleep(1)
    println(s"Added organization $name")
    3
  }

  def addPerson(organizationId: Int, nickName: String): Future[Unit] = Future {
    TimeUnit.SECONDS.sleep(1)
    println(s"Added person $nickName")
    ()
  }
}
