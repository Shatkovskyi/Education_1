package com.courses.oop_3.animals;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VSulevskiy on 04.08.2015.
 */
public class Zoo {
    List<Animal> animals;
    public Zoo(){
        animals = new ArrayList<Animal>();
    }
    public void add(Animal animal){
        animals.add(animal);
    }
    public Animal get(int index){
        return animals.get(index);
    }
    public Animal remove(int index){
        return animals.remove(index);
    }
}
