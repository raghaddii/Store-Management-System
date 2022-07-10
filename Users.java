
package project;

abstract public class Users {
    

 protected final String name ;
 final protected int ID ;
 protected static int c=1000;  
 
    public Users(String name) {
        this.name = name;
        this.ID=c; 
        c++;
 
    }
 
     abstract public void type ();
     
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }


    @Override
    public String toString() {
        return name + " ( " + ID + " ) ";
    }
 
  
  }
  
  


   
   
    

