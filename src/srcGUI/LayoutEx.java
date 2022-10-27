package srcGUI;

import javax.swing.*;
import java.awt.*;

public class LayoutEx extends JFrame {
    public LayoutEx(){
        setTitle("Layout sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

//        //FlowLayout 설정
//        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
//        //hgap -> 컴포넌트끼리 수평 거리
//        //vGap -> 컴포넌트끼리 수직 거리
//        contentPane.add(new JButton("add"));
//        contentPane.add(new JButton("sub"));
//        contentPane.add(new JButton("mul"));
//        contentPane.add(new JButton("div"));
//        contentPane.add(new JButton("Calculate"));

//        //BorderLayout 설정
//        contentPane.setLayout(new BorderLayout(30,20));
//        //hgap -> 컴포넌트끼리 수평 거리
//        //vGap -> 컴포넌트끼리 수직 거리
//        contentPane.add(new JButton("add"),BorderLayout.NORTH);
//        contentPane.add(new JButton("sub"),BorderLayout.SOUTH);
//        contentPane.add(new JButton("mul"),BorderLayout.EAST);
//        contentPane.add(new JButton("div"),BorderLayout.WEST);
//        contentPane.add(new JButton("Calculate"),BorderLayout.CENTER);

        //GridLayout
        contentPane.setLayout(new GridLayout(3,3));
        //row - 행의 개수
        //cols -> 열의 개수
        for (int i = 1; i < 10; i++) {
            String text = Integer.toString(i); //Wrapper 클래스를 이용하여 i를 문자열로 변환
            JButton button = new JButton(text);
            contentPane.add(button);

        }

        //JFrame 설정
        setSize(300,200);
        setVisible(true);
    }//프레임 설정

    public static void main(String[] args) {
        new LayoutEx();//객체 생성
    }
}
