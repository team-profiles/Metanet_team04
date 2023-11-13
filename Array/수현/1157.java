import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine().toUpperCase();
        int[] result = new int[26];
        for (int i=0; i<temp.length(); i++) result[temp.charAt(i)%((int)'A')]++;

        int max = result[0], flag = 0;
        for (int i=1; i<result.length; i++){
            if (result[i] > max){
                max = result[i];
                flag=i;
            } else if (result[i] == max){
            	flag = -1;
            }
        }
        
        System.out.println(flag == -1 ? '?' : (char)(((int)'A')+flag));
    }
}
