

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_좋은단어_3986 {
    static int TC, CNT;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Stack<Character>S = new Stack<>();
    
    static void inputNsolve() throws IOException {
        TC = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < TC; tc++) {
        	solve();
        	if( S.isEmpty() ) CNT++ ;
        	
        	S.clear();
        }
        System.out.println( CNT );
    }
    
    static void solve() throws IOException {
    	String word = br.readLine();
        int idx = 0;
        
        for (int i = 0; i < word.length(); i++) {
        	char tmp = word.charAt(i);
        	
        	if( !S.isEmpty() && tmp == S.peek()) S.pop();
        	else S.add(tmp);
		} 
    }
    
    
    public static void main(String[] args) throws IOException {
        inputNsolve();
    }
}
