
package project;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


final public class Store extends JFrame implements ActionListener {

     private String StoreName; 
     private Products [] ListOfProducts=new Products[100];
     private int NumberOgProduct=0;
 
  
     public  Store(String name, Products[] p) {
         StoreName = name;
        
         ListOfProducts= p;
         NumberOgProduct=p.length;
    }

     
    public final boolean isExist(Products object ){ 
      
       for(int a=0; a<NumberOgProduct;a++)
            if(ListOfProducts[a]!=null){
            if (ListOfProducts[a].getID()==object.getID())
                return true;}
      
       return false;
    }
    
    
    public final String addProduct(Products object ){
        
        if(NumberOgProduct<ListOfProducts.length){
                ListOfProducts[NumberOgProduct]= object;
                NumberOgProduct++;
                return "Add: " + object.getName() + " seccesfully to the store";}
            else
                return"Sorry it is full ";          
    }
    
    
    
     public final boolean removeProduct(Products object ){
         
        for(int a=0; a<ListOfProducts.length;a++)
           if(ListOfProducts[a]== object){
            ListOfProducts[a]=null;
            ListOfProducts[a]=ListOfProducts[NumberOgProduct-1];
            ListOfProducts[NumberOgProduct-1]=null;
            NumberOgProduct--;  
        return true;
        }
          
      return false;
            
     }   

      public final boolean MremoveProduct(int id){
          
       for(int a=0; a<ListOfProducts.length;a++)
            if(ListOfProducts[a] != null)
        if(ListOfProducts[a].getID() == id)
           if( removeProduct( ListOfProducts[a] )){
               return true;}
            
         return false;
 
       }
        
    
    public final double totalPrice(Products [] CustomerProduts,customer object){
      double total=0;
    
        for(int a=0; a<CustomerProduts.length;a++){
            if(CustomerProduts[a]!=null)
              total+=CustomerProduts[a].getPrice();}
          
              if(object.visit>2)
                 return total=total-(total*0.25);
              else
               return total;    
             
   
    }
   
    
     public final void buy(Products [] CustomerProduts, customer object){
        
        int count=0;
        String productBuy="";
        String MissintProduct="";

        
          for(int x=0; x<CustomerProduts.length;x++){
              if(CustomerProduts[x]!=null)
             productBuy+=CustomerProduts[x] + "";} 
         
           for(int s=0; s<CustomerProduts.length;s++)
               if(CustomerProduts[s]!=null)
            if(isExist(CustomerProduts[s]))
             count++;
           else
          MissintProduct+= CustomerProduts[s].getName(); 
           
          if (count!=CustomerProduts.length)
               System.out.println("The customer needs: \n"+ productBuy + "Sorry the product " + MissintProduct + " is not exist in store" );
          else{
          object.type(); 
          System.out.println( object.toString() + "\nbought : \n" +productBuy+ (object.visit>2?" ( After discount )":"") +"with total price : " + totalPrice(CustomerProduts,object) + " RS");
           
           for(int a=0; a<CustomerProduts.length;a++){
               if(CustomerProduts[a] != null)
                removeProduct(CustomerProduts[a]);}
           }
          
               
           }    
     
     
        
    public String toString() {
         String all ="";
         
        for ( int i = 0 ; i < ListOfProducts.length ; i++){
            if(ListOfProducts[i]!=null)
            all+=ListOfProducts[i] + ""; }
        
        return  StoreName + "\nIt contains " + NumberOgProduct +" product(s) \n"
                +  all ;
    }

    
   
        JPanel panel=new JPanel();
        JLabel label = new JLabel("Enter ID product :");
        JLabel label2 = new JLabel();
        JTextField textField = new JTextField();
        JTextArea textArea = new JTextArea();
        JButton button = new JButton("Click"); 
    
 public void gui (){
 setSize(500, 700);
 setTitle("Project 8");

panel.setPreferredSize(new Dimension(500, 50));
panel.setLayout(new GridLayout(5,1,0,10));
 
 label.setHorizontalAlignment(JLabel.CENTER);
 textField.setHorizontalAlignment(JTextField.CENTER);
 label2.setHorizontalAlignment(JLabel.CENTER);
 
 Font newFont = new Font("Arial", Font.BOLD, 15);//font
 label.setFont(newFont);
 textField.setFont(newFont);
 button.setFont(newFont);
 label2.setFont(newFont);
 textArea.setFont(newFont);
 button.setEnabled(true);
 textArea.setEnabled(false);
  
 add (panel);
panel.add(textArea);
panel.add(label);
panel.add(textField);
panel.add(button);
panel.add(label2);

 button.addActionListener(this);
  setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE); 
   textArea.setText(toString());
      }  

  
    @Override
    public void actionPerformed(ActionEvent e) {
        
         String ID = textField.getText(); 
         int ID2=Integer.parseInt(ID);
         if(MremoveProduct(ID2) == true){
          label2.setText("Remove this product succefully "); 
          textArea.setText(toString());}
         else
             label2.setText("can not Remove this product , enter exist product"); 
          
         
    }
}

