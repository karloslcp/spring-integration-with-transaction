package com.oci.springintegrationwithtransaction.controller;

import java.util.List;

import com.oci.springintegrationwithtransaction.dto.TridMappingDTO;
import com.oci.springintegrationwithtransaction.entity.TridMapping;
import com.oci.springintegrationwithtransaction.gateway.TridMappingGateway;
import com.oci.springintegrationwithtransaction.repository.TridMappingRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("trid")
@AllArgsConstructor
public class TridMappingController
{
    private TridMappingGateway gateway;

    private TridMappingRepository repository;

    // FIXME return void and handle other statuses through exceptions
    @PostMapping
    public ResponseEntity<Void> createMapping(@RequestBody TridMappingDTO request)
    {
        return new ResponseEntity(gateway.createMapping(request));
    }

    @GetMapping
    public List<TridMapping> getMappings()
    {
        return repository.findAll();
    }
}
