import java.awt.*;
import java.awt.event.*;


public class task1 extends Frame implements ActionListener{

    Label title;
    Label celsius;
    TextField userInput;
    Button fahrenheit;
    Button kelvin;
    Label result;
    double c,f,k;

    public task1(){
        this.setVisible(true);
        this.setSize(500,300);
        this.setLayout(null);
        this.setTitle("Task1");
        this.setBackground(new Color(240, 248, 255));

        
        title = new Label("Temperature Converter");
        celsius = new Label("Enter Celsius");
        userInput = new TextField();
        fahrenheit = new Button("Convert in Fahrenheit");
        kelvin = new Button("Convert in kelvin");
        result = new Label();
        
        title.setBounds(110, 50, 350, 30);
        celsius.setBounds(130,100,80,30);
        userInput.setBounds(210, 100, 160, 30);
        fahrenheit.setBounds(130, 140, 130, 30);
        kelvin.setBounds(260, 140, 110, 30);
        result.setBounds(170, 180, 190, 30);

        Font customFont = new Font("Segoe UI", Font.PLAIN, 13);
        celsius.setFont(customFont);
        fahrenheit.setFont(customFont);
        kelvin.setFont(customFont);


        userInput.setBackground(Color.WHITE); // Clean input box
        fahrenheit.setBackground(new Color(220, 220, 220)); 
        kelvin.setBackground(new Color(220, 220, 220)); 
        result.setFont(new Font("Arial", Font.BOLD, 14));
        result.setForeground(Color.BLUE);       
        title.setFont(new Font("Arial", Font.BOLD, 24));

        this.add(title);
        this.add(celsius);
        this.add(userInput);
        this.add(fahrenheit);
        this.add(kelvin);
        this.add(result);

        fahrenheit.addActionListener(this);
        kelvin.addActionListener(this);       
        
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
    }
        });
    }      

    public static void main(String args[]){
        task1 t1 = new task1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = userInput.getText();        
        c = Double.parseDouble(input);    
        if(e.getSource() == fahrenheit){
                f = (c* 9/5)+32;
                result.setText("Temperature in F: " + f);
            }
            else if(e.getSource() == kelvin){
                k = (c + 273.15);
                result.setText("Temperature in K: " + k);
            }
    }    
}
