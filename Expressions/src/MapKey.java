import javax.sound.midi.MidiUnavailableException;
import org.jfugue.pattern.Pattern;
import org.jfugue.realtime.RealtimePlayer;

public class MapKey {
	
	String[][] baseNote;
	String baseNote1 = "c";
	
	
	String mapKey() {
		
		System.out.println(0);
		return baseNote1;
	}
	
	void play(String noteCode) throws MidiUnavailableException {
		
		noteCode = noteCode + " x[123]";
		
		RealtimePlayer player = new RealtimePlayer();
		
		Pattern pattern = new Pattern(noteCode);
		
		player.play(pattern);

		player.close();

	}

	public String mapKey01() {
		// TODO Auto-generated method stub
		return null;
	}

	public String mapKey01neg() {
		// TODO Auto-generated method stub
		return null;
	}

	public String mapKey11() {
		// TODO Auto-generated method stub
		return null;
	}

	public String mapKey11neg() {
		// TODO Auto-generated method stub
		return null;
	}

	public String mapKey1neg1() {
		// TODO Auto-generated method stub
		return null;
	}

	public String mapKey1neg1neg() {
		// TODO Auto-generated method stub
		return null;
	}

	public String mapKey10() {
		// TODO Auto-generated method stub
		return null;
	}

	public String mapKey10neg() {
		// TODO Auto-generated method stub
		return null;
	}


}
