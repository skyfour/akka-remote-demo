package com.akka.demo;

import akka.actor.ActorRef;
import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.akka.demo.message.HelloMessage;
import com.typesafe.config.ConfigFactory;

/**
 * @author skyfour
 * @date 2019-10-28
 * @email skyzhang@easemob.com
 */
public class TestMain {

    public static void main(String[] args) {
        String serverName =  "serName";
        String ip = "172.17.3.104";
        String port = "2552";
        String actorServerName="serverActorName";
        String params = "{'a':'123'}";
        ActorSystem system = ActorSystem.create("clientName", ConfigFactory.load().getConfig("client"));
        ActorRef client = system.actorOf(Props.create(HelloMessage.class), "clientActorName");
        //        system.actorFor("akka://serName@10.68.14.139:8888/user/serverActorName").tell("hello,3q I'm client ",client);
        system.actorFor("akka://serName@"+ip+":"+port+"/user/"+actorServerName+"").tell("123",client);

    }
}
