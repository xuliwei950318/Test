package com.xuliwei.multithreading.one;

import javax.swing.*;
import java.awt.*;

/**
 * Created by xuliwei on 2017/2/17.
 */
public class MyThread {
    private Button button;
    public MyThread(){
        JFrame jFrame = new JFrame();
        jFrame.setName("xuliwei");
        jFrame.setResizable(true);
        jFrame.setVisible(true);
        jFrame.setBounds(0,0,100,100);
        button = new Button("click");
        jFrame.add(button);
        button.addActionListener(e -> {
            System.out.println("xuliwei");
        });
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();

    }
}
