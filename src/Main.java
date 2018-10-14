import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print(reverse(num));
        if(isPalindrome(num)){
            System.out.printf("\nIs palindrome!! ");
        }else {
            System.out.printf("\nIsn't palindrome!! ");
        }
    }
    public static int reverse(int number){
        char[] chars = Integer.toString(number).toCharArray() ;
        char temp;
        String str = "";
        int first = 0, last = chars.length-1;
        while(first<last){
            temp = chars[first];
            chars[first] = chars[last];
            chars[last] = temp;
            first++;
            last--;
        }
        for(char c: chars){
            str+=c;
        }
        int num = Integer.parseInt(str);
        return num;
    }

    public static boolean isPalindrome(int number){
        return number==reverse(number)?true:false;
    }
}
