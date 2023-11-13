package practice;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Practice {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Queue<Integer> queue = new LinkedList<>();

		while (n-- > 0) {
			StringTokenizer st = null;
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String command = st.nextToken();

			switch (command) {
			case "push":
				int x = Integer.parseInt(st.nextToken());
				queue.add(x);
				break;
			case "pop":
				System.out.println(queue.isEmpty() ? -1 : queue.poll());
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				System.out.println(queue.isEmpty() ? 1 : 0);
				break;
			case "front":
				System.out.println(queue.isEmpty() ? -1 : queue.peek());
				break;
			case "back":
				System.out.println(queue.isEmpty() ? -1 : getLastElement(queue));
				break;
			}
		}
	}
	
	private static int getLastElement(Queue<Integer> queue) {
        int lastElement = 0;
        for (int element : queue) {
            lastElement = element;
        }
        return lastElement;
    }

}
