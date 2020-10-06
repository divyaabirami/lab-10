
package lab10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class binaryfiles {

	public static void main(String[] args) throws IOException {
		FileInputStream fi=null;
		FileOutputStream fo=null;
		fi=new FileInputStream("input pic.PNG");
		fo=new FileOutputStream("output bin.PNG");
		int i;
		while((i=fi.read())!=-1)
		{
			fo.write(i);
		}
		fo.close();
		

	}

}
