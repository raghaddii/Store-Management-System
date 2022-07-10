package project;

abstract public class Products {
    
    protected String name;
    protected double price;
    protected int ID=0;
    protected static int c=0;

   
    public Products() {
    }

    
 public Products(String name, double price) {
        this.name = name;
        this.price = price;
        this.ID=c; 
        c++;
    }

    public int getID() {
        return ID;
    }
   

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }



    @Override
    public String toString() {
        return "Products("+ID+"): "+name+" costs "+price+" RS.\n";
    }  
}