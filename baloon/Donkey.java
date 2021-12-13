package baloon;

public class Donkey {

    private String name;
    private Baloons weight = new Baloons();

    public Donkey(String name, double weight) {
        this.name = name;
    }

    public void addBallonChecker(double baloon) {
        if (baloon > 0.005 && baloon < 0.007) {
            this.addBallonChecker(baloon);
        }
    }
}
