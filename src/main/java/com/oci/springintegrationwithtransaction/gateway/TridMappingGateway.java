package com.oci.springintegrationwithtransaction.gateway;

import javax.transaction.Transactional;

import com.oci.springintegrationwithtransaction.dto.TridMappingDTO;
import org.springframework.http.HttpStatus;

public interface TridMappingGateway
{
    @Transactional
    HttpStatus createMapping(TridMappingDTO request);
}
