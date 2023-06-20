package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.ExampleResponse


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

  def dummy200(responseExampleResponse: ExampleResponse)(implicit toEntityMarshallerExampleResponse: ToEntityMarshaller[ExampleResponse]): Route =
    complete((200, responseExampleResponse))
  /**
   * Code: 200, Message: dummy, DataType: ExampleResponse
   */
  def dummy()
      (implicit toEntityMarshallerExampleResponse: ToEntityMarshaller[ExampleResponse]): Route

}

trait DefaultApiMarshaller {


  implicit def toEntityMarshallerExampleResponse: ToEntityMarshaller[ExampleResponse]

}

