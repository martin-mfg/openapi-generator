package org.openapitools.server.model


/**
 * dummy
 *
 * @param emptyString  for example: ''''
 * @param numberString  for example: ''42''
 * @param boolString  for example: ''false''
 * @param nullString  for example: ''null''
 * @param aBool  for example: ''false''
 * @param zero  for example: ''0''
*/
final case class ExampleResponse (
  emptyString: Option[String] = None,
  numberString: Option[String] = None,
  boolString: Option[String] = None,
  nullString: Option[String] = None,
  aBool: Option[Boolean] = None,
  zero: Option[Int] = None
)

