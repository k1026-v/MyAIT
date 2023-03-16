public class Musician {
    String name;
    String lastName;
    String musicInstrument;

    public Musician(String name, String lastName, String musicInstrument) {
        this.name = name;
        this.lastName = lastName;
        this.musicInstrument = musicInstrument;
    }

    public String playMusic(){
        System.out.println("I play music");
         return null;
    }
}
