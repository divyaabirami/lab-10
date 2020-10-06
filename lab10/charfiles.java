package lab10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class charfiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   FileReader fi=null;
   FileWriter fo=null;
   fi=new FileReader("input pic.PNG");
   fo=new FileWriter("output char .PNG");
   int i;
   while((i=fi.read())!=-1)
   {
	   fo.write(i);
   }
   fo.close();
	}

}
