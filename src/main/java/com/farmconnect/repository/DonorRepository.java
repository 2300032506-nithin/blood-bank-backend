package com.farmconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.farmconnect.model.Donor;

public interface DonorRepository extends JpaRepository<Donor, Long> {
}