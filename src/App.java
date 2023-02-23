// Name: Jonathan Ng
// Date: 2/23/2023
// Class: GITA 4
// Program: Recursion
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App extends JFrame implements ActionListener{
    
    JTextArea txaOutput = new JTextArea("",10,30);
    JTextField inputField = new JTextField(10);
    JButton btnGO = new JButton("Add");

    boolean valueInputed = false;
    String[] inputArray = new String[0];
    
    public App(){
        super("Recursion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(new JLabel("Number"));
        add(inputField);
        add(btnGO);
        add(txaOutput);
        btnGO.addActionListener(this);
    }

    public static void main(String[] args) throws Exception {
        App frame = new App();
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        Object objSource = event.getSource();
        String value = inputField.getText();
        Calculator calculator = new Calculator();

        if(objSource == btnGO){
           calculator.outputOdd(Integer.parseInt(value));        
        }
    }
}