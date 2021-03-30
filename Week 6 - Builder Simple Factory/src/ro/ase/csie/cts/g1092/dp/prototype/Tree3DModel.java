package ro.ase.csie.cts.g1092.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Tree3DModel implements Cloneable {

		String color;
		int height;
		ArrayList<Integer> points=null;
		
		public Tree3DModel(String color, int height) {
			
			System.out.println("loading the model...");
			try {
				Thread.sleep(500);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			this.points=new ArrayList<>();
			Random random=new Random();
			for (int i=0;i<20;i++) {
				this.points.add(random.nextInt(1000));
				
			}
			
			
			System.out.println("coloring..");
			this.color = color;
			this.height = height;
			System.out.println("rendering..");

		}

		private Tree3DModel() {}
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
			
			//it's a mistake, you still go through the creation/generation process
			//Tree3DModel copy= new Tree3DModel(this.color, this.height);
			
			
			Tree3DModel copy=new Tree3DModel();
			copy.color=this.color;
			copy.height=this.height;
			copy.points=(ArrayList<Integer>) this.points.clone();
			
			/*if(copy.points==this.points)
				System.out.println("same");
			else
				System.out.println("diff reference");
			
			System.out.println("array 1: ");
			for(int i=0;i<this.points.size();i++) {
				System.out.println(this.points.get(i)+ " ");
			}
			
			System.out.println("array 2: ");
			for(int i=0;i<copy.points.size();i++) {
				System.out.println(copy.points.get(i)+ " ");
			}
			
			
			*/
			copy.points=this.points;
			
			return copy;
		}
		
		
		
}
