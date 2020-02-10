package lesson_3_04_01;

import javax.swing.*;
import java.awt.*;

//面板设置
public class Text_JPanel {
    private static final int window_W=300;
    private static final int window_H=300;
    public static void main(String[] args) {
        JFrame window=initJFrame();

        JPanel jp1=new JPanel();
        jp1.setBackground(Color.gray);
        window.add(jp1,BorderLayout.NORTH);//默认布局是BorderLayout.CENTER 此处设置为BorderLayout.NORTH
        for(int i=1;i<=5;i++){
            JButton jbon=new JButton("按钮"+i);
            jp1.add(jbon);
        }


        JPanel jp2=new JPanel();
        jp2.setBackground(Color.blue);
        window.add(jp2,BorderLayout.WEST);
        jp2.setLayout(new GridLayout(5,1));//JPanel中按钮的布局方式是流布局
        for(int j=1;j<=5;j++){
            JButton jbon=new JButton("按钮"+j);
            jp2.add(jbon);
        }
    }
    public static JFrame initJFrame(){//创建窗口的方法
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
