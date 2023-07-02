package com.mycompany.group234.repository;


import com.mycompany.group234.model.BETechnologyBeTechnologyFeatures;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class BETechnologyBeTechnologyFeaturesRepository extends SimpleJpaRepository<BETechnologyBeTechnologyFeatures, String> {
    private final EntityManager em;
    public BETechnologyBeTechnologyFeaturesRepository(EntityManager em) {
        super(BETechnologyBeTechnologyFeatures.class, em);
        this.em = em;
    }
    @Override
    public List<BETechnologyBeTechnologyFeatures> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"BETechnologyBeTechnologyFeatures\"", BETechnologyBeTechnologyFeatures.class).getResultList();
    }
}