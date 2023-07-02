package com.mycompany.group234.repository;


import com.mycompany.group234.model.FrontendAppMetaTags;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class FrontendAppMetaTagsRepository extends SimpleJpaRepository<FrontendAppMetaTags, String> {
    private final EntityManager em;
    public FrontendAppMetaTagsRepository(EntityManager em) {
        super(FrontendAppMetaTags.class, em);
        this.em = em;
    }
    @Override
    public List<FrontendAppMetaTags> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"FrontendAppMetaTags\"", FrontendAppMetaTags.class).getResultList();
    }
}