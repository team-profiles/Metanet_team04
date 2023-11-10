import java.io.*;
import java.util.ArrayList;

public class Main {
	static BufferedReader bf;
	static BufferedWriter bw;
	static int num;
	static ArrayList<String> queue = new ArrayList<>();
	static int count = 0;
	
	public static void main(String[] args) throws Exception {
		bf = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
		num = Integer.parseInt(bf.readLine());
		for (int i=0; i<num; i++) {
			String[] cmd = bf.readLine().split(" ");
			if (count == 0 && (cmd[0].equals("pop") || cmd[0].equals("front") || cmd[0].equals("back")) ) {
				bw.write(-1+"\n");
				continue;
			}
			
			switch (cmd[0]) {
			case "push":
				queue.add(cmd[1]);
				count++;
				break;
			case "pop":
				bw.write(queue.remove(0)+"\n");
				count--;
				break;
			case "size":
				bw.write(count+"\n");
				break;
			case "empty":
				bw.write((count == 0 ? 1 : 0)+"\n");
				break;
			case "front":
				bw.write(queue.get(0)+"\n");
				break;
			case "back":
				bw.write(queue.get(count-1)+"\n");	
				break;
			}
		}
		
		bw.flush();
	}
		
}
