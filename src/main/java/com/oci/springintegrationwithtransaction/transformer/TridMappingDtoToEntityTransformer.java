package com.oci.springintegrationwithtransaction.transformer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oci.springintegrationwithtransaction.dto.TridMappingDTO;
import com.oci.springintegrationwithtransaction.entity.TridMapping;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Service;

@Service
public class TridMappingDtoToEntityTransformer
{
    @Transformer
    public TridMapping transform(final TridMappingDTO dto) throws JsonProcessingException
    {
        var mapper = new ObjectMapper();
        final String json = mapper.writeValueAsString(dto);
        return mapper.readValue(json, TridMapping.class);
    }
}
