
public class Donkey {

    private String name;
    private Baloons weight;

    public Donkey(String name, double weight) {
        this.name = name;
        this.weight = new Baloons();
    }

    public void addBallonChecker(double baloon) {
        if (baloon > 0.005 && baloon < 0.007) {
            this.addBallonChecker(baloon);
        }


    }
}
