package lesson_3_01_01;

import javax.swing.*;
import java.awt.*;


public class Text_JFrame {
    public static void main(String[] args) {
        JFrame window=new JFrame("窗口的学习");//创建窗口
        window.setVisible(true);//设置窗口可见
        window.setSize(500,300);//设置窗口大小
        window.setLocation(300,300);//设置窗口显示位置
        //window.setBounds(200,200,500,500);//窗口大小、位置同时设置


        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗口关闭
                                            /**
                                             * EXIT_ON_CLOSE 隐藏窗口并停止程序
                                             * DO_NOTHING_ON_CLOSE 无任何操作
                                             *HIDE_ON_CLOSE  隐藏窗体 但不停止程序
                                             * DISPOSE_ON_CLOSE 释放窗体资源
                                             */
        window.setIconImage(new ImageIcon("./.idea/picture/text.jpg").getImage());//设置图标   Icon：图标

    }
}
