
package project;

 class Employee extends Users {
     
      private double salary;
      String TypeOfEmployee;
      
        public Employee(String name, double salary) {
            super(name);
            this.salary=salary;
            type ();
        }

    public double getSalary() {
        return salary;
    }
        
  public void  update ( double percent){
         salary+=(salary*(percent/100));
       
      }
  @Override       
 public void type (){
    if(salary>=20000)
        TypeOfEmployee="Manager";
    else
        TypeOfEmployee="Employee";
  }
  
        @Override
        public String toString() {
            if(TypeOfEmployee=="Manager")
     return "Employee (Manager) : " + super.toString() + "has " + getSalary() + "RS. ";
            else
     return "Employee : " + super.toString() + "has " + getSalary() + "RS. ";             
        }
 
        
}
