package explore

import scala.concurrent.Future
import repository.Repo._
import common.FutureUtils._
import scala.concurrent.ExecutionContext.Implicits.global

/** One can use the compiler options `-Ywarn-value-discard` */
object Unit7 extends App {

  await(addPersonWithOrganisation("-Y options", "warn-value-discard"))

  def addPersonWithOrganisation(organization: String, nickName: String): Future[Unit] = {
    addOrganization(organization) map { organizationId =>
      addPerson(organizationId, nickName)
    }
  }

}
