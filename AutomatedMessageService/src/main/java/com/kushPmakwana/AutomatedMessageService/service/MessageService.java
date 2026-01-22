package com.kushPmakwana.AutomatedMessageService.service;

import com.kushPmakwana.AutomatedMessageService.model.Request;
import com.kushPmakwana.AutomatedMessageService.model.Response;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String getAnswer(String question){
        if(question == null){
            return "System: Please ask valid Question";
        }

        question = question.toLowerCase();

        if(question.contains("who made these service?")){
            return "System: Kush Pradeep Makwana";
        }

        if(question.contains("use of this service")){
            return "System: WhatsApp automated system";
        }

        if(question.contains("contact details")){
            return "System: +91-84338XXXXX";
        }

        return "Your Question require higher assistance and it is sent to Costumer Care Support";
    }

}
