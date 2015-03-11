package Stack;

import java.util.Stack;

import Math.Atoi;

public class ValidParentheses {
	 public boolean isValid(String s) {
	        s = s.trim();
	        if (s.length() == 0 || s.length() == 1) return false;
	        char [] k = s.toCharArray();
	        Stack<Character> stack = new Stack<Character> ();
	        for(char cr : k ){
	            if(cr == '(' || cr == '[' || cr == '{')
	                stack.push(cr);
	             else if(cr == ')' || cr == ']' || cr == '}')
	             { 
	                
	                 if (cr == ')' && !stack.empty() && stack.peek()== '(')
	                 {
	                     stack.pop();
	                 }
	                 else if (cr == ']' && !stack.empty() && stack.peek()== '[')
	                 {
	                     stack.pop();
	                 }
	                 else if (cr == '}' && !stack.empty() && stack.peek()== '{')
	                 {	System.out.println(stack.peek());
	                     stack.pop();
	                 }
	                 
	                 else 
	                 {	
	                 	return false;
	                 }
	            }
	        }
	        
	        return stack.empty();
	    }
	  public static void main (String args[]){
		  
		  System.out.println(new ValidParentheses().isValid("()[]{}"));
	    
	    }
}
