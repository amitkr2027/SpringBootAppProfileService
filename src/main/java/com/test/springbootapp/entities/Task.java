package com.test.springbootapp.entities;

import javax.persistence.Entity;


@Entity
public class Task {
	private int taskId;
	private String taskName;
	private String taskDes;
	private int parentTaskId;
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskDes() {
		return taskDes;
	}
	public void setTaskDes(String taskDes) {
		this.taskDes = taskDes;
	}
	public int getParentTaskId() {
		return parentTaskId;
	}
	public void setParentTaskId(int parentTaskId) {
		this.parentTaskId = parentTaskId;
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", taskDes=" + taskDes + ", parentTaskId="
				+ parentTaskId + "]";
	}
	
	
	
}
