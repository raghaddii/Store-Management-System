
package project;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Project {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    

   
    // Test for the same output
    
         Products p0=new SpecialProducts("orange juice",5.75); // up casting 
         Products p1=new SpecialProducts("bread",2);
         Products p2=new SpecialProducts("water",1);
         Products p3=new SpecialProducts("chips",5);
         Products p4=new SpecialProducts("cheese",8);  
         Products p5=new SpecialProducts("meet",40);  
         Products p6=new SpecialProducts("ice cream",4);  
         
       
        Products [] List=new Products[5];
        
        List[0]=p0;
        List[1]=p1;
        List[2]=p2;
        List[3]=p3;
        List[4]=p4; 

     Store Carrefour=new Store ("Carrefour Store",List) ; 
      
     System.out.println(" Welcome in " + Carrefour);
     
     
     System.out.println("The users are :");
     
      Users user1=new customer("Sara");
      customer customer1=(customer)user1; // down casting
      
      Users user2=new customer("Fahad");
      customer customer2=(customer)user2; // down casting
     
      
      Users user3=new Employee("Mohammed", 12000);
      Employee Employee1=(Employee) user3;  // down casting
      
       Users user4 = new Employee("Noura",20000);
       Employee Employee2= (Employee)user4;  // down casting + // The manager always has 20000 or more salary 
       
       System.out.println(customer1);
       System.out.println(customer2);
       System.out.println(Employee1);
       System.out.println(Employee2);

        System.out.println("\n");
        
       System.out.println("Increase all salary with 25% : ");
       Employee1.update(25);
       Employee2.update(25);

       System.out.println(Employee1);
       System.out.println(Employee2);

       System.out.println("\n");
        
      System.out.println("store before 3 correct buy operatoin : " + Carrefour);  
      
       Products [] ListForBuy=new Products[2];
       
        ListForBuy[0]=p1;
        ListForBuy[1]=p4; 
        
        Carrefour.buy(ListForBuy, customer1);
        
        System.out.println("");

        System.out.println("store after the first correct buy operatoin : " + Carrefour);  
      
        
        
        Products [] ListForBuy2=new Products[1];
       
        ListForBuy2[0]=p0;
        
        Carrefour.buy(ListForBuy2, customer1);
         
        System.out.println("");

        System.out.println("store after the second correct buy operatoin : " + Carrefour); 
        
        System.out.println("---");
        
         Products [] ListForBuy3=new Products[1];
       
        ListForBuy3[0]=p3;
        
         Carrefour.buy(ListForBuy3, customer1);
         
                         System.out.println("---");
                         
        System.out.println("store after the third correct buy operatoin : " + Carrefour); 

         System.out.println("The customers are :");
     
        System.out.println(customer1);
        System.out.println(customer2);

                System.out.println("");

         System.out.println("store before wrong buy operatoin : " + Carrefour); 

         Products [] ListWrong=new Products[2];
       
        ListWrong[0]=p2;
        ListWrong[1]=p5; 
        
        Carrefour.buy(ListWrong, customer1);
       
         System.out.println("---");
         
         System.out.println("store after wrong buy operatoin : " + Carrefour); 
          
           System.out.println("The users are :");
       System.out.println(customer1);
       System.out.println(customer2);
       System.out.println(Employee1);
       System.out.println(Employee2);
       
                       System.out.println("");

        System.out.println("store before add product : " + Carrefour); 
       System.out.println(Carrefour.addProduct(p6));
        System.out.println("");
        System.out.println("store after add product : " + Carrefour); 
        
        
         SpecialProducts s0=new SpecialProducts("laptop",2000);
         SpecialProducts s1=new SpecialProducts("Airpods",700);
         SpecialProducts s2=new SpecialProducts("Iphone",3000);
        
       
         
        SpecialProducts [] Lists=new SpecialProducts[3];
        
        
        Lists[0]=s0;
        Lists[1]=s1;
        Lists[2]=s2;
       
        for(int i=0 ; i<Lists.length ; i++)
             Lists[i].array(Lists, "sales");
        
        SpecialProducts ObjArray=new SpecialProducts(Lists);
        
         
         System.out.println( "The List of first spicial products : ");
         System.out.println(ObjArray.PrintAll());
        
         System.out.println(s0);
         System.out.println(s1);
         System.out.println(s2);
         System.out.println("---");
         
          
         SpecialProducts s3=new SpecialProducts("charger",30);
         SpecialProducts s4=new SpecialProducts("power Bank",100);
         
        SpecialProducts [] NewList=new SpecialProducts[2];
        
        
        NewList[0]=s3;
        NewList[1]=s4;
        
             for(int i=0 ; i<NewList.length ; i++)
             NewList[i].array(NewList, "Same Brand");     
             
          SpecialProducts ObjArray2=new SpecialProducts(NewList);
          
         System.out.println( "The List of second spicial products : ");
         System.out.println(ObjArray2.PrintAll());
        
         System.out.println(s3);
         System.out.println(s4);
         System.out.println("---");
        
       System.out.println(customer1);
       System.out.println(customer2);
       System.out.println(Employee1);
       System.out.println(Employee2);


        System.out.println("\nEnter your user ID : ");
        int uID=input.nextInt();
        
        assert ( uID >= 1000 && uID<=1003 ) : "Un exist this ID : " + uID ; // bonus 4
        
        System.out.println(""); 
               if(uID!=Employee2.getID())
        System.out.println("can not remove a product , only managers can remove product");
        else
                Carrefour.gui();
         
                   



     //  Bonus Test for menue
     
     if(Products.c == 12 )  // to initilize with 0 becouse it new store
        Products.c = 0; 
      
       Products sp0=new SpecialProducts("shampoo",1);  
       Products sp1=new SpecialProducts("make up",20);  
       Products sp2=new SpecialProducts("prefume",5); 
       Products sp3=new SpecialProducts("camera",500); 
       Products sp4=new SpecialProducts("lens",100); 
    
         
        Products [] ListMenue=new Products[5];
        
        ListMenue[0]=sp0;
        ListMenue[1]=sp1;
        ListMenue[2]=sp2;
        ListMenue[3]=sp3;
        ListMenue[4]=sp4;
        

     Store lolo=new Store ("LoLo Store",ListMenue) ; 

   
            
     System.out.print(" Welcome in " );
          System.out.println(lolo);

     System.out.println("What is your name");
     String name=input.next();
  

      Users TestUser=new customer(name);
      customer TestCustomer=(customer)TestUser;
   
        System.out.println("\n"+TestCustomer);
     
    int x ;
      do{
        System.out.println("\n1- To check for Products . \n" +
                "2- To Remove a Poducts. \n" + 
                "3- To Add a Poducts.\n" +
                "4- To know the total price.\n"+
                "5- To Buy a Products.\n"+ 
                "6- To add special products.\n  Enter -1 To Stop :" );   
                x=input.nextInt();
       
       assert ( (x >= 1 && x <=6) ||  x == -1 ) : "Un exist Number : " + x ;
      
          switch(x){
              case 1:

           System.out.println("enter ID product you want check for it");  
           int id=input.nextInt();
        
           assert ( id >=12 && id<=16 ) : "Un exist this ID : " + id ;
           
           for(int a=0 ; a<ListMenue.length ; a++)
              if(ListMenue[a].getID() == id)
              if( lolo.isExist(ListMenue[a]) ) {
              System.out.println("\n it is Exist ");}
             else
               System.out.println("\n Sorry is not Exist ");
              break;
              
              case 2:
                    System.out.print("\nbefor remove products :");
                       System.out.println(lolo);
                       
           System.out.println("enter ID product you want to delet it ");  
           int t=input.nextInt();
           
           assert ( t >=12 && t<=16 ) : "Un exist this ID :  " + t ;
           
           for(int a=0 ; a<ListMenue.length ; a++)
                if(ListMenue[a] != null )
              if(ListMenue[a].getID() == t)
          if( lolo.removeProduct(ListMenue[a]) ) {
              System.out.println("\n remove successfully ");
              
               System.out.print("\nafter remove products :");
                       System.out.println(lolo);}
              else
               System.out.println(" Sorry can not remove it ");
             
             break;
             
              case 3:
                 System.out.print("\nbefor adding products :");
                       System.out.println(lolo);

            System.out.println("enter name of product you want to add");  
            String ss=input.next();
            System.out.println("and its price"); 
            int inp=input.nextInt();
            
             assert ( inp >=0 ) : "un excepted this price : " + inp ;
             Products userproduct = new SpecialProducts(ss,inp);
            System.out.println(lolo.addProduct(userproduct));
         
                    System.out.print("\nafter adding products :");
                        System.out.println(lolo);
              break;
              
              case 4:
             System.out.println("\nThe total price for your products ");     
             System.out.println(lolo.totalPrice(ListMenue, TestCustomer));      
              break;
              
              case 5:
                    System.out.println("");
             lolo.buy(ListMenue, TestCustomer);    
             break;
             
              case 6: 
                  System.out.println("What the relation ? ");
                  String r=input.next();
                  System.out.println("How many products you want to add to special");
                  int size=input.nextInt();
                  
                   assert ( size >=0 ) : "un excepted this size :  " + size ;
                   
                  SpecialProducts [] special=new SpecialProducts[size];
                  for(int i=0 ; i<size ; i++){
                  System.out.println("Enter ID product ");
                  int ID=input.nextInt();
                     for(int j=0 ; j<ListMenue.length ; j++)
                          if(ListMenue[j] != null)
                          if(ListMenue[j].getID()==ID)
                         special[i]=(SpecialProducts) ListMenue[j]; //down casting to using the same array
                         special[i].array(special, r); 
                  }
                  
                  
                  SpecialProducts Obj=new SpecialProducts(special);
                  System.out.println("After adding :");
                   System.out.println(Obj.PrintAll());
                   System.out.println("---");

                   System.out.println(special[size-1]); // random test for print one spicial product

          }
      }while(x!=-1) ;
      
      
       
        }
}
            

        

