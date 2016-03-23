package com.akka.client

import org.scalatest.FunSpecLike
import org.scalatest.Matchers._

import scala.concurrent.Await
import scala.concurrent.duration._

/**
  * Created by nmupp on 3/19/16.
  */
class MyAkkaClientTest extends FunSpecLike {
  val akkaClient = new MyAkkaClient()

  describe("MyAkkaClientTest") {
    it("should send a message to store a value in the db") {
//      akkaClient.set("TajMahal", "India")
//      val futureResult = akkaClient.get("TajMahal")
//      val result = Await.result(futureResult, 10 seconds)
//      result should equal("India")
    }
  }

}
