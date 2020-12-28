import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String[] args){
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play(){
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 2, 70, 100);
            ShortMessage b = new ShortMessage();
            b.setMessage(192, 2, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            MidiEvent noteOff = new MidiEvent(b, 100);
            track.add(noteOn);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}