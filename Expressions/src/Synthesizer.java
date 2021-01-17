import processing.core.*;
//import java.lang.reflect.*;


public class Synthesizer {

	PApplet parent;
	MapKey mapKey = new MapKey();
	String keyId;
	
	int squareIdX = 0;
	int squareIdY = 0;
	int count = 0;
	int idXDiff, idYDiff;
	
	Synthesizer(PApplet p){
		parent = p;
	}
	
	String playSetter(int[] squareId) {
		
		PApplet.println(squareId[0],squareId[1]);
		
		if(squareId[0] != 0 && squareId[1] != 0) {
			
			PApplet.println("count = ",count);
			if(count != 0) { //Turns on tracking mode
				idXDiff = squareIdX - squareId[0];
				idYDiff = squareIdY - squareId[1];
				System.out.println(idXDiff + " " + idYDiff);
				
				if(idXDiff == 0) {					
					if(idYDiff == 0) {						
						keyId = mapKey.mapKey();
					}
					
					if(idYDiff == 1) {						
						keyId = mapKey.mapKey01();
					}
					
					if(idYDiff == -1) {						
						keyId = mapKey.mapKey01neg();
					}
				}
				if(idXDiff == 1) {						
					if(idYDiff == 0) {							
						keyId = mapKey.mapKey10();
					}
						
					if(idYDiff == 1) {							
						keyId = mapKey.mapKey11();
					}
						
					if(idYDiff == -1) {							
						keyId = mapKey.mapKey11neg();
					}
				}
		
				if(idXDiff == -1) {						
					if(idYDiff == 0) {							
						keyId = mapKey.mapKey10neg();
					}
						
					if(idYDiff == 1) {							
						keyId = mapKey.mapKey1neg1();
					}
						
					if(idYDiff == -1) {							
						keyId = mapKey.mapKey1neg1neg();
					}				
				}
				count++;
			}
			else {
				
				//Reset count to reset direction tracking
				keyId = mapKey.mapKey();	
			}
			//printChck();

			
			squareIdX = squareId[0];
			squareIdY = squareId[1];
		}
		
		else {
			
			count = 0;
			keyId = null;
		}
		return keyId;
		
		}
	
	
	void printChck() {
		
		//PApplet.println(useMethod);
		return;
	}

}
