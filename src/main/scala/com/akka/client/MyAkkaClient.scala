package com.akka.client

import akka.actor.{Actor}
import akka.util.Timeout
import com.akkademy.messages.{SetRequest}

import scala.concurrent.duration._

case class Msg(a:String,b:String)



class MyAkkaClient extends Actor {
  private implicit val timeOut = Timeout(5 seconds)


  override def receive = {
    case Msg(a:String,b:String) => {
      val remoteActorRef = context.actorSelection("akka.tcp://akkademy@127.0.0.1:2552/user/akkademy-db")
      remoteActorRef ! SetRequest(a,b)
    }

  }

//  def set(key:String, value:String) = {
//    remoteActorRef ? SetRequest(key,value)
//  }

//  def get(key:String) = {
//    remoteActorRef ? GetRequest(key)
//  }

}
