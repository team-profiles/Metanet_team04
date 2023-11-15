import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int now = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push": {
                    int x = Integer.parseInt(st.nextToken());
                    queue.add(x);
                    now = x;
                    break;
                }
                case "pop": {
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.poll()).append("\n");
                    }
                    break;
                }
                case "size": {
                    sb.append(queue.size()).append("\n");
                    break;
                }
                case "empty": {
                    if (queue.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                }
                case "front": {
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.peek()).append("\n");
                    }
                    break;
                }
                case "back": {
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(now).append("\n");
                    }
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
