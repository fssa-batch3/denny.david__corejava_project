package com.fssa.denny.day4.misc;

public class Hare {

public void init() {

System.out.println("init-");

}

protected void race() {

System.out.println("hare-");

}

}



// Tortoise.java Assume the below code is a separate Tortoise.java file



package com.reptile;



import com.mammal.Hare;



public class Tortoise extends Hare {

protected void race(Hare hare) {

hare.init(); // x1

hare.race(); // x2

System.out.print("tortoise-");

}

public static void main(String[] args) {

Tortoise tortoise = new Tortoise();

Hare hare = new Hare();

tortoise.race(hare);

}

}
