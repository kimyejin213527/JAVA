package GUI;

import javax.swing.*;

import java.awt.*;

public class ComponentEx extends JFrame {

    public ComponentEx() {

        setTitle("체크박스 만들기 예제");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(new FlowLayout());

        ImageIcon cherryIcon = new ImageIcon("images/cherry.png");
        ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.png");
        //그림으로 아이콘 사용

//        //체크박스 설정
//        JCheckBox apple = new JCheckBox("사과");
//        JCheckBox pear = new JCheckBox("배", true);
//        //초기 선택값 설정 -> selected.true
//        JCheckBox cherry = new JCheckBox("체리", cherryIcon);
//        //imageIcon이 일반형태와 선택된 형태 구별
//
//        cherry.setBorderPainted(true);
//        cherry.setSelectedIcon(selectedCherryIcon);

        //라디오 버튼 설정
        ButtonGroup g = new ButtonGroup();

        JRadioButton apple = new JRadioButton("사과");
        JRadioButton pear = new JRadioButton("배", true);
        //초기 선택값 설정 -> selected.true
        JRadioButton cherry = new JRadioButton("체리", cherryIcon);
        //imageIcon이 일반형태와 선택된 형태 구별
        cherry.setBorderPainted(true);
        cherry.setSelectedIcon(selectedCherryIcon);

        //라디오 버튼을 그룹에 추가 -> 중복선택 불가능
        g.add(apple);
        g.add(pear);
        g.add(cherry);

        //화면에 추가
        c.add(apple);
        c.add(pear);
        c.add(cherry);

        setSize(250, 150);
        setVisible(true);

    }

    public static void main(String[] args) {

        new ComponentEx();

    }
}