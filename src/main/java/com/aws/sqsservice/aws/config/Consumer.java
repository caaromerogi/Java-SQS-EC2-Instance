package com.aws.sqsservice.aws.config;



import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Consumer {
    @SqsListener(value = "${QUEUE_NAME}", deletionPolicy = SqsMessageDeletionPolicy.ALWAYS)
    public void loadMessage(String message){
        System.out.println(message);
    }


}
