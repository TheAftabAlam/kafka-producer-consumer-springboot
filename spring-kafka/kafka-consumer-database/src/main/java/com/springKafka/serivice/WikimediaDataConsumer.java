package com.springKafka.serivice;

import com.springKafka.dao.WikimediaDao;
import com.springKafka.model.WikimediaData;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Transactional
public class WikimediaDataConsumer {

    @Autowired
    private WikimediaDao wikimediaDao;


    @KafkaListener(topics = "wikimedia",groupId = "wikimediaGroup")
    public void receivedMsg(String eventMsg){
        log.info(String.format("Event message recieved -> %s",eventMsg));
        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setWikiEventData(eventMsg);
        wikimediaDao.saveWikimedia(wikimediaData);
    }

}
