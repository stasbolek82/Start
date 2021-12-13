package person;

/* poniżej masz trzy konstruktory Person():
1- ma dwa parametry w nawiasach () - trzeba obydwa przekazać w momencie tworzenia instancji
2- ma jeden parametr w nawiasach () - trzeba przekazać tylko jeden w momencie tworzenia instancji,
   bo drugi jest już przekazany w konstruktorze;  są tu dwa przypadki różne w ten sposób,
   że mimo, iż konstruktor ma w nawiasach jeden parametr, to może on być albo dla pierwszego pola albo dla drugiego pola!
3- nie ma żadnego parametru w nawiasach () - obydwa są przekazane w konstruktorze
 */

//class person has only 2 fields of types:  String and int;
public class Person {
    private String name;
    private int yearOfBirth;

    // 1-st constructor with 2 parameters in paranthesis ()
    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    //2-nd A constructor wit 1 parameter only in paranthesis () and second one given by constructor itself
    public Person(String name) {
        this.name = name;
        this.yearOfBirth = 1900;
    }

    //2-nd B constructor wit 1 parameter only in paranthesis () and second one given by constructor itself
    public Person(int yearOfBirth) {
        this.name = "Kacper";
        this.yearOfBirth = yearOfBirth;
    }

    // 3-rd constructor without parameters in paranthesis ()
    public Person() {
        this.name = "Karol";
        this.yearOfBirth = 1410;
    }

    public static void main(String[] args) {
        /* przeciążenie konstruktorów pozwala na wpisanie kilku konstruktorów;
          kompilator za każdym razem, gdy tworzymy instancję wybiera ten z konstruktorów, który mu najlepiej pasuje;

          poniżej są przykładowe osoby utworzone z konstruktorów 1-st, 2-nd lub 3-rd
          wszystkie są oczywiście poprawne */

        // first person created by compiler from 1-st constructor
        Person personCase1 = new Person("Kasia", 2000);

        System.out.println("Name of Person 1: " + personCase1.name + ",  born in : " + personCase1.yearOfBirth + " year");

        // secondA  person created by compiler from 2-nd constructor with second! parameter provided in constructor
        Person personCase2A = new Person("Kornelius");

        System.out.println("Name of Person 2A: " + personCase2A.name + ",  born in : " + personCase2A.yearOfBirth + " year");

        // secondB  person created by compiler from 2-nd constructor with first parameter provided in constructor
        Person personCase2B = new Person(1999);

        System.out.println("Name of Person 2B: " + personCase2B.name + ",  born in : " + personCase2B.yearOfBirth + " year");

        // first person created by compiler from 3-rd constructor
        Person personCase3 = new Person();

        System.out.println("Name of Person 3: " + personCase3.name + ",  born in : " + personCase3.yearOfBirth + " year");

    }
}
