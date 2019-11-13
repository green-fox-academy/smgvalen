package com.smgvalen.frontend.repositories;

import com.smgvalen.frontend.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {

}
