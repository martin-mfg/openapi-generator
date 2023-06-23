package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Dummy200Response


class DefaultApi(
    defaultService: DefaultApiService,
    defaultMarshaller: DefaultApiMarshaller
) {

  
  import defaultMarshaller._

  lazy val route: Route =
    path("example" / "someMethod") { 
      get {  
            defaultService.dummy()
      }
    }
}


trait DefaultApiService {

  def dummy200(responseDummy200Response: Dummy200Response)(implicit toEntityMarshallerDummy200Response: ToEntityMarshaller[Dummy200Response]): Route =
    complete((200, responseDummy200Response))
  /**
   * Code: 200, Message: dummy, DataType: Dummy200Response
   */
  def dummy()
      (implicit toEntityMarshallerDummy200Response: ToEntityMarshaller[Dummy200Response]): Route

}

trait DefaultApiMarshaller {


  implicit def toEntityMarshallerDummy200Response: ToEntityMarshaller[Dummy200Response]

}

