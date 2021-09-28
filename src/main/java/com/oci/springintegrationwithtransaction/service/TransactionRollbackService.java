package com.oci.springintegrationwithtransaction.service;

import com.oci.springintegrationwithtransaction.entity.TridMapping;
import org.springframework.stereotype.Service;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@Service
public class TransactionRollbackService
{
    public TridMapping rollback(final TridMapping request)
    {
        System.out.println(TransactionAspectSupport.currentTransactionStatus());
        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
//        TransactionAspectSupport.currentTransactionStatus().flush();

        return request;
    }
}
