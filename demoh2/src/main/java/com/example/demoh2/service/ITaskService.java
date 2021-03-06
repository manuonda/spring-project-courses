package com.example.demoh2.service;

import java.util.List;

import com.example.demoh2.entity.Task;

public interface ITaskService {

	 List<Task> getAll();
	
	 Task insert(Task task);
	
	 void delete(Task task);
	
	 Task update(Task task);
}
