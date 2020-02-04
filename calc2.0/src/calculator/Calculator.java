package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Calculator {
    /* boolean *********************************************************************************************************
     */
    private boolean addHasBeenClicked;
    private boolean answerHasBeenClicked;
    private boolean divideHasBeenClicked;
    private boolean multiplyHasBeenClicked;
    private boolean operatorHasBeenClicked;
    private boolean subtractHasBeenClicked;
    /* double **********************************************************************************************************
     */
    private double result0;
    private double result1;
    /* JLabel **********************************************************************************************************
     */
    private JLabel jLabel = new JLabel();
    /* JPanel **********************************************************************************************************
     */
    private JPanel jPanel = new JPanel();
    /* JFrame **********************************************************************************************************
     */
    private JFrame jFrame = new JFrame();

    public Calculator() {
        /* Color *******************************************************************************************************
         */
        Color black = new Color(0x060606);
        Color darkGrey = new Color(0x1F1F1F);
        Color grey = new Color(0x2C2C2C);
        Color lightBlack = new Color(0x131313);
        Color lightGrey = new Color(0x4A4A4A);
        Color red = new Color(0xE81123);
        /* Color[] *****************************************************************************************************
         */
        Color[] lgb = {lightGrey, black};
        Color[] lgg = {lightGrey, grey};
        Color[] lglb = {lightGrey, lightBlack};
        Color[] rdg = {red, darkGrey};
        /* Font ********************************************************************************************************
         */
        Font mdl2Assets10 = new Font("Segoe MDL2 Assets", Font.PLAIN, 10);
        Font mdl2Assets14 = new Font("Segoe MDL2 Assets", Font.PLAIN, 14);
        Font uiSemibold18 = new Font("Segoe UI Semibold", Font.BOLD, 18);
        Font uiSymbol14 = new Font("Segoe UI Symbol", Font.PLAIN, 14);
        Font uiSymbol19 = new Font("Segoe UI Symbol", Font.PLAIN, 19);
        /* int[] *******************************************************************************************************
         */
        int[] column = new int[]{4, 83, 161, 240};
        int[] row = new int[]{105, 153, 201, 249, 297, 345};
        /* int[][] *****************************************************************************************************
         */
        int[][] bounds = new int[25][4];
        bounds[0] = new int[]{274, 0, 46, 32};
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column.length; j++) {
                bounds[(i * 4) + j + 1] = new int[]{column[j], row[i], 76, 46};
            }
        }
        /* String ******************************************************************************************************
         */
        String digit = "digit";
        /* String[][] **************************************************************************************************
         */
        String[][] str = {{"\uE106", "exit"}, {"\uE94C", "percent"}, {"CE", "clearEntry"}, {"C", "clear"}, {"\uE94F",
                "backspace"}, {"\u00B9\u2044\uD835\uDC65", "inverse"}, {"\uD835\uDC65²", "square"},
                {"\u221A\uD835\uDC65", "squareRoot"}, {"\uE94A", "divide"}, {"7", digit}, {"8", digit}, {"9", digit},
                {"\uE947", "multiply"}, {"4", digit}, {"5", digit}, {"6", digit}, {"\uE949", "subtract"}, {"1", digit},
                {"2", digit}, {"3", digit}, {"\uE948", "add"}, {"\u207A\u2044\u208B", "plusMinus"}, {"0", digit}, {",",
                "comma"}, {"\uE94E", "answer"}};
        /* Button ******************************************************************************************************
         */
        Button add = new Button(this, str[20], lglb, bounds[20], mdl2Assets14);
        Button answer = new Button(this, str[24], lgg, bounds[24], mdl2Assets14);
        Button backspace = new Button(this, str[4], lglb, bounds[4], mdl2Assets14);
        Button clear = new Button(this, str[3], lglb, bounds[3], uiSymbol14);
        Button clearEntry = new Button(this, str[2], lglb, bounds[2], uiSymbol14);
        Button comma = new Button(this, str[23], lgb, bounds[23], uiSemibold18);
        Button divide = new Button(this, str[8], lglb, bounds[8], mdl2Assets14);
        Button eight = new Button(this, str[10], lgb, bounds[10], uiSemibold18);
        Button exit = new Button(this, str[0], rdg, bounds[0], mdl2Assets10);
        Button five = new Button(this, str[14], lgb, bounds[14], uiSemibold18);
        Button four = new Button(this, str[13], lgb, bounds[13], uiSemibold18);
        Button inverse = new Button(this, str[5], lglb, bounds[5], uiSymbol14);
        Button multiply = new Button(this, str[12], lglb, bounds[12], mdl2Assets14);
        Button nine = new Button(this, str[11], lgb, bounds[11], uiSemibold18);
        Button one = new Button(this, str[17], lgb, bounds[17], uiSemibold18);
        Button percent = new Button(this, str[1], lglb, bounds[1], mdl2Assets14);
        Button plusMinus = new Button(this, str[21], lgb, bounds[21], uiSymbol19);
        Button seven = new Button(this, str[9], lgb, bounds[9], uiSemibold18);
        Button six = new Button(this, str[15], lgb, bounds[15], uiSemibold18);
        Button square = new Button(this, str[6], lglb, bounds[6], uiSymbol14);
        Button squareRoot = new Button(this, str[7], lglb, bounds[7], uiSymbol14);
        Button subtract = new Button(this, str[16], lglb, bounds[16], mdl2Assets14);
        Button three = new Button(this, str[19], lgb, bounds[19], uiSemibold18);
        Button two = new Button(this, str[18], lgb, bounds[18], uiSemibold18);
        Button zero = new Button(this, str[22], lgb, bounds[22], uiSemibold18);
        /* JFrame ******************************************************************************************************
         */
        this.jFrame.getContentPane().add(this.jPanel);
        this.jFrame.getContentPane().setBackground(darkGrey);
        this.jFrame.setBounds(192, 108, 320, 395);
        this.jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.jFrame.setLayout(null);
        this.jFrame.setResizable(false);
        this.jFrame.setTitle("Calculatrice");
        this.jFrame.setUndecorated(true);
        /* jLabel ******************************************************************************************************
         */
        this.jLabel.setBackground(darkGrey);
        this.jLabel.setBounds(4, 42, 306, 60);
        this.jLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        this.jLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 40));
        this.jLabel.setForeground(Color.white);
        this.jLabel.setText("0");
        jFrame.add(this.jLabel);
        /* jPanel ******************************************************************************************************
         */
        this.jPanel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                /**/
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.isAltDown() && e.getKeyCode() == 115) {
                    exit.doClick();
                } else if (e.isShiftDown() && e.getKeyChar() == '%') {
                    percent.doClick();
                } else if (e.isAltGraphDown() && e.getKeyChar() == '@') {
                    squareRoot.doClick();
                }
                switch (e.getKeyChar()) {
                    case '*':
                        multiply.doClick();
                        break;
                    case '+':
                        add.doClick();
                        break;
                    case ',':
                    case '.':
                        comma.doClick();
                        break;
                    case '-':
                        subtract.doClick();
                        break;
                    case '/':
                        divide.doClick();
                        break;
                    case '0':
                        zero.doClick();
                        break;
                    case '1':
                        one.doClick();
                        break;
                    case '2':
                        two.doClick();
                        break;
                    case '3':
                        three.doClick();
                        break;
                    case '4':
                        four.doClick();
                        break;
                    case '5':
                        five.doClick();
                        break;
                    case '6':
                        six.doClick();
                        break;
                    case '7':
                        seven.doClick();
                        break;
                    case '8':
                        eight.doClick();
                        break;
                    case '9':
                        nine.doClick();
                        break;
                    case 'q':
                        square.doClick();
                        break;
                    case 'r':
                        inverse.doClick();
                        break;
                    default:
                        break;
                }
                switch (e.getKeyCode()) {
                    case 8:
                        backspace.doClick();
                        break;
                    case 10:
                        answer.doClick();
                        break;
                    case 27:
                        clear.doClick();
                        break;
                    case 120:
                        plusMinus.doClick();
                        break;
                    case 127:
                        clearEntry.doClick();
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                /**/
            }
        });
        this.jPanel.setFocusable(true);
        this.jPanel.requestFocusInWindow();
        
        jFrame.setVisible(true);
    }
    /* main ************************************************************************************************************
     */
    public static void main(String[] args) {
        new Calculator();
    }
    /* add *************************************************************************************************************
     */
    @SuppressWarnings("unused")
    public void add() {
        this.calculate();
        this.addHasBeenClicked = this.operatorHasBeenClicked = true;
        this.divideHasBeenClicked = this.multiplyHasBeenClicked = this.subtractHasBeenClicked = false;
    }
    /* answer **********************************************************************************************************
     */
    @SuppressWarnings("unused")
    public void answer() {
        this.answerHasBeenClicked = true;
        if (this.addHasBeenClicked) {
            this.result1 = !this.operatorHasBeenClicked ? this.result1 + this.result0 : this.result0 + this.result0;
        } else if (this.divideHasBeenClicked) {
            this.result1 = !this.operatorHasBeenClicked ? this.result1 / this.result0 : 1;
        } else if (this.multiplyHasBeenClicked) {
            this.result1 = !this.operatorHasBeenClicked ? this.result1 * this.result0 : this.result0 * this.result0;
        } else if (this.subtractHasBeenClicked) {
            this.result1 = !this.operatorHasBeenClicked ? this.result1 - this.result0 : 0;
        }
        setText(this.result1);
    }
    /* backspace *******************************************************************************************************
     */
    @SuppressWarnings("unused")
    public void backspace() {
        this.jPanel.requestFocusInWindow();
        if (!this.operatorHasBeenClicked) {
            String str = this.jLabel.getText();
            this.jLabel.setText(str.length() < 2 ? "0" : str.substring(0, str.length() - 1));
        }
    }
    /* calculate *******************************************************************************************************
     */
    public void calculate() {
        if (!this.answerHasBeenClicked && this.result1 != 0.0) {
            if (this.addHasBeenClicked) {
                this.result1 += this.result0;
            } else if (this.divideHasBeenClicked) {
                this.result1 /= this.result0;
            } else if (this.multiplyHasBeenClicked) {
                this.result1 *= this.result0;
            } else if (this.subtractHasBeenClicked) {
                this.result1 -= this.result0;
            }
            setText(this.result1);
        }
        this.result0 = Double.parseDouble(this.jLabel.getText().replace(",", "."));
    }
    /* clear ***********************************************************************************************************
     */
    @SuppressWarnings("unused")
    public void clear() {
        this.clearEntry();
        this.addHasBeenClicked = this.answerHasBeenClicked = this.divideHasBeenClicked = this.multiplyHasBeenClicked =
                this.operatorHasBeenClicked = this.subtractHasBeenClicked = false;
        this.result0 = this.result1 = 0.0;
    }
    /* clearEntry ******************************************************************************************************
     */
    public void clearEntry() {
        this.jPanel.requestFocusInWindow();
        this.jLabel.setText("0");
    }
    /* comma ***********************************************************************************************************
     */
    @SuppressWarnings("unused")
    public void comma() {
        this.jPanel.requestFocusInWindow();
        if (!this.jLabel.getText().contains(",")) {
            this.jLabel.setText(this.jLabel.getText() + ",");
        }
    }
    /* digit ***********************************************************************************************************
     */
    @SuppressWarnings("unused")
    public void digit(ActionEvent e) {
        this.jPanel.requestFocusInWindow();
        JButton jbt = (JButton)e.getSource();
        this.answerHasBeenClicked = false;
        if (!this.operatorHasBeenClicked) {
            if (this.jLabel.getText().equals("0")) {
                this.jLabel.setText(jbt.getText());
            } else {
                this.jLabel.setText(this.jLabel.getText() + jbt.getText());
            }
        } else {
            this.operatorHasBeenClicked = false;
            this.jLabel.setText(jbt.getText());
            if (this.result1 == 0.0) {
                this.result1 = this.result0;
            }
        }
        this.result0 = Double.parseDouble(this.jLabel.getText().replace(",", "."));
    }
    /* divide **********************************************************************************************************
     */
    @SuppressWarnings("unused")
    public void divide() {
        this.calculate();
        this.divideHasBeenClicked = this.operatorHasBeenClicked = true;
        this.addHasBeenClicked = this.multiplyHasBeenClicked = this.subtractHasBeenClicked = false;
    }
    /* exit ************************************************************************************************************
     */
    @SuppressWarnings("unused")
    public void exit() {
        this.jFrame.dispose();
    }
    /* inverse *********************************************************************************************************
     */
    @SuppressWarnings("unused")
    public void inverse() {
        this.operatorHasBeenClicked = true;
        this.result0 = 1 / Double.parseDouble(this.jLabel.getText().replace(",", "."));
        setText(this.result0);
    }
    /* multiply ********************************************************************************************************
     */
    @SuppressWarnings("unused")
    public void multiply() {
        this.calculate();
        this.multiplyHasBeenClicked = this.operatorHasBeenClicked = true;
        this.addHasBeenClicked = this.divideHasBeenClicked = this.subtractHasBeenClicked = false;
    }
    /* percent *********************************************************************************************************
     */
    @SuppressWarnings("unused")
    public void percent() {
        this.jPanel.requestFocusInWindow();
        this.operatorHasBeenClicked = true;
        if (this.result1 != 0.0) {
            this.jLabel.setText(String.valueOf(this.result1 * this.result0 / 100));
        } else {
            this.jLabel.setText("0");
        }
    }
    /* plusMinus *******************************************************************************************************
     */
    @SuppressWarnings("unused")
    public void plusMinus() {
        if (this.result0 != 0.0) {
            double dbl = Double.parseDouble(this.jLabel.getText().replace(",", "."));
            this.result0 = -dbl;
            setText(this.result0);
        } else {
            this.jPanel.requestFocusInWindow();
        }
    }
    /* setText *********************************************************************************************************
     */
    public void setText(Double dbl) {
        this.jPanel.requestFocusInWindow();
        String str = String.valueOf(dbl);
        this.jLabel.setText(str.endsWith(".0") ? str.substring(0, str.length() - 2) : str.replace(".", ","));
    }
    /* square **********************************************************************************************************
     */
    @SuppressWarnings("unused")
    public void square() {
        this.operatorHasBeenClicked = true;
        this.result0 = Math.pow(Double.parseDouble(this.jLabel.getText().replace(",", ".")), 2);
        setText(this.result0);
    }
    /* squareRoot ******************************************************************************************************
     */
    @SuppressWarnings("unused")
    public void squareRoot() {
        this.operatorHasBeenClicked = true;
        this.result0 = Math.sqrt(Double.parseDouble(this.jLabel.getText().replace(",", ".")));
        setText(this.result0);
    }
    /* subtract ********************************************************************************************************
     */
    @SuppressWarnings("unused")
    public void subtract() {
        this.calculate();
        this.operatorHasBeenClicked = this.subtractHasBeenClicked = true;
        this.addHasBeenClicked = this.divideHasBeenClicked = this.multiplyHasBeenClicked = false;
    }
    
    public JFrame getJFrame() {
        return this.jFrame;
    }
}
