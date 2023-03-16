public class Classic extends Musician {
     String piano;

    public Classic(String name, String lastName, String musicInstrument) {

        super(name, lastName, musicInstrument);
        this.musicInstrument= piano;
    }

    @Override
    public String playMusic() {
        System.out.print("I like piano and ");
        return super.playMusic();
    }
}
