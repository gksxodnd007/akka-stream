package org.codingsquid.akka.quickstart

import akka.Done
import akka.stream.scaladsl.{Sink, Source}
import org.codingsquid.akka.AkkaModule

import scala.concurrent.Future

/**
 *
 * @author hubert.squid
 * @since 2020.03.17
 */
object AkkaStreamQuickStart extends AkkaModule {

  def printFromSource(): Unit = {
    //akka stream 2.6.xx 부터 Materializer object에서 implicit 됨. 별도로 주입하거나 implicit선언 해 줄 필요 없음.
    val future: Future[Done] = Source(1 to 10)
      .runWith(Sink.foreach(e => println(s"hello akka stream world e: $e")))

    future.onComplete(_ => system.terminate())
  }
}
