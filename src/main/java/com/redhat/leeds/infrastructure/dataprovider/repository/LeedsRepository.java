package com.redhat.leeds.infrastructure.dataprovider.repository;

import com.redhat.leeds.application.model.Leed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeedsRepository extends JpaRepository<Leed, Long> {
}
