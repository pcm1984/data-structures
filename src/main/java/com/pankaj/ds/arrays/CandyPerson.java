package com.pankaj.ds.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CandyPerson {

    private List<Candy> bagOfCandies;
    private Integer sumOfCandySizes;
    private Integer redColorCount;

    private Random random;

    public CandyPerson(){
        this.bagOfCandies = new ArrayList<>();
        this.sumOfCandySizes = 0;
        this.redColorCount = 0;
        this.random = new Random();
    }

    public void addCandy(int size, String color){
        Candy candy = new Candy(size, color);
        sumOfCandySizes += size;
        if("red".equalsIgnoreCase(color)){
            this.redColorCount++;
        }
        bagOfCandies.add(candy);

    }

    public Candy getRandomCandy(){
        int index = this.random.nextInt(bagOfCandies.size());
        return this.bagOfCandies.get(index);
    }

    public Integer getRedCandyChance(){
        return (100 * this.redColorCount)/bagOfCandies.size();

    }

    public Integer getAverageSize(){
        return sumOfCandySizes/bagOfCandies.size();
    }

    public static void main(String[] arg){
        CandyPerson candyPerson = new CandyPerson();
        candyPerson.addCandy(10, "red");
        candyPerson.addCandy(20, "red");
        candyPerson.addCandy(30, "red");
        candyPerson.addCandy(40, "Green");
        System.out.println("average size:" + candyPerson.getAverageSize());
        System.out.println("Red candy chance: " + candyPerson.getRedCandyChance());
    }
}

class Candy{
    private Integer size;
    private String color;

    public Candy(Integer size, String color){
        this.size = size;
        this.color = color;
    }

}
