package question1;

class person {
    private String name;
    private int age;

    public person(){
        this.name = "unknown";
        this.age = 18;
    }
    public person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void diplayinfo (){
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
    }
}
