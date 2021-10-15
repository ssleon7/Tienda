package edu.mintic.Tienda1.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mintic.Tienda1.model.entity.Provider;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Integer>{
    
}
