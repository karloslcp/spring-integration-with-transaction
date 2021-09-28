package com.oci.springintegrationwithtransaction.transformer;

import com.oci.springintegrationwithtransaction.entity.TridMapping;
import org.springframework.http.HttpStatus;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Service;

@Service
public class TridMappingToHttpStatusTransformer
{
    @Transformer
    public HttpStatus transform(final TridMapping request)
    {
        return HttpStatus.ACCEPTED;
    }
}
