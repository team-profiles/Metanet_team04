import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        int max = 0;
        int cnt = 0;
        char answer = '?';

        String word = sc.nextLine();


        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            arr[(int) (word.charAt(i) - 'a')]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if ((max == arr[i]) && cnt == 0){
                answer = (char)(i+'A');
                cnt++;
            } else if (max == arr[i] && cnt >= 1) {
                answer = '?';
                break;
            }
        }
        System.out.println(answer);
    }
}
