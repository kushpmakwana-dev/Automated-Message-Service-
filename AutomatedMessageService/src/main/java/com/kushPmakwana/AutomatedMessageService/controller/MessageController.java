package com.kushPmakwana.AutomatedMessageService.controller;

import com.kushPmakwana.AutomatedMessageService.model.Request;
import com.kushPmakwana.AutomatedMessageService.model.Response;
import com.kushPmakwana.AutomatedMessageService.service.MessageService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/queries")
public class MessageController {
    MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @PostMapping
    public Response sendAnswer(@RequestBody Request request){
        String ans = service.getAnswer(request.getQuestion());
        return new Response(ans);
    }
}
