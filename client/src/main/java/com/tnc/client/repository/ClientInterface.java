package com.tnc.client.repository;

import com.tnc.client.repository.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientInterface extends JpaRepository<Client, Long> {

}
