package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class DefaultApi(
    defaultService: DefaultApiService
) {

  
  
  lazy val route: Route =
    path("example" / "someMethod") { 
      get {  
            defaultService.retrieveSomething()
      }
    }
}


trait DefaultApiService {

  def retrieveSomething200(responseInt: Int)(implicit toEntityMarshallerInt: ToEntityMarshaller[Int]): Route =
    complete((200, responseInt))
  /**
   * Code: 200, Message: The response with results, DataType: Int
   */
  def retrieveSomething(): Route

}


