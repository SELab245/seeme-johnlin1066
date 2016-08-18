package fcu.selab.training;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	FileInputStream fis=null;
    	FileOutputStream fos=null;
    	StringBuilder sb=new StringBuilder();
    	//////////////////////////////////////////
    	try {
			fis=new FileInputStream("input.txt");
    	
    	int c;
    	while((c=fis.read())!=-1)
    		sb.append((char)c);
    		
    	
    	System.out.println(sb);
    	
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	finally{
    		try{
    			fis.close();
    		}catch(IOException e){
    			
    		}
    	}
    	///////////////////////////////////////////
    	String[] s=sb.toString().split(",");
    	Arrays.sort(s);
    	
    	sb=new StringBuilder();
    	for(int i=0;i<s.length;i++)
    		sb.append(" "+(char)(((int)s[i].charAt(0))+32)+". "+s[i]);
    	///////////////////////////////////////////
    	
    	byte[] data=sb.toString().getBytes();
    	
    	try {
			fos=new FileOutputStream("output.txt",false);
			fos.write(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	finally{
    		try{
    			fos.close();
    		}catch(IOException e){
    			
    		}
    	}
    	
    	
    	
    	
    	
    }
}
