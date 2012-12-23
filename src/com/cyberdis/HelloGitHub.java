package com.cyberdis;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;

public class HelloGitHub {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello GitHub.");
		//Second commit
		System.out.print("Get from GitHub.Commit by Zheng");
		System.out.print(qpDecoding("=E5=88=81=E5=80=A9"));
	}
	public static void parseVCard(String fileName){
		FileReader fr = null;
        try{
        	fr = new FileReader(fileName);
            BufferedReader in = new BufferedReader(fr);
            while(in.ready()){
                String line = in.readLine().trim();
                if(line.isEmpty())
                	return;
                
            }
        }
        catch(Exception e){
        	
        }
	}
	public static String qpDecoding(String str)
	 {
	  if (str == null)
	  {
	   return "";
	  }
	  try
	  {
	   str = str.replaceAll("=\n", "");
	   byte[] bytes = str.getBytes("US-ASCII");
	   //byte[] bytes = str.getBytes("UTF-8");
	   for (int i = 0; i < bytes.length; i++)
	   {
	    byte b = bytes[i];
	    if (b != 95)
	    {
	     bytes[i] = b;
	    }
	    else
	    {
	     bytes[i] = 32;
	    }
	   }
	   if (bytes == null)
	   {
	    return "";
	   }
	   ByteArrayOutputStream buffer = new ByteArrayOutputStream();
	   for (int i = 0; i < bytes.length; i++)
	   {
	    int b = bytes[i];
	    if (b == '=')
	    {
	     try
	     {
	      int u = Character.digit((char) bytes[++i], 16);
	      int l = Character.digit((char) bytes[++i], 16);
	      if (u == -1 || l == -1)
	      {
	       continue;
	      }
	      buffer.write((char) ((u << 4) + l));
	     }
	     catch (ArrayIndexOutOfBoundsException e)
	     {
	      e.printStackTrace();
	     }
	    }
	    else
	    {
	     buffer.write(b);
	    }
	   }
	   return new String(buffer.toByteArray(), "UTF-8");
	  }
	  catch (Exception e)
	  {
	   e.printStackTrace();
	   return "";
	  }
	 }

}
