package com.springKafka.dao;

import com.springKafka.model.WikimediaData;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class WikimediaDaoImpl implements WikimediaDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveWikimedia(WikimediaData wikimediaData){
        entityManager.persist(wikimediaData);
    }

}
