package com.tnc.client.repository;

import com.tnc.client.repository.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findByEmail(String email);

    // find by name(firstname+last name)
    // find by city

}
