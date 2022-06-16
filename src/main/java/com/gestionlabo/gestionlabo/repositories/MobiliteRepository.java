package com.gestionlabo.gestionlabo.repositories;

import com.gestionlabo.gestionlabo.model.Mobilite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobiliteRepository extends JpaRepository<Mobilite,Long> {
}
