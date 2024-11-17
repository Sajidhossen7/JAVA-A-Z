import java.lang.*;

 class Animal1 {

    private String name, sound;

    public String type = "Mammal";

    static {
        System.out.println("Animal Kingdom");
    }

    public Animal1() {
        System.out.println("Unknown Animal");
    }

    Animal1(String n, String s) {
        this.name = n;
        this.sound = s;
    }

    public void setName(String n, String s) {
        System.out.println("Changing Name");
        this.name = n;
        this.sound = s;
    }

    public String getName() {
        return this.name;
    }

    public String getSound() {
        return this.sound;
    }
}

 class Animal2 extends Animal1 {

    public String type = "Bird";

    static {
        System.out.println("Feathered Friends");
    }

    public Animal2() {
        System.out.println("Unknown Bird");
    }

    Animal2(String n, String s) {
        super(n, s);
    }
}

public class Animal {

    public static void main(String[] args) {
        Animal2 obj1 = new Animal2();

        obj1.setName("Parrot", "Squawk");

        String s1 = obj1.type.substring(0, 3);

        System.out.println(s1.concat(obj1.getName()));

        Animal2 obj2 = new Animal2("Owl", "Hoot");

        String s2 = obj2.type.substring(0, 4);

        String s3 = obj2.getSound() + "";

        System.out.println(s3.concat(s1));

        if (obj2.type.equals(obj1.type)) {
            System.out.println(s2.concat(obj2.getName()));
        } else {
            System.out.println(s1.concat(obj2.getName()));
        }

        if (s1.charAt(2).equals(s2.charAt(2))) {
            System.out.println(obj1.type.length());
        } else {
            System.out.println(obj2.type.length());
        }

        System.out.println(s1.equals(s2));
    }
}
