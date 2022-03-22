package com.capgemini.pack;

public class Box {
    private int side; //instance variable
    private String color;
    static int a; //class variable
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        int a; //local variable
        this.side = side;
    }

    public String getColor(String color) {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Box b = new Box();
         b.setSide(4);
        b.color="white";
        b.a=6;

        Box b1 = new Box();
        b1.side = 6;
        b1.color = "red";

        System.out.println("b.side = " + b.getSide());
        System.out.println("b.color = " + b.color);
        System.out.println("=================== below is property of b1 object=============");
        System.out.println("b1.side = " + b1.side);
        System.out.println("b1.color = " + b1.color);


        Box b3 = new Box();
        b3.setSide(8);
        b3.setColor("brown");
        System.out.println(b3.getSide());
        System.out.println(b3.getColor(""));
        
        
        String s = "hello";
        String s1 = "hello";
        s ="hello1";
        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);

        b3.a=10;
        b1.a = 4;
        // below lines will get same value for all objects that is 4
        System.out.println("b.a = " + b.a); //6
        System.out.println("b1.a = " + b1.a);  //6, error,
        System.out.println("b3.a = " + b3.a);//
        System.out.println("Box.a = " + Box.a);

 }
}
