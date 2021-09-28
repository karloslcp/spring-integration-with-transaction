package com.oci.springintegrationwithtransaction.repository;

import com.oci.springintegrationwithtransaction.entity.TridMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TridMappingRepository extends JpaRepository<TridMapping, String>
{
}
