import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class main {

    public static void main(String[] args) throws IOException {

        final String input = new String( Files.readAllBytes(Paths.get("data.txt")), "UTF-8");
        char[] dividedstring = input.toCharArray();//буквы разбитой строки
//----------------------------------------------------------------------------------------------------------------------
// разбиение входной строки на числовые аски значения
        byte[] bytes = input.getBytes("windows-1251");
        for (int v = 0; v < bytes.length; v++){
            System.out.println("["+bytes[v]+"]");
        }
        // System.out.println(bytes[0]);
//----------------------------------------------------------------------------------------------------------------------
// вывод исходной строки посимвольно
        for (int i = 0; i < dividedstring.length; i++) {
            System.out.print("[" + dividedstring[i] + "] ");
        }
//----------------------------------------------------------------------------------------------------------------------
        System.out.print("\nHash function 2 H(x) = y ");
        System.out.println("\nx is ["+input+"]");
//----------------------------------------------------------------------------------------------------------------------
//формула
        double result2;//результат хэш-функции
        double a = bytes[0];
        double b = bytes[1];
        int c = bytes[2];
        int d = bytes[3];
        int f = bytes[4];
        for (int x = 5; x < bytes.length; x++){
            f = f+bytes[x];
        }
        if( Math.abs(a) >=10){
            a = Math.round(bytes[0]/5);
             // System.out.println(a);
        }
        if( Math.abs(b) >=10){
            b = Math.round(bytes[1]/5);
             // System.out.println(b);
        }
        if ( Math.abs(c) >=10){
            c = Math.round(bytes[2]/5);
             // System.out.println(c);
        }
        if ( Math.abs(d) >=10){
            d = Math.round(bytes[3]/5);
             // System.out.println(d);
        }
        //System.out.println("a="+a+"b="+b+"c="+c+"d="+d);
        if (a <=0 || b<=0 || c <=0 || d <= 0 || f <=0){
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
            d = Math.abs(d);
            f = Math.abs(f);

              System.out.println("a="+a+"b="+b+"c="+c+"d="+d);
            result2 = Math.pow(a+b,c)+Math.sqrt(d)+f;
        }
        else {result2 =  Math.pow((a+b)/10,c/10)+Math.sqrt(d)+f;
        //System.out.println(result2);
        }
        result2 = (int)Math.round(result2);
        System.out.println("f="+f);
        System.out.println("RESULT y = "+result2);
//----------------------------------------------------------------------------------------------------------------------
    }
}
