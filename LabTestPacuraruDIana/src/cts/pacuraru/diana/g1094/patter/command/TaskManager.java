package cts.pacuraru.diana.g1094.patter.command;

import java.util.ArrayList;



public class TaskManager {

	
	ArrayList<BankModule> tasks = new ArrayList<>();
	
	public void addAsyncTask(BankModule task) {
		
		tasks.add(task);
		
	}
	
	
public void execute() {
		
		if (tasks.size() > 0) {
			BankModule taskToExecute = tasks.get(0);
		if(taskToExecute != null) {
			
			tasks.remove(0);
			taskToExecute.processTransaction(null, null, 0, null);
		}
}}}
