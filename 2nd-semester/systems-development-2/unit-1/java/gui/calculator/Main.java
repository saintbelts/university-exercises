
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame
{

    private JButton btn_plumin;
    private JButton btn_dot;
    private JButton btn_sqroot;
    private JButton btn_square;
    private JButton btn_erase;
    private JButton btn_division;
    private JButton btn_multiply;
    private JButton btn_minus;
    private JButton btn_plus;
    private JButton btn_equals;
    private JButton btn_zero;
    private JButton btn_one;
    private JButton btn_two;
    private JButton btn_three;
    private JButton btn_four;
    private JButton btn_five;
    private JButton btn_six;
    private JButton btn_seven;
    private JButton btn_eight;
    private JButton btn_nine;
    private JTextField txt_field;
    private double first_number = 0;
    private String operator = "";
    private boolean new_number = true;

    public Main()
    {

        setSize(300, 500);
        setTitle("Calculator");
        ImageIcon icon = new ImageIcon("home/santnabelt/Documents/Programming & Coding/Java/Exercises/GUI/Calculator/icon.png");
        setIconImage(icon.getImage());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        btn_plumin = new JButton("+/-");
        btn_plumin.setFocusable(false);

        btn_dot = new JButton(".");
        btn_dot.setFocusable(false);

        btn_sqroot = new JButton("sqrt(x)");
        btn_sqroot.setFocusable(false);

        btn_square = new JButton("x^2");
        btn_square.setFocusable(false);

        btn_erase = new JButton("C");
        btn_erase.setFocusable(false);

        btn_equals = new JButton("=");
        btn_equals.setFocusable(false);

        btn_minus = new JButton("-");
        btn_minus.setFocusable(false);

        btn_plus = new JButton("+");
        btn_plus.setFocusable(false);

        btn_multiply = new JButton("*");
        btn_multiply.setFocusable(false);

        btn_division = new JButton("/");
        btn_division.setFocusable(false);

        btn_zero = new JButton("0");
        btn_zero.setFocusable(false);

        btn_one = new JButton("1");
        btn_one.setFocusable(false);

        btn_two = new JButton("2");
        btn_two.setFocusable(false);

        btn_three = new JButton("3");
        btn_three.setFocusable(false);

        btn_four = new JButton("4");
        btn_four.setFocusable(false);

        btn_five = new JButton("5");
        btn_five.setFocusable(false);

        btn_six = new JButton("6");
        btn_six.setFocusable(false);

        btn_seven = new JButton("7");
        btn_seven.setFocusable(false);

        btn_eight = new JButton("8");
        btn_eight.setFocusable(false);

        btn_nine = new JButton("9");
        btn_nine.setFocusable(false);

        txt_field = new JTextField("0");
        txt_field.setPreferredSize(new Dimension(300, 100));
        txt_field.setFont(new java.awt.Font("Calibri", 0, 30));
        txt_field.setEditable(false);
        txt_field.setHorizontalAlignment(JTextField.RIGHT);

        setLayout(new BorderLayout());

        add(txt_field, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        panel.add(btn_square);
        panel.add(btn_sqroot);
        panel.add(btn_erase);
        panel.add(btn_division);

        panel.add(btn_seven);
        panel.add(btn_eight);
        panel.add(btn_nine);
        panel.add(btn_multiply);

        panel.add(btn_four);
        panel.add(btn_five);
        panel.add(btn_six);
        panel.add(btn_minus);

        panel.add(btn_one);
        panel.add(btn_two);
        panel.add(btn_three);
        panel.add(btn_plus);

        panel.add(btn_plumin);
        panel.add(btn_zero);
        panel.add(btn_dot);
        panel.add(btn_equals);

        btn_zero.addActionListener(e -> buttons(e));
        btn_one.addActionListener(e -> buttons(e));
        btn_two.addActionListener(e -> buttons(e));
        btn_three.addActionListener(e -> buttons(e));
        btn_four.addActionListener(e -> buttons(e));
        btn_five.addActionListener(e -> buttons(e));
        btn_six.addActionListener(e -> buttons(e));
        btn_seven.addActionListener(e -> buttons(e));
        btn_eight.addActionListener(e -> buttons(e));
        btn_nine.addActionListener(e -> buttons(e));
        btn_dot.addActionListener(e -> buttons(e));
        btn_plus.addActionListener(e -> buttons(e));
        btn_minus.addActionListener(e -> buttons(e));
        btn_multiply.addActionListener(e -> buttons(e));
        btn_division.addActionListener(e -> buttons(e));
        btn_equals.addActionListener(e -> buttons(e));
        btn_erase.addActionListener(e -> buttons(e));
        btn_plumin.addActionListener(e -> buttons(e));
        btn_square.addActionListener(e -> buttons(e));
        btn_sqroot.addActionListener(e -> buttons(e));

        setVisible(true);

    }

    public static void main(String[] args)
    {

        SwingUtilities.invokeLater(() -> new Main());

    }

    private void buttons(ActionEvent e)
    {

        if (e.getSource() == btn_zero)
        {

            if (new_number)
            {

                txt_field.setText("0");
                new_number = false;
            
            }
            else
            {

                txt_field.setText(txt_field.getText() + "0");
            
            }

        }

        if (e.getSource() == btn_one)
        {

            if (new_number)
            {

                txt_field.setText("1");
                new_number = false;
            
            }
            else
            {

                txt_field.setText(txt_field.getText() + "1");
            
            }

        }

        if (e.getSource() == btn_two)
        {
            if (new_number)
            {

                txt_field.setText("2");
                new_number = false;
            
            }
            else
            {

                txt_field.setText(txt_field.getText() + "2");
            
            }
        
        }

        if (e.getSource() == btn_three)
        {

            if (new_number)
            {

                txt_field.setText("3");
                new_number = false;
            
            }
            else
            {

                txt_field.setText(txt_field.getText() + "3");
            
            }

        }

        if (e.getSource() == btn_four)
        {

            if (new_number)
            {

                txt_field.setText("4");
                new_number = false;
            
            }
            else
            {

                txt_field.setText(txt_field.getText() + "4");
            
            }

        }

        if (e.getSource() == btn_five)
        {

            if (new_number)
            {

                txt_field.setText("5");
                new_number = false;
            
            }
            else
            {

                txt_field.setText(txt_field.getText() + "5");
            
            }

        }

        if (e.getSource() == btn_six)
        {

            if (new_number)
            {

                txt_field.setText("6");
                new_number = false;
            
            }
            else
            {
            
                txt_field.setText(txt_field.getText() + "6");
            
            }

        }

        if (e.getSource() == btn_seven)
        {

            if (new_number)
            {

                txt_field.setText("7");
                new_number = false;
            
            }
            else
            {

                txt_field.setText(txt_field.getText() + "7");
            
            }

        }

        if (e.getSource() == btn_eight)
        {

            if (new_number)
            {

                txt_field.setText("8");
                new_number = false;
            
            }
            else
            {

                txt_field.setText(txt_field.getText() + "8");
            
            }

        }

        if (e.getSource() == btn_nine)
        {
            if (new_number)
            {

                txt_field.setText("9");
                new_number = false;
            
            }
            else
            {

                txt_field.setText(txt_field.getText() + "9");
            
            }
        
        }

        if (e.getSource() == btn_dot)
        {

            if (!txt_field.getText().contains("."))
            {

                txt_field.setText(txt_field.getText() + ".");
            }

        }

        if (e.getSource() == btn_plus)
        {

            first_number = Double.parseDouble(txt_field.getText());
            operator = "+";
            new_number = true;
        
        }

        if (e.getSource() == btn_minus)
        {

            first_number = Double.parseDouble(txt_field.getText());
            operator = "-";
            new_number = true;
        
        }

        if (e.getSource() == btn_multiply)
        {

            first_number = Double.parseDouble(txt_field.getText());
            operator = "*";
            new_number = true;
        
        }

        if (e.getSource() == btn_division)
        {

            first_number = Double.parseDouble(txt_field.getText());
            operator = "/";
            new_number = true;
        
        }

        if (e.getSource() == btn_equals)
        {

            double second_number = Double.parseDouble(txt_field.getText());
            double result = 0;

            if (operator.equals("+"))
            {

                result = first_number + second_number;
            
            }

            if (operator.equals("-"))
            {

                result = first_number - second_number;
            
            }

            if (operator.equals("*"))
            {

                result = first_number * second_number;
            
            }

            if (operator.equals("/"))
            {

                if (second_number != 0)
                {

                    result = first_number / second_number;
                
                }
                else
                {

                    txt_field.setText("Error");
                    new_number = true;
                    return;
                
                }

            }

            if (result == (long) result)
            {

                txt_field.setText(String.valueOf((long) result));
            
            }
            else
            {

                txt_field.setText(String.valueOf(result));
            
            }

            new_number = true;

        }

        if (e.getSource() == btn_erase)
        {

            txt_field.setText("0");
            first_number = 0;
            operator = "";
            new_number = true;
        
        }

        if (e.getSource() == btn_plumin)
        {

            double current = Double.parseDouble(txt_field.getText());
            current = current * -1;

            if (current == (long) current)
            {

                txt_field.setText(String.valueOf((long) current));
            
            }
            else
            {

                txt_field.setText(String.valueOf(current));
            
            }

        }

        if (e.getSource() == btn_square)
        {

            double current = Double.parseDouble(txt_field.getText());
            double result = current * current;

            if (result == (long) result)
            {
                
                txt_field.setText(String.valueOf((long) result));

            }
            else
            {

                txt_field.setText(String.valueOf(result));

            }

            new_number = true;
        }

        if (e.getSource() == btn_sqroot)
        {

            double current = Double.parseDouble(txt_field.getText());

            if (current < 0)
            {

                txt_field.setText("Error");
            
            }
            else
            {

                double result = Math.sqrt(current);

                if (result == (long) result)
                {

                    txt_field.setText(String.valueOf((long) result));
                
                }
                else
                {

                    txt_field.setText(String.valueOf(result));
                
                }

            }

            new_number = true;

        }

    }

}