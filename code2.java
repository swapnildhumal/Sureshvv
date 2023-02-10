package Assessment;

public class code2 {
    public static void main(String[] args) {
        printnumbers(1);
    }
    public static void printnumbers(int n){
      if (n>100){
          return;
      }
        System.out.println(n);
      printnumbers(n+1);
    }

}
