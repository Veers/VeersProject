package com.company.gui;

import javax.swing.*;

public class MainWindow {

    private static volatile MainWindow instance;

    public static MainWindow getInstance() {
        MainWindow localInstance = instance;
        if (localInstance == null) {
            synchronized (MainWindow.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new MainWindow();
                }
            }
        }
        return localInstance;
    }

    public void showWindow() {
        JFrame mainFrame = new JFrame("Application");
        mainFrame.setSize(500, 300);
        mainFrame.setLocation(150, 150);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//        mainFrame.setVisible(true);
    }
}
