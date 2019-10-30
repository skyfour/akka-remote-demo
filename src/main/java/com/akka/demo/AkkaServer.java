package com.akka.demo;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.akka.demo.message.HelloMessage;
import com.typesafe.config.ConfigFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author skyfour
 * @date 2019-10-29
 * @email skyzhang@easemob.com
 */
@Slf4j
@Component
public class AkkaServer {

    ActorSystem system;
    ActorRef serverActor;

    @PostConstruct
    public void init() {
        system = ActorSystem.create("serName", ConfigFactory.load().getConfig("server"));
        serverActor = system.actorOf(Props.create(HelloMessage.class), "serverActorName");
        log.info("{}", serverActor.path());
    }
}
