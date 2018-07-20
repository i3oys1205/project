package com.websocket.demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.websocket.demo.Greeting;
import com.websocket.demo.HelloMessage;

@Controller  // 메시지를 수신해서 처리하는 클래스 정의.
public class GreetingController {

    @MessageMapping("/hello")  // 요청 토픽이 "/hello"일 때 처리할 함수. 
    @SendTo("/chat/greetings")  // 응답을 보낼 토픽 주소
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        
        // Greeting 클래스로 응답을 전달. json 형태로 전달됨.
        return new Greeting("Hello, " + message.getName() + "!");
    }
    
    @MessageMapping("/Join")
    @SendTo("/chat/Join")
    public Greeting join(HelloMessage message) throws Exception {
    	
    	return new Greeting(message.getName() + "님 연결되셨습니다!");
    }

    
    
}

