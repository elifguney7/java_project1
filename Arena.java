import java.util.Scanner;
public class Arena {
    public static void listFighters(Fighter[] Fighters) {
        for (int i = 0; i < Fighters.length; i++) {
            System.out.println(i+ "-" +Fighters[i].getName()) ;
        }
    }

    public static void game(Fighter[] Fighters){
        int i = 0;
        Scanner scan = new Scanner(System.in);
        while(i !=5) {
            System.out.println(Fighters[i].getName() + " is attacking...");
            System.out.println("Choose an enemy: \n");
            listFighters(Fighters);
            int selected = scan.nextInt();
            System.out.println(Fighters[i].getName() + " attacked " + Fighters[selected].getName() +" with damage " + Fighters[i].getDamage());
            Fighters[selected].setHealth(Fighter.attack(Fighters[i],Fighters[selected]));
            System.out.println("Health of " + Fighters[selected].getName() + ":" + Fighters[selected].getHealth() );
            System.out.println("----------------------------------------------------\n");
            i++;
        }
    }

    public static void main(String[] args) {
        Fighter[] Fighters = new Fighter[5];

        System.out.println("Enter fighter's name and damage: \n");
        for (int i=0; i < Fighters.length; i++) {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            int damage = sc.nextInt();
            Fighters[i]= new Fighter(name, damage);
        }
        game(Fighters);

        for (int i=0; i < Fighters.length; i++) {
            System.out.println(Fighters[i]);

        }
    }
}