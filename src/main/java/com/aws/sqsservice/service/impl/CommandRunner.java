package com.aws.sqsservice.service.impl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
@Service
public class CommandRunner  {
    /*public void run(String... args) throws Exception {
        System.out.println("start");
        Mono<String> s = Mono.just("Casa");
        s.map(i -> i+"s").flatMap(c -> {
            System.out.println(c);
            return Mono.just(c+"s");
        }).subscribe();
    }*/
}
