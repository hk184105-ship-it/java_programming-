public class Student extends Person {

   private int id;

     public void set(String n,int m,int l) {
       super.set(n,m);
      id=l;
     
    
    }
    @Override 
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Id:"+id);
    }

    
}

