package com.glarimy.cisco.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.glarimy.cisco.api.model.SysLog;

@Repository
public interface SysLogRepository extends CrudRepository<SysLog, Integer> {

}