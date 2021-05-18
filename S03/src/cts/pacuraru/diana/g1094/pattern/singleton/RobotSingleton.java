package cts.pacuraru.diana.g1094.pattern.singleton;

public class RobotSingleton implements IRobotSoftware {

	
	private RobotSingleton() {}
	
	private static RobotSingleton robotSingleton = new RobotSingleton();

	public static RobotSingleton getRobotSingleton() {
		return robotSingleton;
	}
	
	
	
}
