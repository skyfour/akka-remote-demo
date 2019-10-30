package com.akka.demo.message;

import akka.actor.UntypedActor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author skyfour
 * @date 2019-10-25
 * @email skyzhang@easemob.com
 */
@Slf4j
public class Greeter extends UntypedActor {
    public static enum Msg {
        GREET, DONE;
    }

    @Override
    public void onReceive(Object msg) throws InterruptedException {
        log.info("receive message :{}",msg);
        getSender().tell(Msg.DONE, getSelf());
//        if (msg == Msg.GREET) {
//            System.out.println("Hello World!");
//            Thread.sleep(1000);
//
//        } else
//            unhandled(msg);
    }

}
