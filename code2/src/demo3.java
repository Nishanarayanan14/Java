import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo3 {
    public static void main(String[] args) throws IOException {
        int n,x;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of n:");
        n=Integer.parseInt(br.readLine());
        System.out.println(n);
        System.out.println("enter the value for x:");
        x=Integer.parseInt(br.readLine());
        System.out.println(x);
    }
}
