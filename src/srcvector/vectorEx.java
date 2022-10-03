package srcvector;

import java.util.Vector;

public class vectorEx {
    public static void main(String[] args) {
        //정수값(Integer)만 다루는 제네릭 백터 생성
        Vector<Integer> v= new Vector<Integer>();

        v.add(5); //5삽입 자동 박싱 Wrapper 클래스 자동 사용
        v.add(4);
        v.add(-1);
        //컬렉션의 경우 5,4,-1 배열의 경우 5,4,100
        v.add(2,100);

        System.out.println("백터내의 요소 객체 수:"+v.size());//예상 4 출력
        System.out.println("백터의 현재 용량:"+v.capacity());

        //모든 요소 출력
        for (int i = 0; i< v.size(); i++){//요소 수만큼 반복
            int n = v.get(i);//자동 언박싱

            System.out.println(n);
        }
        //벡터내의 모든 정수 더하기
        int sum = 0;
        for (int i = 0; i < v.size(); i++){
            int n = v.elementAt(i);//get, elementAt 둘 다 요소 값을 리턴, 차이없음
            sum += n;
        }
        System.out.println("벡터에 있는 정수의 합:"+sum);
    }
}
