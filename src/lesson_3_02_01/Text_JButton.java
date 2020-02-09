package lesson_3_02_01;

import javax.swing.*;
import java.awt.*;


public class Text_JButton {
    private static final int window_W=300;
    private static final int window_H=300;
    public static void main(String[] args) {
        JFrame window=initJFrame();
        JButton jbutton1=new JButton("我是按钮1");//按钮的创建
        window.add(jbutton1);//添加按钮组件
        jbutton1.setSize(50,10);//设置按钮1的大小

        JButton jbutton2=new JButton("我是按钮2");//按钮的创建
        window.add(jbutton2);//添加按钮组件
        jbutton1.setSize(50,20);//设置按钮2的大小

        JButton jbutton3=new JButton("我是按钮3");//按钮的创建
        window.add(jbutton3);//添加按钮组件
        jbutton1.setSize(50,30);//设置按钮3的大小
        //按钮大小设置无用，且后面按钮会覆盖前面按钮，这是因为布局的原因
    }
    public static JFrame initJFrame(){
        JFrame window=new JFrame("窗口的学习");//创建窗口
        window.setVisible(true);//设置窗口可见
        window.setSize(500,300);//设置窗口大小
        //window.setLocation(window_W,window_H);//设置窗口显示位置
        //window.setBounds(200,200,500,500);//窗口大小、位置同时设置


        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗口关闭
        /**
         * EXIT_ON_CLOSE 隐藏窗口并停止程序
         * DO_NOTHING_ON_CLOSE 无任何操作
         *HIDE_ON_CLOSE  隐藏窗体 但不停止程序
         * DISPOSE_ON_CLOSE 释放窗体资源
         */
        window.setIconImage(new ImageIcon("./.idea/picture/text.jpg").getImage());//设置图标   Icon：图标


        /**
         *     学习设置窗口居中
         *       获取屏幕尺寸  Toolkit类(获取没有去除任务栏的尺寸)
         *                    GraphicsEnvironment(获取去除任务栏的尺寸)
         */
//       Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
//        System.out.println("宽度"+dimension.width+",高度"+dimension.height);
//        int x=(dimension.width-window_W)/2;
//        int y=(dimension.height-window_H)/2;
//        window.setLocation(x,y);



        GraphicsEnvironment grap =GraphicsEnvironment.getLocalGraphicsEnvironment();
        Rectangle rect = grap.getMaximumWindowBounds();
        System.out.println("宽度"+rect.width+",高度"+rect.height);
        int m=(rect.width-window_W)/2;
        int n=(rect.height-window_H)/2;
        window.setLocation(m,n);
        return window;
    }
}
