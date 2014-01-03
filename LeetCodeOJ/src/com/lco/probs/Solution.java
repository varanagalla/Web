/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 */
package com.lco.probs;

import java.util.Stack;

/**
 * @author vpsrini
 *
 */
public class Solution {
	 
	
	public int evalRPN(String[] tokens) {
        int result = 0;
        Stack<Integer> stack = null;
        if(this.validateRPN(tokens)){
        	stack = new Stack<Integer>();
            for (String token : tokens){
            	token = token.trim();
            	if(token.matches("-?\\d+")){
            		stack.push(Integer.valueOf(token));
            	}else {
            		int b = stack.pop();
            		int a = stack.pop();
            		stack.push(evaluate(a,b,token));
            	}
            }
        }else{
        	throw new RuntimeException("The Given expression is invalid");
        }
        
        if(!stack.isEmpty()){
        	result = stack.pop();
        }
        return result;
    }
	
	private boolean validateRPN(String[] tokens){
		boolean isValid = true;
		int noCount=0;
		int opCount=0;
		for(String token : tokens){
			token = token.trim();
			if(token.matches("-?\\d+")){
				noCount++;
				continue;
			}else if(token.equals("+") ||
					token.equals("-") ||
					token.equals("*") ||
					token.equals("/")){	
				opCount++;
			}
			else {
				return false;
			}
		}
		if(noCount - opCount > 1){
			isValid = false;
		}
		return isValid;
	}
	
	private int evaluate(int a, int b, String op){
		int result = 0;
		if(op.equals("+")){
			result = a + b;
		}else if(op.equals("-")){
			result = a - b;
		}else if(op.equals("*")){
			result = a * b;
		}else{
			result = a/b;
		}
		return result;
	}
}
