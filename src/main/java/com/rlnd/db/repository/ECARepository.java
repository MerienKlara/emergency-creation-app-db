package com.rlnd.db.repository;

import java.util.List;

import com.rlnd.db.dao.ECAEntries;
import org.springframework.data.repository.CrudRepository;

public interface ECARepository extends CrudRepository<ECAEntries, Long> {

    List<ECAEntries> findAll();

}
