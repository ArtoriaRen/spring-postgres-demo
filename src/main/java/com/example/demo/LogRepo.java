package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: liuyangren
 * Date:
 * Time:
 */
@Repository("logRepo")
    public interface LogRepo  extends CrudRepository<LogItem, Integer> {

    List<LogItem> findByName(String id);



    }
