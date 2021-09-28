package com.oci.springintegrationwithtransaction.dto;

import java.util.Date;

import lombok.Data;

@Data
public class TridMappingDTO
{
    private String id;

    private String tsp, doingBusinessAs;

    private Date dateCreated, dateModified;
}
