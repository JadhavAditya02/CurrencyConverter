package converter;

import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame {
    JLabel l1, l2, l3, l4;
    JComboBox tc1, tc2;
    JTextField t1, t2;
    JButton b, dot, ac, bs;
    JButton n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;

    public Main(String s) {
        super(s);
    }
    public void setComp() {
        String arr1[] = {"Rupee", "Dollar", "Euro", "Yen", "Franc"};
        String arr2[] = {"Rupee", "Dollar", "Euro", "Yen", "Franc"};
        l1 = new JLabel("To");
        l2 = new JLabel("Enter the Value:");
        l3 = new JLabel("Converted Value:");
        l4 = new JLabel("From");
        tc1 = new JComboBox(arr1);
        tc2 = new JComboBox(arr2);
        t1 = new JTextField();
        t2 = new JTextField();
        b = new JButton("Convert");
        dot = new JButton(".");
        bs = new JButton("<--");
        ac = new JButton("ac");
        n0 = new JButton("0");
        n1 = new JButton("1");
        n2 = new JButton("2");
        n3 = new JButton("3");
        n4 = new JButton("4");
        n5 = new JButton("5");
        n6 = new JButton("6");
        n7 = new JButton("7");
        n8 = new JButton("8");
        n9 = new JButton("9");
        setLayout(null);
        tc1.setBounds(75, 50, 100, 20);
        t1.setBounds(200, 50, 100, 20);
        l1.setBounds(100, 75, 50, 20);
        l4.setBounds(90, 25, 50, 20);
        l2.setBounds(200, 35, 100, 20);
        l3.setBounds(200, 85, 100, 20);
        tc2.setBounds(75, 100, 100, 20);
        t2.setBounds(200, 100, 100, 20);
        b.setBounds(138, 150, 100, 20);
        ac.setBounds(238, 200, 50, 100);
        bs.setBounds(238, 300, 50, 50);
        dot.setBounds(238, 350, 50, 50);
        n0.setBounds(88, 350, 150, 50);
        n1.setBounds(88, 200, 50, 50);
        n2.setBounds(138, 200, 50, 50);
        n3.setBounds(188, 200, 50, 50);
        n4.setBounds(88, 250, 50, 50);
        n5.setBounds(138, 250, 50, 50);
        n6.setBounds(188, 250, 50, 50);
        n7.setBounds(88, 300, 50, 50);
        n8.setBounds(138, 300, 50, 50);
        n9.setBounds(188, 300, 50, 50);
        b.addActionListener(new Handler());
        ac.addActionListener(new Handler());
        bs.addActionListener(new Handler());
        dot.addActionListener(new Handler());
        n0.addActionListener(new Handler());
        n1.addActionListener(new Handler());
        n2.addActionListener(new Handler());
        n3.addActionListener(new Handler());
        n4.addActionListener(new Handler());
        n5.addActionListener(new Handler());
        n6.addActionListener(new Handler());
        n7.addActionListener(new Handler());
        n8.addActionListener(new Handler());
        n9.addActionListener(new Handler());
        add(tc1);
        add(tc2);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b);
        add(ac);
        add(dot);
        add(bs);
        add(n0);
        add(n1);
        add(n2);
        add(n3);
        add(n4);
        add(n5);
        add(n6);
        add(n7);
        add(n8);
        add(n9);
        t2.setEditable(false);
    }

    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String x, y;
            x = (String) tc1.getSelectedItem();
            y = (String) tc2.getSelectedItem();

            if (e.getSource() == n0)
                t1.setText(t1.getText() + "0");
            if (e.getSource() == n1)
                t1.setText(t1.getText() + "1");
            if (e.getSource() == n2)
                t1.setText(t1.getText() + "2");
            if (e.getSource() == n3)
                t1.setText(t1.getText() + "3");
            if (e.getSource() == n4)
                t1.setText(t1.getText() + "4");
            if (e.getSource() == n5)
                t1.setText(t1.getText() + "5");
            if (e.getSource() == n6)
                t1.setText(t1.getText() + "6");
            if (e.getSource() == n7)
                t1.setText(t1.getText() + "7");
            if (e.getSource() == n8)
                t1.setText(t1.getText() + "8");
            if (e.getSource() == n9)
                t1.setText(t1.getText() + "9");
            if (e.getSource() == dot)
                t1.setText(t1.getText() + ".");
            if (e.getSource() == ac) {
                t1.setText("");
                t2.setText("");
            }

            if (e.getSource() == bs) {
                int n;
                String bsp = new String();
                bsp = t1.getText();
                n = bsp.length();
                t1.setText("" + bsp.substring(0, n - 1));
            }
            if (e.getSource() == b) {
                //Both are same.......................
                if (x == "Rupee" && y == "Rupee") {
                    t2.setText("" + t1.getText());
                } else if (x == "Dollar" && y == "Dollar") {
                    t2.setText("" + t1.getText());
                } else if (x == "Euro" && y == "Euro") {
                    t2.setText("" + t1.getText());
                } else if (x == "Yen" && y == "Yen") {
                    t2.setText("" + t1.getText());
                } else if (x == "Franc" && y == "Franc") {
                    t2.setText("" + t1.getText());
                }

                //Rupee to others.........................
                else if (x == "Rupee" && y == "Dollar") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 0.013262267);
                    t2.setText("" + b);
                } else if (x == "Rupee" && y == "Euro") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 0.011755727);
                    t2.setText("" + b);
                } else if (x == "Rupee" && y == "Yen") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 1.5054898 );
                    t2.setText("" + b);
                } else if (x == "Rupee" && y == "Franc") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 0.012280061 );
                    t2.setText("" + b);
                }

                //Dollar to others......................
                else if (x == "Dollar" && y == "Rupee") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 75.385062 );
                    t2.setText("" + b);
                } else if (x == "Dollar" && y == "Euro") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 0.88627419);
                    t2.setText("" + b);
                } else if (x == "Dollar" && y == "Yen") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 113.50115);
                    t2.setText("" + b);
                } else if (x == "Dollar" && y == "Franc") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 0.9258132);
                    t2.setText("" + b);
                }

                //Euro to others.........................
                else if (x == "Euro" && y == "Rupee") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 85.032628 );
                    t2.setText("" + b);
                } else if (x == "Euro" && y == "Dollar") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 1.1281695  );
                    t2.setText("" + b);
                } else if (x == "Euro" && y == "Yen") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 128.06037  );
                    t2.setText("" + b);
                } else if (x == "Euro" && y == "Franc") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 1.0446533 );
                    t2.setText("" + b);
                }

                //Yen to others............................
                else if (x == "Yen" && y == "Rupee") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 0.66415599);
                    t2.setText("" + b);
                } else if (x == "Yen" && y == "Dollar") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 0.0088104389 );
                    t2.setText("" + b);
                } else if (x == "Yen" && y == "Euro") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 0.0078087517);
                    t2.setText("" + b);
                } else if (x == "Yen" && y == "Franc") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 0.0081584259);
                    t2.setText("" + b);
                }

                //Franc to others........................
                else if (x == "Franc" && y == "Rupee") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 81.376747 );
                    t2.setText("" + b);
                } else if (x == "Franc" && y == "Dollar") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 1.0796384);
                    t2.setText("" + b);
                } else if (x == "Franc" && y == "Euro") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 0.95705017 );
                    t2.setText("" + b);
                } else if (x == "Franc" && y == "Yen") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 122.55993 );
                    t2.setText("" + b);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main jf = new Main("Currency Converter");
        jf.setComp();
        jf.setSize(400, 500);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


