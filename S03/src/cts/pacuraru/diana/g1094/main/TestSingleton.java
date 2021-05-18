package cts.pacuraru.diana.g1094.main;

import cts.pacuraru.diana.g1094.pattern.singleton.RobotSingleton;

public class TestSingleton {

	public static void main(String[] args) {


		RobotSingleton robot1 = RobotSingleton.getRobotSingleton();
		RobotSingleton robot2 = RobotSingleton.getRobotSingleton();
		
		if(robot1 == robot2)
			System.out.println("Singleton is unique instance");
	}

}
