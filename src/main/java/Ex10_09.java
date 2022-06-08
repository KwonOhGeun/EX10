import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Ex10_09 { //파일 열고 닫고 개념
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:/Temp/data1.txt");
         InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

        //euc-kr
        //utf-8

        int ch;
        while((ch = isr.read()) != -1) // 기존 아스키코드를 ISR utf_8한국어로 변환
      //  while((ch =fis.read())!= -1)
            System.out.print((char) ch);
        fis.close();
    }
}
