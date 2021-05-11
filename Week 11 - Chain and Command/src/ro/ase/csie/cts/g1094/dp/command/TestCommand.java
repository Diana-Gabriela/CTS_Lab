package ro.ase.csie.cts.g1094.dp.command;

public class TestCommand {

	public static void main(String[] args) {


		TaskManager manager = new TaskManager();
		
		manager.addAsyncTask(new AsyncCommand("autosave",new BackupModule()));
		manager.addAsyncTask(new AsyncCommand("update 3d model", new UpdatingModule()));
		
		System.out.println("...is running");
		
		manager.execute();
		manager.execute();
		manager.execute();

		
	}

}
