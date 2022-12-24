package org.java.test;

public class Task {
public static void main(String[] args) {
	
	String st = "Java Course";
	String s = "JavaCourse";
	
	boolean b = st.equals(s);
	System.out.println(b);
	
	int l = st.length();
	System.out.println(l);
	
	String g = st.toUpperCase();
	System.out.println(g);
	
	String e = s.toLowerCase();
	System.out.println(e);

      boolean h = st.startsWith("ja");
      System.out.println(h);
      
      boolean r = s.endsWith("se");
      System.out.println(r);
      
      String d = st.concat(s);
      System.out.println(d);
      
      String t = "Good Morning";
       char [] o = t.toCharArray();
    		   for (int i = 0; i < o.length; i++) {
				System.out.println(o[i]);
    		   }
			String q = s.replaceAll("JavaCourse", "java course is started")	;
			System.out.println(q);
				
			}
	}
    		   
      
      
      
      
      
      
	
	



