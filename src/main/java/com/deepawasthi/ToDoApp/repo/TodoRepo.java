package com.deepawasthi.ToDoApp.repo;

import com.deepawasthi.ToDoApp.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {

}
