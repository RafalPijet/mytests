package com.mytests;

import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;


public class PieChart extends JFrame {
    public PieChart() {
        super("Mój wykres kołowy");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPieChart chart = new MyPieChart();
        add(chart);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        new PieChart();
    }
}

class MyPieChart extends JPanel {
    public void paintComponent(Graphics comp) {
        int r = 300;
        Graphics2D comp2D = (Graphics2D) comp;
        comp2D.setColor(Color.MAGENTA);
        comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Rectangle2D.Float backgroud = new Rectangle2D.Float(0F, 0F, getSize().width, getSize().height);
        comp2D.fill(backgroud);
        comp2D.setColor(Color.yellow);
        Arc2D.Float arc1 = new Arc2D.Float((getSize().width / 2) - (r / 2), (getSize().height / 2) - (r / 2), r, r, 0, 45, Arc2D.PIE);
        comp2D.draw(arc1);
        GradientPaint gp = new GradientPaint(0F, 0F, Color.GREEN, 350F, 350F, Color.orange, false);
        comp2D.setPaint(gp);
        comp2D.fill(arc1);
        comp2D.setColor(Color.red);
        Arc2D.Float arc2 = new Arc2D.Float((getSize().width / 2) - (r / 2), (getSize().height / 2) - (r / 2), r, r, 45, 102, Arc2D.PIE);
        comp2D.fill(arc2);
        comp2D.setColor(Color.blue);
        Arc2D.Float arc3 = new Arc2D.Float((getSize().width / 2) - (r / 2), (getSize().height / 2) - (r / 2), r, r, 147, 50, Arc2D.PIE);
        comp2D.fill(arc3);
        comp2D.setColor(Color.black);
        Arc2D.Float arc4 = new Arc2D.Float((getSize().width / 2) - (r / 2), (getSize().height / 2) - (r / 2), r, r, 197, 73, Arc2D.PIE);
        comp2D.fill(arc4);
        comp2D.setColor(Color.gray);
        Arc2D.Float arc5 = new Arc2D.Float((getSize().width / 2) - (r / 2), (getSize().height / 2) - (r / 2), r, r, 270, 90, Arc2D.PIE);
        comp2D.fill(arc5);
        System.out.println();
    }
}
