package com.tnc.client.controller;

import com.tnc.client.controller.dto.ClientDto;
import com.tnc.client.controller.mapper.DtoMapper;
import com.tnc.client.service.domain.ClientDomain;
import com.tnc.client.service.impl.ClientService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RequiredArgsConstructor
@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;
    private final DtoMapper dtoMapper;

    @PostMapping("/add")
    ResponseEntity<ClientDto> addClient(@RequestBody ClientDto clientDto) throws Exception {
        ClientDomain client_added = clientService.add(dtoMapper.toDomain(clientDto));
        var newClient = dtoMapper.toDto(client_added);
        return new ResponseEntity<>(newClient, OK);
    }

    @GetMapping("/getOne/{id}")
    ResponseEntity<ClientDto> getById(@PathVariable Long id){
        ClientDto client = dtoMapper.toDto(clientService.getById(id));
        return ResponseEntity.ok(client);
    }

    @GetMapping("/getAll")
    ResponseEntity<List<ClientDto>>getAll(){
        return ResponseEntity.ok(dtoMapper.toDtoList(clientService.getAll()));
    }

    @DeleteMapping("/delete/{id}")
    String delete(@PathVariable Long id){
        clientService.delete(id);
        return "The record with id number "+ id + " was deleted";
    }
}
