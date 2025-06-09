package FinchPackage;

public class follow {
	public static void main(String[] args) {
		Finch f1 = new Finch();
		
		while (true) {
			int dist = f1.getDistance();
			if(dist>10) {
				f1.setMotors(10,10);
			}
			f1.stop();
			
			if((int)Math.random()*2 == 1){
				f1.turn("R",90,10);
			}else {
				f1.turn("L",90,10);	
			}
			f1.stop();
		}
	}
}


