package explore

import scala.concurrent.Future
import repository.Repo._
import common.FutureUtils._
import scala.concurrent.ExecutionContext.Implicits.global

/** Using `flatMap` */
object Unit8 extends App {

  await(addPersonWithOrganisation("Vienna Scala User Group", "flatMap"))

  def addPersonWithOrganisation(organization: String, nickName: String): Future[Unit] = {
    addOrganization(organization) flatMap { organizationId =>
      addPerson(organizationId, nickName)
    }
  }

}
