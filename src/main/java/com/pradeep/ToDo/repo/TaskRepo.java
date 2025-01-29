package com.pradeep.ToDo.repo;


import com.pradeep.ToDo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Long> {


}
