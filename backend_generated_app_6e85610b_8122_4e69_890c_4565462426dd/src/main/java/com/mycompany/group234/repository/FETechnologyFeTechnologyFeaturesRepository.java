package com.mycompany.group234.repository;


import com.mycompany.group234.model.FETechnologyFeTechnologyFeatures;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class FETechnologyFeTechnologyFeaturesRepository extends SimpleJpaRepository<FETechnologyFeTechnologyFeatures, String> {
    private final EntityManager em;
    public FETechnologyFeTechnologyFeaturesRepository(EntityManager em) {
        super(FETechnologyFeTechnologyFeatures.class, em);
        this.em = em;
    }
    @Override
    public List<FETechnologyFeTechnologyFeatures> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"FETechnologyFeTechnologyFeatures\"", FETechnologyFeTechnologyFeatures.class).getResultList();
    }
}