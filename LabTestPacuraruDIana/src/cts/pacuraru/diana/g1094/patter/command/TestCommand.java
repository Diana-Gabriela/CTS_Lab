package cts.pacuraru.diana.g1094.patter.command;


public class TestCommand {

	public static void main(String[] args) {

		TaskManager manager = new TaskManager();

		manager.addAsyncTask(new ExternalAccountTransaction());
		manager.addAsyncTask(new InternalAccountTransaction());
		manager.addAsyncTask(new InternalAccountTransaction());
		manager.addAsyncTask(new InternalAccountTransaction());

		manager.execute();
		manager.execute();
		manager.execute();

		

	}

}
