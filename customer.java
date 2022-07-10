
package project;

  final class customer extends Users {
      
    private String typeOfcustomer;
     int visit=0;
     
        public customer(String name) {
            super(name);
            this.typeOfcustomer="new customer";
            
        }
 @Override       
public void type (){
    visit++;
    if (visit >2)
        typeOfcustomer="special customer";
    else
        typeOfcustomer="new customer";
   }
    
 
 
   @Override
 public String toString() {
        return  typeOfcustomer + " : " + super.toString() + "visit " + visit + " time(s) .";
        }
     
    
      
}
