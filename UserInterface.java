
//package project;
//
//import java.awt.Dimension;
//import java.awt.FlowLayout;
//import java.awt.Font;
//import java.awt.GridLayout;
//import java.awt.PopupMenu;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//  class UserInterface2 extends JFrame implements ActionListener{
//      
//        String  ID ; 
//        int ID2;
//        
//        JPanel panel=new JPanel();
//
//        JLabel label = new JLabel("Enter ID product :");
//        JLabel label2 = new JLabel();
//        
//        JTextField textField = new JTextField();
//        JTextArea textArea = new JTextArea();
//
//        JButton button = new JButton("Click");
//        
//         public UserInterface2(){
//       
//
// setSize(500, 500);
// setTitle("Project 8");
// panel.setLayout(new GridLayout(5,1));
//     
// panel.setPreferredSize(new Dimension(10, 50));
//
// label.setHorizontalAlignment(JLabel.CENTER);
// textField.setHorizontalAlignment(JTextField.CENTER);
// label2.setHorizontalAlignment(JLabel.CENTER);
// 
// Font newFont = new Font("Arial", Font.BOLD, 15);//font
// label.setFont(newFont);
// textField.setFont(newFont);
// button.setFont(newFont);
// label2.setFont(newFont);
// textArea.setFont(newFont);
// button.setEnabled(true);
//  
// add (panel);
//panel.add(label);
//panel.add(textField);
//panel.add(button);
//panel.add(label2);
//panel.add(textArea);
//
//    setVisible(true);
// 
//   button.addActionListener(this);
//
//        setDefaultCloseOperation(EXIT_ON_CLOSE);   //close
//    }
//
//   public void setLabel2(JLabel label2) {
//        this.label2 = label2;
//    }
//
//    public JLabel getLabel2() {
//        return label2;
//    }
//  public void setTextArea(JTextArea textArea) {
//        this.textArea = textArea;
//    }
//
//    public JTextArea getTextArea() {
//        return textArea;
//    }
// @Override
//    public void actionPerformed(ActionEvent e) {
//            
//       ID = textField.getText(); 
//       ID2=Integer.parseInt(ID);
//         
//      label2.setHorizontalAlignment(JLabel.CENTER);
//      panel.add( getLabel2());
//       setVisible(true);
//     panel.add( getTextArea());
//      setVisible(true);
//      
//    }
//       public int getID2() {
//        return ID2;
//    }
// }
//
