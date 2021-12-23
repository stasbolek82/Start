package baloon;

public class Runner {
        public static void main(String[] args) {

        Donkey1 donkey1 = new Donkey1("Don",1);
        Balloon1 balloon1 = new Balloon1();


        /* Tutaj jest zlokalizowany runner dla klas Balloon1 i Donkey1  */

        while (!donkey1.isFlying1()) {
                balloon1.addBalloon();
                if (!(balloon1.getTotalWeight() <= 1.0)) {
                        break;
                }
//                System.out.println("I can fly!" + balloon1.getTotalWeight());
        }
                System.out.println("I can fly! My weight is less than " + balloon1.getTotalWeight()+ " with " + balloon1.getNumber() + " balloons.");
                /* Tutaj jest zlokalizowany runner dla klas Balloon2 i Donkey2   */
                Donkey2 donkey2 = new Donkey2(1);

                while (!donkey2.isFlying())
                        donkey2.addBalloon(new Balloon2());


                System.out.println("==============================================================");
                System.out.println("Ja latam!!!");
                System.out.println(donkey2.getBalloons().length);


    }
}
