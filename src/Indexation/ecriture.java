package Indexation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ecriture {

	public static void main(String[] args)throws IOException  {
		
		Path path=Paths.get("E:/Users/celia/Desktop/collection/resultat.txt") ;
		 String text="vive krimo héhéhéhéhéh !!! " ;
		
		Files.write(path, text.getBytes("ISO-8859-1")) ;
		
	}

}
