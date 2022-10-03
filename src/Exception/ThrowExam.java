package Exception;

public class ThrowExam {
    public static void arrayMethod()
            throws ArrayIndexOutOfBoundsException
    //throws 뒤에 예외 종류 작성
    {
        String[] irum = new String[3];
        irum[3] = "홍길동";
    }
    public static void main(String[] args) {
        ThrowExam ts = new ThrowExam();
        try {
            arrayMethod();
        }catch (ArrayIndexOutOfBoundsException ae){
            ae.printStackTrace();
            System.out.println("예외 발생"+ae.getMessage());
            System.out.println("예외 발생"+ae.toString());
        }

    }
}
