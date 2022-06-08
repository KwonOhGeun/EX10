public class Ex10_02 {
    public static void main(String[] args) {
        int[] aa = new int[3];

        try{
            aa[2] = 100/0; // 오류발생 2번째 catch로 밑 배열은 동작X
            aa[3] = 100; // 순서 바꿀시 첫번째 catch로
        } /*catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 첨자가 배열 크기보다 크다.");
        } catch (ArithmeticException e){
            System.out.println("0으로 나누는 등의 오류");
        } */catch ( Exception e) { //모든 에러를 잡을 수 있는 Exception 모든 catch 아래에 배치
            System.out.println("Exeption e는 모든 에러를 다 잡는다.");
            System.out.println("에러 메세지 : " + e);
        }
        finally {
            System.out.println("finally 이 부분은 무조건 출력");
        }
    }
}
