package com.learnreactivespring;


import org.junit.Test;
import reactor.core.publisher.Flux;

public class FluxandMonoTest {

    @Test
    public void testFlux() {

        Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Springboot").
//                concatWith(Flux.error(new RuntimeException("Exception Occured !"))).
                concatWith(Flux.just("After Error")).
                log();

        stringFlux.subscribe(System.out::println,
                e -> System.out.println("Exception is "+e),()-> System.out.println("completed"));

    }
}
