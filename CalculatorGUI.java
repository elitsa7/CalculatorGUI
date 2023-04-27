import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculatorGUI extends JFrame implements ActionListener{
    private final JPanel mainPanel;
    private final JPanel buttonPanel;
    private final JButton button0;
    private final JButton button1;
    private final JButton button2;
    private final JButton button3;
    private final JButton button4;
    private final JButton button5;
    private final JButton button6;
    private final JButton button7;
    private final JButton button8;
    private final JButton button9;
    private final JButton buttonAdd;
    private final JButton buttonSubtract;
    private final JButton buttonDivide;
    private final JButton buttonMultiply;
    private final JButton buttonClear;
    private final JButton buttonEquals;
    private final JTextField textField;
    private int firstNum = 0;
    private int secondNum = 0;
    private String operator = "";

    public CalculatorGUI (){
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 450);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        textField = new JTextField();
        textField.setMaximumSize(new Dimension(200, 100));
        textField.setFont(new Font("DialogInput", Font.BOLD, 25));
        textField.setEditable(false);


        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonAdd = new JButton("+");
        buttonSubtract = new JButton("-");
        buttonDivide = new JButton("/");
        buttonMultiply = new JButton("*");
        buttonClear = new JButton("C");
        buttonEquals = new JButton("=");

        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSubtract.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonClear.addActionListener(this);

        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonDivide);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttonMultiply);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(buttonSubtract);
        buttonPanel.add(button0);
        buttonPanel.add(buttonClear);
        buttonPanel.add(buttonEquals);
        buttonPanel.add(buttonAdd);

        button0.setFont(new Font("DialogInput", Font.BOLD, 24));
        button1.setFont(new Font("DialogInput", Font.BOLD, 24));
        button2.setFont(new Font("DialogInput", Font.BOLD, 24));
        button3.setFont(new Font("DialogInput", Font.BOLD, 24));
        button4.setFont(new Font("DialogInput", Font.BOLD, 24));
        button5.setFont(new Font("DialogInput", Font.BOLD, 24));
        button6.setFont(new Font("DialogInput", Font.BOLD, 24));
        button7.setFont(new Font("DialogInput", Font.BOLD, 24));
        button8.setFont(new Font("DialogInput", Font.BOLD, 24));
        button9.setFont(new Font("DialogInput", Font.BOLD, 24));
        buttonDivide.setFont(new Font("DialogInput", Font.BOLD, 25));
        buttonMultiply.setFont(new Font("DialogInput", Font.BOLD, 25));
        buttonAdd.setFont(new Font("DialogInput", Font.BOLD, 25));
        buttonSubtract.setFont(new Font("DialogInput", Font.BOLD, 25));
        buttonEquals.setFont(new Font("DialogInput", Font.BOLD, 25));
        buttonClear.setFont(new Font("DialogInput", Font.BOLD, 25));

        mainPanel.add(textField, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        add(mainPanel);
        setVisible(true);
    }
    public void actionPerformed (ActionEvent event){
        if (event.getSource() == button0){
            textField.setText(textField.getText() + "0");
        }else if (event.getSource() == button1){
            textField.setText(textField.getText() + "1");
        }else if (event.getSource() == button2){
            textField.setText(textField.getText() + "2");
        }else if (event.getSource() == button3){
            textField.setText(textField.getText() + "3");
        }else if (event.getSource() == button4){
            textField.setText(textField.getText() + "4");
        }else if (event.getSource() == button5){
            textField.setText(textField.getText() + "5");
        }else if (event.getSource() == button6){
            textField.setText(textField.getText() + "6");
        }else if (event.getSource() == button7){
            textField.setText(textField.getText() + "7");
        }else if (event.getSource() == button8){
            textField.setText(textField.getText() + "8");
        }else if (event.getSource() == button9){
            textField.setText(textField.getText() + "9");
        }else if (event.getSource() == buttonAdd){
            operator = "+";
            firstNum = Integer.parseInt(textField.getText());
            textField.setText("");
        }else if (event.getSource() == buttonSubtract){
            operator = "-";
            firstNum = Integer.parseInt(textField.getText());
            textField.setText("");
        }else if (event.getSource() == buttonMultiply){
            operator = "*";
            firstNum = Integer.parseInt(textField.getText());
            textField.setText("");
        }else if (event.getSource() == buttonDivide){
            operator = "/";
            firstNum = Integer.parseInt(textField.getText());
            textField.setText("");
        }else if (event.getSource() == buttonEquals){
            secondNum = Integer.parseInt(textField.getText());
            int sum = 0;
            switch (operator){
                case "+":
                    sum = firstNum + secondNum;
                    break;
                case "-":
                    sum = firstNum - secondNum;
                    break;
                case "*":
                    sum = firstNum * secondNum;
                    break;
                case "/":
                    sum = firstNum / secondNum;
                    break;
            }
            textField.setText(Integer.toString(sum));
        }else if (event.getSource() == buttonClear){
            textField.setText("");
        }
    }
    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
