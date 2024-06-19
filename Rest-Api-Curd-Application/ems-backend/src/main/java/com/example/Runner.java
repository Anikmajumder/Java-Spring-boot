package com.example;

 class ClassA {

    int number = 0;

    void print(){
        System.out.println(number);
    }
    
}

public class  Runner {

    public static void main(String[] args) {

        ClassA obj = new ClassA();
        obj.number = 2;
        obj.print();
      
    }
}