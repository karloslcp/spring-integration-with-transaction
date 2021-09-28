package com.oci.springintegrationwithtransaction.service;

import javax.transaction.Transactional;

import com.oci.springintegrationwithtransaction.entity.TridMapping;
import com.oci.springintegrationwithtransaction.repository.TridMappingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TridMappingService
{
    private TridMappingRepository repository;

//    @Transactional
    public TridMapping persist(TridMapping request)
    {
        return repository.save(request);
    }
}
