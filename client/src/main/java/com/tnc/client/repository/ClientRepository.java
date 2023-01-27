package com.tnc.client.repository;

import com.tnc.client.repository.entity.Client;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findByEmail(String email);

//    Optional<Client> findByEmailOptional(String email);
}
