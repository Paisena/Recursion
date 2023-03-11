// Name: Jonathan Ng
// Date: 2/23/2023
// Class: GITA 4
// Program: Recursion
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
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
            calculator.divideBy3(Float.parseFloat(value));
            ArrayList<Float> divideBy3 = calculator.getDivideBy3();
            int[] odd = calculator.outputOdd(Integer.parseInt(value));
            int gcf = calculator.gcf(Integer.parseInt(value));    
            
            if(gcf == 0 ||  gcf == 1){
                txaOutput.setText(divideBy3 + " \n" + Arrays.toString(odd) + "\n" + "Prime Number");

            }
            else{

            txaOutput.setText(divideBy3 + " \n" + Arrays.toString(odd) + "\n" + gcf);
            }
        }
    }
}