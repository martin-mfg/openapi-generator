package org.openapitools.server.model


/**
 * dummy
 *
 * @param left  for example: ''null''
 * @param right  for example: ''null''
*/
final case class Node (
  left: Option[Node] = None,
  right: Option[Node] = None
)

