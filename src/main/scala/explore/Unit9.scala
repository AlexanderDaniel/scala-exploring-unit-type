package explore

import scala.concurrent.Future
import repository.Repo._
import common.FutureUtils._
import scala.concurrent.ExecutionContext.Implicits.global

/** Using a for-comprehension */
object Unit9 extends App {

  await(addPersonWithOrganisation("Great Scala features", "for-comprehension"))

  def addPersonWithOrganisation(organization: String, nickName: String): Future[Unit] = {
    for {
      organizationId <- addOrganization(organization)
      _ <- addPerson(organizationId, nickName)
    } yield ()
  }

}
