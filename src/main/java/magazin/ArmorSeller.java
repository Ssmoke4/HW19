package magazin;

import Persons.Human;
import Persons.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArmorSeller implements Seller {
    @Override
    public String seller(Person person) {
        if( person.getGold()>=20) {
            person.setGold(person.getGold()-20);
            System.out.println("Your balance is "+ person.getGold());
            person.setHelth(person.getHelth()+100);
            System.out.println("Your helth is "+ person.getHelth());
            return "done";
        }else {
            System.out.println(" No money, no honey");
            return null;
        }
    }

}
