import java.net.SocketOption;

public class Test {
    public static void main(String[] args) {

        String s = "hello";
        StringBuilder ss = new StringBuilder("himanshu");
        for(int i=0;i<s.length();i++){
            ss.setCharAt(i,'0');

            System.out.println(ss.charAt(i));
        }
    }
}
