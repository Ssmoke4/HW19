import Persons.*;

public class Fight {
    public Fight(Person per1, Person per2) {
        int turn =0;
        while (true){
            if(turn==0){
                int p1 = per1.atack();
                int p2 = per2.getHelth()-p1;
                per2.setHelth(p2);
                if(per2.getHelth()>0){
                    System.out.println("монстру нанес удар "+ per1.getName() + " Сила удара "+ p1);
                    System.out.println("У монстра осталось здоровья" + per2.getHelth());
                    turn++;
                }else{
                    System.out.println("Монстр убит игра окончена");
                    int gold = per2.getGold();
                    per1.setGold(per1.getGold()+gold);
                    System.out.println("Ваша награда составляет " + gold+ " монет и теперь у вас " + per1.getGold()+" монет");
                    System.out.println(String.format("%100s", "").replace(' ', '*'));
                    break;
                }
            }else{
                int p2 = per2.atack();
                int p1 = per1.getHelth()-p2;
                per1.setHelth(p1);
                if(per1.getHelth()>0){
                    System.out.println("Вам нанес удар "+ per2.getName() + " Сила удара "+ p2);
                    System.out.println("У вас осталось здоровья " + per1.getHelth());
                    --turn;
                }else{
                    System.out.println("Игрок убит");
                    System.out.println(String.format("%100s", "").replace(' ', '*'));
                    break;
                }
            }
        }
    }
}
