package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//access data at specific table (interface not a class)
@Repository
public interface JobRepository extends CrudRepository<Job, Integer> {
}
