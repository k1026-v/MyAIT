public class Main {
    public static void main(String[] args) {

        Jazz p1= new Jazz("Gary", "Fox", "saxsophon");
        Classic p2= new Classic("Bon", "Field", "piano");
        RockAndRoll p3= new RockAndRoll("Sem", "Dark","Gitare");

        p1.playMusic();
        p2.playMusic();
        p3.playMusic();

    }
}