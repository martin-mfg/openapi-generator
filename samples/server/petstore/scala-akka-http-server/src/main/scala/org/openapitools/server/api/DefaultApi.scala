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

  def retrieveSomething200(responseDoublearray: Seq[Double])(implicit toEntityMarshallerDoublearray: ToEntityMarshaller[Seq[Double]]): Route =
    complete((200, responseDoublearray))
  /**
   * Code: 200, Message: The response with results, DataType: Seq[Double]
   */
  def retrieveSomething(): Route

}


