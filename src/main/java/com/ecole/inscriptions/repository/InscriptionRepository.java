package com.ecole.inscriptions.repository;

import com.ecole.inscriptions.model.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
}
