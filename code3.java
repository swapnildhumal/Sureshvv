package Assessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code3 {
    public static void main(String[] args) throws IOException {
        int n,c,f=1;
        System.out.println("enter an integer to calculate its factorial");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        if (n<0)
            System.out.println("number should be non-negative");
        else
        {
            for (c=1; c<=n; c++)
                f=f*c;
            System.out.println("factorial of "+n+" is ="+f);
        }

    }
}
