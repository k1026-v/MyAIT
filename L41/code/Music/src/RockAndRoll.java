public class RockAndRoll extends Musician{

    public RockAndRoll(String name, String lastName, String gitare) {
        super(name, lastName, gitare);
    }

    @Override
    public String playMusic() {
        System.out.print("I like rock&roll and ");
        return super.playMusic();
    }
}
