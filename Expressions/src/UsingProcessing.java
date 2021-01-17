import processing.core.*;
import javax.sound.midi.*;
import javax.sound.midi.MidiUnavailableException;
import org.jfugue.pattern.Pattern;
import org.jfugue.realtime.RealtimePlayer; 

public class UsingProcessing extends PApplet {

	RealtimePlayer player;
	String note;
	
	public static void main(String[] args) {

		PApplet.main("UsingProcessing");
	}

	int x,y;
	Input input = new Input(this);
	Synthesizer synth = new Synthesizer(this);
	Pattern pattern;
	
	public void setup() {
		fill(0,0,0);
		stroke(255);
		background(255);
		rectMode(CORNER);
		
		//thread("input.listener");
/*		Input dataInput = new Input();
		Synthesizer playMusic = new Synthesizer();*/
		interfaceBuilder();
		try {
			Sequencer seq = MidiSystem.getSequencer();
			seq.getTransmitters ().iterator ().next ().close (); 
		} catch (MidiUnavailableException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		
		try {
			player = new RealtimePlayer();
			
		} catch(Exception e) {
			return;
		}
		
		
		/*b.build();*/
	}

	public void settings() {
		size(500, 750);

	}


	public void draw() {
		
		//Get tile coordinate
		int[] coord = input.listener();
		
		//Pass it to synthesizer
		note = synth.playSetter(coord);
		pattern = new Pattern(note);
		player.play(pattern);
		
		//For Test
		//println(coord[0],coord[1]);
	}
	
	public void interfaceBuilder() {
		
		int[] start = {0,1,2,1,1,0,0,1,0,1,2,3,2,1,0};
		int[] end = {6,7,8,9,8,7,8,8,7,8,9,9,8,7,9};

		for(int i = 0; i < 15; i++) {
			for(int x = start[i]; x < end[i] + 1; x++ ) {
				int s = x * 50;
				rect(s, i*50, 50, 50 );
			}
		}
			
	}
	
	
}


