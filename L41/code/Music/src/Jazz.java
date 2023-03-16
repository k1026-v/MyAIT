public class Jazz extends Musician {
    public Jazz(String name, String lastName, String musicInstrument) {
        super(name, lastName, musicInstrument);
    }

    @Override
    public String playMusic() {
        System.out.print("I like jazz and ");
        return super.playMusic();

    }
}
