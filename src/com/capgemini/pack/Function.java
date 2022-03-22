package com.capgemini.pack;

public class Function {
    Function(String name){
        this.name = name;
    }
    String name;
    int age;
    float salary;
    public void setSalary(float salary){
        this.salary = salary;
    }
    public float getSalary(){
        return salary;
    }

    //access_specifier return_type function_name(){
    //method body
//    }

//    public, private , protected, default
//    return type->datatype which user want to return value. int,float, char, string, void etc
//m1()-> sout("from function")
//    m2()->sout(new from function)
//    m3(String name)->sout("from parameterized function = "+name)
//    m4(int age)->sout("age = "+age);
//    m5(float salary)->sout("your salay = "+salary)
//    m6(String name, int age)-> sout("my name is "+name+" and my age = "+age)
//    how will return value from function
//    m7()->int result = 5+6 retun result;
//    m8(float a, float b ,float c)->float sum = a+b+c; return sum


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void m1(){
        System.out.println("from function");
    }

    public void m2(){
        System.out.println("new from function");
    }

    public void m3(String name){
        System.out.println("from parameterized function = "+name);
    }

   public void m4(int age){
       System.out.println("age = "+age);
   }
    public void m5(float salary) {
        System.out.println("salary=" + salary);
    }

    public void m6(String name, int age){
        System.out.println("my name is "+name+" and my age = "+age);
    }
    public int add(int a,int b){
        int result = a+b;
        return result;
    }
    public float add(float a, float b, float c) {
        float sum = a+b+c;
        return sum;
    }
    public float add(float a, int b, float c) {
        float sum = a+b+c;
        return sum;
    }
    public int add(int a){
        int result = a+8;
        return result;
    }

    public float add(float a){
        float sum = a+8.7f;
        return sum;
    }

    public static void main(String[] args) {
        Function object = new Function("Harshada");
       object.m1();
       object.m2();
       object.m3("Akshata");
       object.m4(23);
       object.m5(2550.06F);
       object.m6("Akshata",23);
        System.out.println(object.add(5,6));
        System.out.println(object.add(10,20));
        System. out. println(object. add(3.14f,7.8f,5.3f));
        System. out. println(object. add(3.14f,5,5.3f));
        System.out.println(object.add(5.8f));

        System.out.println("After function");
        object.name="Harshada";
        object.age = 43;
        object.setName("Harshada");
        object.setAge(34);

        System.out.println(object.name);
        System.out.println(object.age);
        System.out.println(object.getName());
        System.out.println(object.getAge());


    }

}
