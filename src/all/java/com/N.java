package all.java.com;

import java.io.IOException;

public class N {

	 public static void main(String[] args)
	    {
	        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
	 
	        try
	        {
	            runtime.exec("Notepad++.exe");        //opens new notepad instance
	 
	            //OR runtime.exec("notepad");
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	    }
	}