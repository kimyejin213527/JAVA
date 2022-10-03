package srcvector;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        //문자열만 삽입 가능한 ArrayList컬렉션 생성
        ArrayList<String> a = new ArrayList<String>();
        //키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<4; i++){
            System.out.println("이름을 입력하세요 >>");
            String s = scanner.next();//키보드로부터 입력
            a.add(s);
        }
        //ArrayList에 들어있는 모든 이름 출력
        for (int i=0; i<a.size(); i++){
            String name = a.get(i);
            System.out.println(name+"");
        }
        //가장 긴 이름을 찾아서 출력
        int longestIndex = 0;
        for (int i=0; i<a.size(); i++){
            if (a.get(longestIndex).length() < a.get(i).length()){
                longestIndex = i;
            }
        }
        System.out.println("\n가장 긴 이름은:"+a.get(longestIndex));
        scanner.close();
    }
}
