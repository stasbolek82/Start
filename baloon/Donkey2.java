package baloon;

public class Donkey2 {

    private double mass;
    private Balloon2[] balloons;

    public Donkey2(double mass){
        this.mass = mass;
        balloons = new Balloon2[0];
    }

    public void addBalloon(Balloon2 balloon){
        balloons = extendsArray(balloons);
        balloons[balloons.length-1] = balloon;
    }

    public boolean isFlying(){
        double load = 0;
        for (Balloon2 b : balloons)
            load += b.getLoad();
        return load >= mass * 1000;
    }

    public Balloon2[] getBalloons() {
        return balloons;
    }

    private Balloon2[] extendsArray(Balloon2[] arr){
        Balloon2[] tmp = new Balloon2[balloons.length + 1];

        for (int i = 0; i < balloons.length; i++)
            tmp[i] = balloons[i];

        return tmp;
    }
}
