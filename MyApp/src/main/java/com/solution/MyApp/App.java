package com.solution.MyApp;

import java.util.Map;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception
    {
    	StringBuilder sb = new StringBuilder();
    	Map<Character,Integer> letters = new TreeMap<>();
    	
        if(args.length > 0) {
        	for(String arg : args) {
        		sb.append(arg);
        	}
        } else {
        	throw new Exception("Illegal number of arguments");
        }
        
        String argument = sb.toString().toLowerCase();
        
        
        for(int i = 0; i < argument.length(); i++) {
        	if(letters.containsKey(argument.charAt(i))) {
        		int value = letters.get(argument.charAt(i));
        		value++;
        		letters.put(argument.charAt(i), value);
        	} else {
        		letters.put(argument.charAt(i), 1);
        	}
        }
        
        System.out.println("Counted letters:");
        
        for(var entry : letters.entrySet()) {
        	System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        
    }
}
