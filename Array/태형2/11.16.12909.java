
import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<String> stack = new Stack<String>();
		boolean answer = true;

        for(int i=0; i<s.length(); i++) {
        	String el = s.substring(i,i+1);
        	if(el.equals("(")) {
        		stack.push(el);
        	}else {
        		if (!stack.isEmpty()) {
        			stack.pop();
        		}else {
        			answer = false;
        			break;
        		}
        	}
        }
        
        if(!stack.isEmpty()) {
        	answer = false;
        }

        return answer;
    }
}
