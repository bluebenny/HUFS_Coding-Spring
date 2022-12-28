import java.util.Scanner;

public class bj2941 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int count = 0;
    
        for (int i = 1; i < s.length(); i++) {
    
            if (s.charAt(i) == '=' || s.charAt(i) == '-') {
                count++;
                if (1 < i)
                    if (s.charAt(i - 1) == 'z' && s.charAt(i - 2) == 'd')
                        count++;
    
                continue;
            }

            if (s.charAt(i) == 'j' && (s.charAt(i - 1) == 'l' || s.charAt(i - 1) == 'n'))
                count++;
        }

        System.out.println(s.length() - count);
    }    
}
