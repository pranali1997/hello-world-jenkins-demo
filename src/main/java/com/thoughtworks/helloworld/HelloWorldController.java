package com.thoughtworks.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    //************** 1st type *****************//
    @GetMapping
    private String sayHello(String name) {
        return "hello " + name;
    }

    //**************** 2nd type ******************//
//    private  static  final  String template= "Hello, %s";
//    private final AtomicLong counter =new AtomicLong();
//
//    @GetMapping("/Greeting")
//    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World")String name){
//        return new Greeting(counter.incrementAndGet(),String.format(template,name));
//
//    }


    //*************** 3rd type ***************//
//    @RequestMapping(
//            value = "hello",
//            method = GET,
//            headers = "Accept=application/json")
//    @GetMapping("/world")
//    @ResponseBody
//    public String sayHello() {
//        return "Get some Foos with Header Old";
//    }
}
