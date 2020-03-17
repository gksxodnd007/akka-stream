package org.codingsquid.akka

import akka.actor.ActorSystem

import scala.concurrent.ExecutionContext

/**
 *
 * @author hubert.squid
 * @since 2020.03.17
 */
trait AkkaModule {

  implicit protected val system: ActorSystem = ActorSystem("akka-stream")
  implicit protected val ec: ExecutionContext = system.dispatcher

  println("init akka module")
}
