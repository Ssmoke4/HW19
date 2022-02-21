package Persons;

public abstract class Person {
    private String name;
    private int helth,skill,power,gold;

    public Person(String name, int helth, int skill, int power, int gold) {
        this.name = name;
        this.helth = helth;
        this.skill = skill;
        this.power = power;
        this.gold = gold;
    }

    public int atack(){
        if(power*3> Math.random()*100){
            return power;
        }else{
            return 0;
        }
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHelth() {
        return helth;
    }

    public void setHelth(int helth) {
        this.helth = helth;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
