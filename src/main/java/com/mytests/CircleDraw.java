package com.mytests;

import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;


public class CircleDraw extends JFrame {
    public CircleDraw() {
        super("Moje koło ha, ha");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyCircle circle = new MyCircle();
        add(circle);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        new CircleDraw();
    }
}

class MyCircle extends JPanel {
    public void paintComponent(Graphics comp) {
        int r = 200;
        Graphics2D comp2D = (Graphics2D) comp;
        comp2D.setColor(Color.red);
        comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Rectangle2D.Float backgroud = new Rectangle2D.Float(0F, 0F, getSize().width, getSize().height);
        comp2D.fill(backgroud);
        comp2D.setColor(Color.pink);
        Ellipse2D.Float circle = new Ellipse2D.Float((getSize().width / 2) - (r / 2), (getSize().height / 2) - (r / 2), r, r);
        comp2D.draw(circle);
        GradientPaint gp = new GradientPaint(0F, 0F, Color.GREEN, 350F, 350F, Color.orange, false);
        comp2D.setPaint(gp);
        comp2D.fill(circle);
    }
}
