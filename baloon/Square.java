package baloon;

public class Square {
    private double side;
        public Square(int side){
        this.side = side;
    }
       public double getArea(double side) {
           return side*side;
       }
       public String show(){
            return "Are of  the square =  " + getArea(this.side);
       }


    public static void main(String[] args) {
            Square square = new Square(2);

        System.out.println(  square.show());
}
}