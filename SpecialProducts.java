
package project;


final public class SpecialProducts  extends Products{
    
    private String relationShip;
    private SpecialProducts[] Special ;
    String all ="";
   
    
    public SpecialProducts(String name , double price ){
        super(name,price);
    }
    
     public SpecialProducts(SpecialProducts[] Special){
        this.Special=Special ;  
     }
    
     
     public void array( SpecialProducts[] Special ,String relationShip) {
       this.relationShip=relationShip;
       this.Special=Special ;
     }
     
      
    
    public String toString(){
        
      
       String obj ="";      
      if (Special != null){
        for ( int i = 0 ; i < Special.length ; i++)
       if(this == Special[i])
        obj= Special[i].getName();
        return "(In "+ obj +" )The relation "+ relationShip + " relateds between the follwing Special Products :\n" + PrintAll();
       }
      else 
          return super.toString();
    }
       
   
    
     public String r(){
   
    return  super.toString() ;
     } 
     
      public String PrintAll(){
      for ( int i = 0 ; i < Special.length ; i++)
          if(Special[i] != null)
        all+=Special[i].r()+ ""; 
     
      return  all;
    } 
     
     
      }