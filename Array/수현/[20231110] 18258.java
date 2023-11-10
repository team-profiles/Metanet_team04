import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static BufferedReader bf;
    static BufferedWriter bw;
    static int num;
    static Queue<String> queue = new LinkedList<>();
    static String end;
	public static void main(String[] args) throws Exception {
		bf = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        num = Integer.parseInt(bf.readLine());
		end = "";
		for (int i=0; i<num; i++) {
			String[] cmd = bf.readLine().split(" ");
			switch (cmd[0]) {
			case "push":
				end = cmd[1];
				queue.add(end);
				break;
			case "pop":
				bw.write(queue.isEmpty() ? -1 +"\n": queue.poll()+"\n");
				break;
			case "size":
				bw.write(queue.size()+"\n");
				break;
			case "empty":
				bw.write((queue.isEmpty() ? 1 : 0)+"\n");
				break;
			case "front":
				bw.write((queue.isEmpty() ? -1 : queue.peek())+"\n");
				break;
			case "back":
				bw.write((queue.isEmpty() ? -1 : end)+"\n");	
				break;
			}
		}
		
		bw.flush();
	}
		
}
