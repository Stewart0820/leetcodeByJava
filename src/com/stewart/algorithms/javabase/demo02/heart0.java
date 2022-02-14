package com.stewart.algorithms.javabase.demo02;

import javax.swing.*;

import java.awt.*;

import java.awt.event.WindowEvent;

import java.awt.event.WindowListener;

import java.util.Date;

class ILoveYou extends Frame implements Runnable {
    public ILoveYou() {
// this.setComponentZOrder(this, 2);

        this.setBounds(Constant.X, Constant.Y, Constant.WIDTH, Constant.HEIGHT);

        this.setTitle(Constant.string);

        this.setVisible(true);

        this.setBackground(Color.BLACK);

        this.setExtendedState(MAXIMIZED_BOTH);

        this.addWindowListener(new WindowListener() {
                                   @Override

                                   public void windowOpened(WindowEvent e) {
                                   }

                                   @Override

                                   public void windowIconified(WindowEvent e) {
// TODO Auto-generated method stub

                                   }

                                   @Override

                                   public void windowDeiconified(WindowEvent e) {
// TODO Auto-generated method stub

                                   }

                                   @Override

                                   public void windowDeactivated(WindowEvent e) {
// TODO Auto-generated method stub

                                   }

                                   @Override

                                   public void windowClosing(WindowEvent e) {
                                       System.exit(0);

                                   }

                                   @Override

                                   public void windowClosed(WindowEvent e) {
// TODO Auto-generated method stub

                                   }

                                   @Override

                                   public void windowActivated(WindowEvent e) {
// TODO Auto-generated method stub

                                   }

                               }

        );

    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 500; i++) {
            g.setColor(new Color((int) (Math.random() * 256), (int) (Math

                    .random() * 256), (int) (Math.random() * 256)));

            g.drawString("★", (int) (Math.random() * 1366), (int) (Math

                    .random() * 768));

        }

        g.setFont(new Font("微软雅黑", Font.BOLD, 150));

        g.drawString(Constant.string, Constant.X - 80, Constant.Y + 250);

        g.setColor(new Color((int) (Math.random() * 256),

                (int) (Math.random() * 256), (int) (Math.random() * 256)));

        g.drawString(new Date().toLocaleString(), 5, 200);

        g.setColor(new Color((int) (Math.random() * 256),

                (int) (Math.random() * 256), (int) (Math.random() * 256)));

        g.setFont(new Font("微软雅黑", Font.BOLD, 200));

        g.drawString(Constant.string1, 100, 650);

    }

    @Override

    public void run() {
        while (true) {
            try {
                Thread.sleep(500);

            } catch (Exception e) {
                e.printStackTrace();

            }

            repaint();

        }

    }

    public static void main(String[] args) {
        new Thread(new ILoveYou()).start();

    }

}


class Constant {
    static final int WIDTH = 800;

    static final int HEIGHT = 450;

    static final int X = (Toolkit.getDefaultToolkit().getScreenSize().width - WIDTH) / 2;

    static final int Y = (Toolkit.getDefaultToolkit().getScreenSize().height - HEIGHT) / 2;

    static final int WIDTH_BUFF = 300;

    static final int HEIGHT_BUFF = 100;

    static final int X_BUFF = (WIDTH - WIDTH_BUFF) / 2;

    static final int Y_BUFF = (HEIGHT - HEIGHT_BUFF) / 2;

    static final String string = "I LOVE YOU !";

    static final String string1 = "★ 一生一世 ★";

}
