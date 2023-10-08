import java.util.Random;
public class Creator {
    public static void main(String[] args) {
        String name = args[0];

            System.out.println("Welcome to Character Roller!");




        Random rng = new Random();
        int charClassInt = rng.nextInt(3);
        String charClassString = " is a ";

//    set random range between (2-13)
        int strength = (rng.nextInt(11) +2);
        int magic = rng.nextInt(11) + 2;
        int health = rng.nextInt(11) + 2;

        if (charClassInt == 0){
            charClassString += "Warrior";
            strength *= 3;
        }
            else if (charClassInt == 1){
            charClassString += "Wizard";
            magic *= 3;
        } else if (charClassInt == 2) {
            charClassString += "Potato";
            health *= 3;
        }


        else {
            System.out.println("try again");
        }

        System.out.println(args[0] +  charClassString);
        System.out.println("Strength = " + strength);
        System.out.println("Magic = " + magic);
        System.out.println("Health = " + health);
        System.out.println("Happy adventuring!");
        System.out.println("-----------------------------------------");
    }

}
