package explore

import scala.concurrent.Future
import repository.Repo._
import common.FutureUtils._
import scala.concurrent.ExecutionContext.Implicits.global

object Unit6 extends App {

  await(addPersonWithOrganisation("Vienna Scala User Group", "functionalGuy"))

  def addPersonWithOrganisation(organization: String, nickName: String): Future[Unit] = {
    addOrganization(organization) map { organizationId =>
      addPerson(organizationId, nickName)
    }
  }

}
