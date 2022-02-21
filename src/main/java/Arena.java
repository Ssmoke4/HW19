import Persons.Goblin;
import Persons.Human;
import Persons.Person;
import Persons.Sceletons;
import magazin.ArmorSeller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Arena {
    private static Scanner in;
    private static Human human;
    private static Person monster;

    public static void main(String[] args) throws IOException{
        String location = "1";
        Goblin goblin = new Goblin("Gobi",200, 2,30,10);
        Sceletons sceletons = new Sceletons("Scil",100,34,12,10);
        List<Person> Monsters = new ArrayList<>();
        Monsters.add(0,goblin);
        Monsters.add(1,sceletons);
        monster = Monsters.get((int)Math.random()*2);
        System.out.println(" Your name is  ");
        in = new Scanner(System.in);

        String HeroName = in.nextLine();
        System.out.println("вы выбралм имя игрока " + HeroName);

        human = new Human(HeroName,300,5,100,100);
        System.out.println("характеристики героя: ");
        System.out.println("Имя: "+ human.getName());
        System.out.println("Здоровья "+ human.getHelth());
        printNavigation();




    }
    private static void command(String string) throws IOException{
        switch (string){
            case "1":
                Shoping();
            case"2":
                Fight();
            default:
                break;


        }

    }
    private static void printNavigation() {
        System.out.println("Куда вы хотите пойти?");
        System.out.println("1. К Торговцу здоровьем");
        System.out.println("2. Арена");
        System.out.println("Для выхожа нажмите любую клавишу");

        try {
            command(in.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static void Shoping(){
        ArmorSeller armorSeller = new ArmorSeller();
        armorSeller.seller(human);
        printNavigation();
    }
    private static void Fight(){
        Fight fight = new Fight(human,monster);
        printNavigation();

    }


}
