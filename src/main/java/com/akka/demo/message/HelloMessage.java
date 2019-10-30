package com.akka.demo.message;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import com.akka.demo.module.message.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author skyfour
 * @date 2019-10-25
 * @email skyzhang@easemob.com
 */
@Slf4j
public class HelloMessage extends UntypedActor {

//    @Override
//    public void preStart() {
//        // create the greeter actor
//        final ActorRef greeter = getContext().actorOf(Props.create(Greeter.class), "greeter");
//        // tell it to perform the greeting
//        greeter.tell(new Message("skyfour","Hello World;"), getSelf());
//    }


    @Override public void onReceive(Object message) throws Exception {
        log.info("message:{}",message);
        if (message == Greeter.Msg.DONE) {
            // when the greeter is done, stop this actor and with it the application
            getContext().stop(getSelf());
        } else
            unhandled(message);

    }
}
