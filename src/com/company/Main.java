package com.company;

import com.company.bardy.Bardy;
import com.company.person.Person;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Bardy> lotteryBardies = new ArrayList<>();
        lotteryBardies.add(new Bardy(4, "black", 4, false));
        lotteryBardies.add(new Bardy(4, "red", 4, false));
        lotteryBardies.add(new Bardy(4, "orange", 2, true));
        lotteryBardies.add(new Bardy(4, "yellow", 4, false));
        lotteryBardies.add(new Bardy(4, "blue", 2, true));
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Fred", 34, true, true));
        personList.add(new Person("Wilma", 20, true, false));
        personList.add(new Person("Shaggy", 28, false, false));
        personList.add(new Person("Carly", 29, false, false));
        personList.add(new Person("Dan", 30, true, false));

        // loop through and if you encounter a person who likes bardy and doesn't have then give them a random bardy
        // from the list above.

        for (Person person : personList) {
            List<Bardy> bardiesOwned = new ArrayList<>();

            if (person.isLikeBardy() && person.isHasBardy()) {
                // If the person likes bardy and has a bardy
                bardiesOwned.add(lotteryBardies.get(getRandomIndex(lotteryBardies)));
                person.setBardiesOwned(bardiesOwned);
            } else if (person.isLikeBardy() && !person.isHasBardy()) {
                // if the person likes bardy and does not have a bardy.
                bardiesOwned.add(lotteryBardies.get(getRandomIndex(lotteryBardies)));
                person.setHasBardy(true);
                person.setBardiesOwned(bardiesOwned);
            }
        }
        for (Person person : personList) {
            if (person.isLikeBardy() && person.isHasBardy()) {
                System.out.println(person.getName() + " has this " + person.getBardiesOwned().get(0).getColor() + " bardy");
            }
        }
    }

}
