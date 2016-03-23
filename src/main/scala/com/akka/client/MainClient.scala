package com.akka.client

import akka.actor.ActorSystem
import com.akkademy.messages.SetRequest
import com.typesafe.config.ConfigFactory

/**
  * Created by nmupp on 3/22/16.
  */
object MainClient {
  def main(args:Array[String])  {
    val config = ConfigFactory.load.getConfig("AkkademyServiceLookup")
    val system = ActorSystem("AkkademyServiceLookup",config)
    val actorRef = system.actorSelection("akka.tcp://AkkademyService@127.0.0.1:2552/user/remote-worker")

    actorRef ! SetRequest("pranu","bunnu")
  }
}
