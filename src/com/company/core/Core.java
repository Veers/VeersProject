package com.company.core;

import com.company.gui.MainWindow;

import java.util.Map;
import java.util.Properties;

public class Core {

    public Core(){
        checkEnv();
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        MainWindow mainWindow = MainWindow.getInstance();
        mainWindow.showWindow();
    }

    private void checkEnv() {
        Runtime runtime = Runtime.getRuntime();
        Map<String, String> envMap = System.getenv();
        Properties sysProps = System.getProperties();
//        System.out.println(envMap.size());
//        System.out.println(sysProps.size());
    }
}
