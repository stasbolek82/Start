package baloon;

public class Balloon2 {
    private double helium;

    public Balloon2(){
        helium = Math.random() * (0.009 - 0.005) + 0.005;
    }

    public double getLoad(){
        return helium * 6 / 0.007;
    }
}
