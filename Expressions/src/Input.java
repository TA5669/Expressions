import processing.core.*;


public class Input {
	
	PApplet parent ;
	
	int x ,y;
	
	Input(PApplet p){
		parent = p;
	}
		
	int[] listener() {
		
		int[] squareId = new int[2];

		
		
		if(parent.mousePressed == true) {
			
			
			squareId[0] = parent.mouseX/50 + 1;
			squareId[1] = parent.mouseY/50 + 1;
			
			
		}
		/*else {
			squareId[0] = -1;
			squareId[1] = -1;
		}*/
		return squareId;
	}
}


