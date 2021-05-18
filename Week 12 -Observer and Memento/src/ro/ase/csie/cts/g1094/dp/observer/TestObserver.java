package ro.ase.csie.cts.g1094.dp.observer;

public class TestObserver {

	public static void main(String[] args) {


		NetworkMonitorModule monitor = new NetworkMonitorModule();
		
	//	monitor.networkStatusChanged(NetworkStatus.UP); 
		//nothing happens
		
		NetworkStatusHandlerInterface autosave = new AutoSaveModule();
		NetworkStatusHandlerInterface notification = new UINotificationsModule();
		
		
		monitor.register(autosave);
		monitor.register(notification);
		
		monitor.networkStatusChanged(NetworkStatus.UP);
		monitor.networkStatusChanged(NetworkStatus.DOWN);
		
		monitor.unregister(notification);
		
		monitor.networkStatusChanged(NetworkStatus.UP);


		
		
	}

}
