package ciklum.rockpaperscissors.backendapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebSocketService {

    private final SimpMessagingTemplate template;

    @Autowired
    WebSocketService(SimpMessagingTemplate template){
        this.template = template;
    }

    public void forwardMessage(List<Integer> statistics){
        this.template.convertAndSend("/statistics",  statistics);
    }

}