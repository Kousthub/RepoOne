package learnJava.DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ListsBasic {

    // private Map M2;

    public static void main(String args[]){

        int ListLength = 50;
        int max = 1, min = 100;
        //generates random numbers between 1 and 100
        // double RandomNumberSyntax = Math.random()*(max - min + 1) + min;

        List<Integer> AL = new ArrayList<>();
        List<Double> L1 = new LinkedList<>();
        new ListsBasic().createRandomList(L1, ListLength);
        System.out.println(L1);

        int MapLength = 0;
        Map<Integer, Double> M1 = new HashMap<>();

        for(int i = 0; i < MapLength; i++) {
            M1.put(i, Math.random()*100);
        }

    }

    private void createRandomList(List<Double> L1, int listLength) {
        for (int i = 0; i < listLength; i++) {
            L1.add(Math.random() * 100);
        }
    }

}
