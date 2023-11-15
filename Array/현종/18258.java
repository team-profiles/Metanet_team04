import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		ArrayList<Integer> queue = new ArrayList<Integer>();
		int T = Integer.parseInt(br.readLine());
        
		for(int i=1; i<=T; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			if(command.equals("push")) {
				queue.add(Integer.parseInt(st.nextToken()));
			}
			if(command.equals("pop")) {
				if(queue.isEmpty())
					bw.write(-1+"\n");
				else {
					bw.write(queue.get(0)+"\n");
					queue.remove(0);
				}
			}
			if(command.equals("size")) {
				bw.write(queue.size()+"\n");
			}
			if(command.equals("empty")) {
				bw.write(((queue.isEmpty())?1:0)+"\n");
			}
			else if(command.equals("front")) {
				if(queue.isEmpty())
					bw.write(-1+"\n");
				else
					bw.write(queue.get(0)+"\n");
			}			
			else if(command.equals("back")) {
				if(queue.isEmpty())
					bw.write(-1+"\n");
				else
				bw.write(queue.get(queue.size()-1)+"\n");
			}		
		}
		bw.flush();
		bw.close();
		br.close();
	}
}