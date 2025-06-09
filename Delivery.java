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

package FinchPackage;

public class follow {
	public static void main(String[] args) {
		Finch f1 = new Finch();
		int count=0;
		while (true) {
			int dist = f1.getDistance();
			
			
			System.out.println(f1.getLight("L")+","+f1.getLight("R"));
			if(dist>20) {
				if(f1.getLight("L")>f1.getLight("R")) {
					f1.setMotors(10,-10);
				}else if(f1.getLight("L")<=f1.getLight("R")) {
					f1.setMotors(-10, 10);
				}
				count++;
				//System.out.println(dist);
			}else {
				if(dist>5) {
					f1.setMotors(10,10);
				}else {
					f1.stop();
					f1.playNote(60,0.5);
					
				}
			}
			
			
			if(f1.getButton("A")) {
				break;
			}
		}
		f1.stop();
		f1.disconnect();
		}
}

