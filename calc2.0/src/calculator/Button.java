package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Button {
    /* JButton *********************************************************************************************************
     */
    private JButton jButton;

    public Button(Calculator clc, String[] str, Color[] clr, int[] bnd, Font fnt) {
        jButton = new JButton(str[0]);
        jButton.addActionListener(e -> {
            try {
                if (!str[1].equals("digit")) {
                    Method mth = Calculator.class.getMethod(str[1]);
                    mth.invoke(clc);
                } else {
                    Method mth = Calculator.class.getMethod(str[1], ActionEvent.class);
                    mth.invoke(clc, e);
                }
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
                /**/
            }
        });
        jButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                /**/
            }

            @Override
            public void mousePressed(MouseEvent e) {
                /**/
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                /**/
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jButton.setBackground(clr[0]);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jButton.setBackground(clr[1]);
            }
        });
        jButton.setBackground(clr[1]);
        jButton.setBorderPainted(false);
        jButton.setBounds(bnd[0], bnd[1], bnd[2], bnd[3]);
        jButton.setFocusPainted(false);
        jButton.setFont(fnt);
        jButton.setForeground(Color.white);
        clc.getJFrame().add(jButton);
    }
    /* doClick *********************************************************************************************************
     */
    public void doClick() {
        jButton.doClick();
    }
}
