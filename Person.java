public class Person {
    private String name;
    private int age;
    public void set(String n,int m){
         name=n;
         age=m;
    }
    public void displayInfo(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
