import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Calculatrice extends JFrame implements ActionListener {

    /* boolean *********************************************************************************************************
     */

    private boolean o = false;
    private boolean d = false;
    private boolean m = false;
    private boolean s = false;
    private boolean a = false;

    /* Color ***********************************************************************************************************
     */

    private Color c0 = new Color(0x1F1F1F);
    private Color c1 = new Color(0x131313);
    private Color c2 = new Color(0x060606);
    private Color c3 = new Color(0x2C2C2C);
    private Color c4 = new Color(0xE81123);
    private Color c5 = new Color(0x484848);

    /* float ***********************************************************************************************************
     */

    private float fl0 = (float) 0.0;

    /* Font ************************************************************************************************************
     */

    private Font f0 = new Font("Arial", Font.PLAIN, 10);
    private Font f1 = new Font("Arial", Font.PLAIN, 40);
    private Font f2 = new Font("Arial", Font.PLAIN, 14);
    private Font f3 = new Font("Arial", Font.PLAIN, 14);
    private Font f4 = new Font("Arial", Font.BOLD, 18);
    private Font f5 = new Font("Arial", Font.PLAIN, 19);

    /* JButton *********************************************************************************************************
     */

    private JButton close = new JButton("X");
    private JButton percent = new JButton("%");
    private JButton clearEntry = new JButton("CE");
    private JButton clear = new JButton("C");
    private JButton backspace = new JButton("<-");
    private JButton inverse = new JButton("1/x");
    private JButton square = new JButton("x²");
    private JButton squareRoot = new JButton("v²");
    private JButton divide = new JButton("/");
    private JButton seven = new JButton("7");
    private JButton eight = new JButton("8");
    private JButton nine = new JButton("9");
    private JButton multiply = new JButton("x");
    private JButton four = new JButton("4");
    private JButton five = new JButton("5");
    private JButton six = new JButton("6");
    private JButton substract = new JButton("-");
    private JButton one = new JButton("1");
    private JButton two = new JButton("2");
    private JButton three = new JButton("3");
    private JButton add = new JButton("+");
    private JButton plusMinus = new JButton("+/-");
    private JButton zero = new JButton("0");
    private JButton comma = new JButton(",");
    private JButton answer = new JButton("=");

    /* JTextArea *******************************************************************************************************
     */

    private JTextArea textArea = new JTextArea();

    public Calculatrice() {
        this.getContentPane().setBackground(c0);
        this.setBounds(192, 108, 320, 395);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("");
        this.setUndecorated(true);

        this.close.addActionListener(this);
        this.close.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                close.setBackground(c4);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                close.setBackground(c0);
            }
        });
        this.close.setBackground(c0);
        this.close.setBorderPainted(false);
        this.close.setBounds(274, 0, 46, 32);
        this.close.setFont(f0);
        this.close.setForeground(Color.white);
        this.add(this.close);


        this.textArea.setBackground(c0);
        this.textArea.setBounds(4, 42, 306, 60);
        this.textArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.textArea.setEditable(false);
        this.textArea.setFont(f1);
        this.textArea.setForeground(Color.white);
        this.textArea.setText("0");
        this.add(this.textArea);

        this.percent.addActionListener(this);
        this.percent.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                percent.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                percent.setBackground(c1);
            }
        });
        this.percent.setBackground(c1);
        this.percent.setBorderPainted(false);
        this.percent.setBounds(4, 105, 76, 46);
        this.percent.setFont(f2);
        this.percent.setForeground(Color.white);
        this.add(this.percent);

        this.clearEntry.addActionListener(this);
        this.clearEntry.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                clearEntry.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                clearEntry.setBackground(c1);
            }
        });
        this.clearEntry.setBackground(c1);
        this.clearEntry.setBorderPainted(false);
        this.clearEntry.setBounds(83, 105, 76, 46);
        this.clearEntry.setFont(f3);
        this.clearEntry.setForeground(Color.white);
        this.add(this.clearEntry);

        this.clear.addActionListener(this);
        this.clear.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                clear.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                clear.setBackground(c1);
            }
        });
        this.clear.setBackground(c1);
        this.clear.setBorderPainted(false);
        this.clear.setBounds(161, 105, 76, 46);
        this.clear.setFont(f3);
        this.clear.setForeground(Color.white);
        this.add(this.clear);

        this.backspace.addActionListener(this);
        this.backspace.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                backspace.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                backspace.setBackground(c1);
            }
        });
        this.backspace.setBackground(c1);
        this.backspace.setBorderPainted(false);
        this.backspace.setBounds(240, 105, 76, 46);
        this.backspace.setFont(f2);
        this.backspace.setForeground(Color.white);
        this.add(this.backspace);

        this.inverse.addActionListener(this);
        this.inverse.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                inverse.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                inverse.setBackground(c1);
            }
        });
        this.inverse.setBackground(c1);
        this.inverse.setBorderPainted(false);
        this.inverse.setBounds(4, 153, 76, 46);
        this.inverse.setFont(f3);
        this.inverse.setForeground(Color.white);
        this.add(this.inverse);

        this.square.addActionListener(this);
        this.square.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                square.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                square.setBackground(c1);
            }
        });
        this.square.setBackground(c1);
        this.square.setBorderPainted(false);
        this.square.setBounds(83, 153, 76, 46);
        this.square.setFont(f3);
        this.square.setForeground(Color.white);
        this.add(this.square);

        this.squareRoot.addActionListener(this);
        this.squareRoot.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                squareRoot.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                squareRoot.setBackground(c1);
            }
        });
        this.squareRoot.setBackground(c1);
        this.squareRoot.setBorderPainted(false);
        this.squareRoot.setBounds(161, 153, 76, 46);
        this.squareRoot.setFont(f3);
        this.squareRoot.setForeground(Color.white);
        this.add(this.squareRoot);

        this.divide.addActionListener(this);
        this.divide.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                divide.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                divide.setBackground(c1);
            }
        });
        this.divide.setBackground(c1);
        this.divide.setBorderPainted(false);
        this.divide.setBounds(240, 153, 76, 46);
        this.divide.setFont(f2);
        this.divide.setForeground(Color.white);
        this.add(this.divide);

        this.seven.addActionListener(this);
        this.seven.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                seven.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                seven.setBackground(c2);
            }
        });
        this.seven.setBackground(c2);
        this.seven.setBorderPainted(false);
        this.seven.setBounds(4, 201, 76, 46);
        this.seven.setFont(f4);
        this.seven.setForeground(Color.white);
        this.add(this.seven);

        this.eight.addActionListener(this);
        this.eight.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                eight.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                eight.setBackground(c2);
            }
        });
        this.eight.setBackground(c2);
        this.eight.setBorderPainted(false);
        this.eight.setBounds(83, 201, 76, 46);
        this.eight.setFont(f4);
        this.eight.setForeground(Color.white);
        this.add(this.eight);

        this.nine.addActionListener(this);
        this.nine.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                nine.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                nine.setBackground(c2);
            }
        });
        this.nine.setBackground(c2);
        this.nine.setBorderPainted(false);
        this.nine.setBounds(161, 201, 76, 46);
        this.nine.setFont(f4);
        this.nine.setForeground(Color.white);
        this.add(this.nine);

        this.multiply.addActionListener(this);
        this.multiply.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                multiply.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                multiply.setBackground(c1);
            }
        });
        this.multiply.setBackground(c1);
        this.multiply.setBorderPainted(false);
        this.multiply.setBounds(240, 201, 76, 46);
        this.multiply.setFont(f2);
        this.multiply.setForeground(Color.white);
        this.add(this.multiply);

        this.four.addActionListener(this);
        this.four.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                four.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                four.setBackground(c2);
            }
        });
        this.four.setBackground(c2);
        this.four.setBorderPainted(false);
        this.four.setBounds(4, 249, 76, 46);
        this.four.setFont(f4);
        this.four.setForeground(Color.white);
        this.add(this.four);

        this.five.addActionListener(this);
        this.five.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                five.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                five.setBackground(c2);
            }
        });
        this.five.setBackground(c2);
        this.five.setBorderPainted(false);
        this.five.setBounds(83, 249, 76, 46);
        this.five.setFont(f4);
        this.five.setForeground(Color.white);
        this.add(this.five);

        this.six.addActionListener(this);
        this.six.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                six.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                six.setBackground(c2);
            }
        });
        this.six.setBackground(c2);
        this.six.setBorderPainted(false);
        this.six.setBounds(161, 249, 76, 46);
        this.six.setFont(f4);
        this.six.setForeground(Color.white);
        this.add(this.six);

        this.substract.addActionListener(this);
        this.substract.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                substract.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                substract.setBackground(c1);
            }
        });
        this.substract.setBackground(c1);
        this.substract.setBorderPainted(false);
        this.substract.setBounds(240, 249, 76, 46);
        this.substract.setFont(f2);
        this.substract.setForeground(Color.white);
        this.add(this.substract);

        this.one.addActionListener(this);
        this.one.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                one.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                one.setBackground(c2);
            }
        });
        this.one.setBackground(c2);
        this.one.setBorderPainted(false);
        this.one.setBounds(4, 297, 76, 46);
        this.one.setFont(f4);
        this.one.setForeground(Color.white);
        this.add(this.one);

        this.two.addActionListener(this);
        this.two.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                two.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                two.setBackground(c2);
            }
        });
        this.two.setBackground(c2);
        this.two.setBorderPainted(false);
        this.two.setBounds(83, 297, 76, 46);
        this.two.setFont(f4);
        this.two.setForeground(Color.white);
        this.add(this.two);

        this.three.addActionListener(this);
        this.three.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                three.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                three.setBackground(c2);
            }
        });
        this.three.setBackground(c2);
        this.three.setBorderPainted(false);
        this.three.setBounds(161, 297, 76, 46);
        this.three.setFont(f4);
        this.three.setForeground(Color.white);
        this.add(this.three);

        this.add.addActionListener(this);
        this.add.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                add.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                add.setBackground(c1);
            }
        });
        this.add.setBackground(c1);
        this.add.setBorderPainted(false);
        this.add.setBounds(240, 297, 76, 46);
        this.add.setFont(f2);
        this.add.setForeground(Color.white);
        this.add(this.add);

        this.plusMinus.addActionListener(this);
        this.plusMinus.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                plusMinus.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                plusMinus.setBackground(c2);
            }
        });
        this.plusMinus.setBackground(c2);
        this.plusMinus.setBorderPainted(false);
        this.plusMinus.setBounds(4, 345, 76, 46);
        this.plusMinus.setFont(f5);
        this.plusMinus.setForeground(Color.white);
        this.add(this.plusMinus);

        this.zero.addActionListener(this);
        this.zero.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                zero.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                zero.setBackground(c2);
            }
        });
        this.zero.setBackground(c2);
        this.zero.setBorderPainted(false);
        this.zero.setBounds(83, 345, 76, 46);
        this.zero.setFont(f4);
        this.zero.setForeground(Color.white);
        this.add(this.zero);

        this.comma.addActionListener(this);
        this.comma.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                comma.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                comma.setBackground(c2);
            }
        });
        this.comma.setBackground(c2);
        this.comma.setBorderPainted(false);
        this.comma.setBounds(161, 345, 76, 46);
        this.comma.setFont(f4);
        this.comma.setForeground(Color.white);
        this.add(this.comma);

        this.answer.addActionListener(this);
        this.answer.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                answer.setBackground(c5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                answer.setBackground(c3);
            }
        });
        this.answer.setBackground(c3);
        this.answer.setBorderPainted(false);
        this.answer.setBounds(240, 345, 76, 46);
        this.answer.setFont(f2);
        this.answer.setForeground(Color.white);
        this.add(this.answer);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculatrice();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.close) {
            this.dispose();
        } else if (e.getSource() == this.clearEntry) {
            this.textArea.setText("0");
        } else if (e.getSource() == this.clear) {
            this.o = this.d = this.m = this.s = this.a = false;
            this.fl0 = 0.0f;
            this.textArea.setText("0");
        } else if (e.getSource() == this.backspace) {
            this.o = this.d = this.m = this.s = this.a = false;
            if (this.textArea.getText().length() < 2) {
                this.textArea.setText("0");
            } else {
                this.textArea.setText(this.textArea.getText().substring(0, this.textArea.getText().length() - 1));
            }
        } else if (e.getSource() == this.inverse) {
            this.o = this.d = this.m = this.s = this.a = false;
            this.fl0 = 1 / Float.parseFloat(this.textArea.getText());
            String s = fl0 + "";
            this.textArea.setText(s.endsWith(".0") ? s.substring(0, s.length() - 2) : s.replace(".",
                    ","));
        } else if (e.getSource() == this.square) {
            this.o = this.d = this.m = this.s = this.a = false;
            this.fl0 = Float.parseFloat(this.textArea.getText()) * Float.parseFloat(this.textArea.getText());
            String s = fl0 + "";
            this.textArea.setText(s.endsWith(".0") ? s.substring(0, s.length() - 2) : s.replace(".",
                    ","));
        } else if (e.getSource() == this.squareRoot) {
            this.o = this.d = this.m = this.s = this.a = false;
            this.fl0 = (float) Math.sqrt(Float.parseFloat(this.textArea.getText()));
            String s = fl0 + "";
            this.textArea.setText(s.endsWith(".0") ? s.substring(0, s.length() - 2) : s.replace(".",
                    ","));
        } else if (e.getSource() == this.divide) {
            this.o = true;
            if (!d) {
                this.d = true;
                this.m = false;
                this.s = false;
                this.a = false;
                if (this.fl0 != 0.0) {
                    this.fl0 /= Float.parseFloat(this.textArea.getText());
                    String s = fl0 + "";
                    this.textArea.setText(s.endsWith(".0") ? s.substring(0, s.length() - 2) : s.replace(".",
                            ","));
                } else {
                    this.fl0 = Float.parseFloat(this.textArea.getText());
                }
            }
        } else if (e.getSource() == this.seven || e.getSource() == this.eight || e.getSource() == this.nine ||
            e.getSource() == this.four || e.getSource() == this.five || e.getSource() == this.six ||
            e.getSource() == this.one || e.getSource() == this.two || e.getSource() == this.three || e.getSource() ==
            this.zero) {
            JButton b = (JButton)e.getSource();
            if (!this.o) {
                if (this.textArea.getText().endsWith(",")) {
                    this.textArea.setText(this.textArea.getText() + b.getText());
                } else if (this.textArea.getText().equals("0")) {
                    this.textArea.setText(b.getText());
                } else {
                    this.textArea.setText(this.textArea.getText() + b.getText());
                }
            } else {
                this.o = false;
                this.textArea.setText(b.getText());
            }
        } else if (e.getSource() == this.multiply) {
            this.o = true;
            if (!m) {
                this.d = false;
                this.m = true;
                this.s = false;
                this.a = false;
                if (this.fl0 != 0.0) {
                    this.fl0 *= Float.parseFloat(this.textArea.getText());
                    String s = fl0 + "";
                    this.textArea.setText(s.endsWith(".0") ? s.substring(0, s.length() - 2) : s.replace(".",
                            ","));
                } else {
                    this.fl0 = Float.parseFloat(this.textArea.getText());
                }
            }
        } else if (e.getSource() == this.substract) {
            this.o = true;
            if (!s) {
                this.d = false;
                this.m = false;
                this.s = true;
                this.a = false;
                if (this.fl0 != 0.0) {
                    this.fl0 -= Float.parseFloat(this.textArea.getText());
                    String s = fl0 + "";
                    this.textArea.setText(s.endsWith(".0") ? s.substring(0, s.length() - 2) : s.replace(".",
                            ","));
                } else {
                    this.fl0 = Float.parseFloat(this.textArea.getText());
                }
            }
        } else if (e.getSource() == this.add) {
            this.o = true;
            if (!a) {
                this.d = false;
                this.m = false;
                this.s = false;
                this.a = true;
                if (this.fl0 != 0.0) {
                    this.fl0 += Float.parseFloat(this.textArea.getText());
                    String s = fl0 + "";
                    this.textArea.setText(s.endsWith(".0") ? s.substring(0, s.length() - 2) : s.replace(".",
                            ","));
                } else {
                    this.fl0 = Float.parseFloat(this.textArea.getText());
                }
            }
        } else if (e.getSource() == this.plusMinus) {
            this.o = this.d = this.m = this.s = this.a = false;
            if (!this.textArea.getText().equals("0")) {
                if (this.textArea.getText().startsWith("-")) {
                    this.textArea.setText(this.textArea.getText().substring(1));
                } else {
                    this.textArea.setText("-" + this.textArea.getText());
                }
            }
        } else if (e.getSource() == this.comma) {
            this.o = this.d = this.m = this.s = this.a = false;
            if (!this.textArea.getText().contains(",")) {
                this.textArea.setText(this.textArea.getText() + ",");
            }
        } else if (e.getSource() == this.answer) {
            String s0 = "";
            float f = Float.parseFloat(this.textArea.getText());
            if (d) {
                s0 = !o ? fl0 / f + "" : fl0 / fl0 + "";
            } else if (m) {
                s0 = !o ? fl0 * f + "" : fl0 * fl0 + "";
            } else if (s) {
                s0 = !o ? fl0 - f + "" : fl0 - fl0 + "";
            } else if (a) {
                s0 = !o ? fl0 + f + "" : fl0 + fl0 + "";
            }
            this.textArea.setText(s0.endsWith(".0") ? s0.substring(0, s0.length() - 2) : s0.replace(".",
                    ","));
        }
    }
}
