package Indexation;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class classeRI
{

	public static void main(String[] args) 
	{ 
		try {
		Lecture();
	       } catch (IOException e) {
		
		e.printStackTrace();
	}
		
		
		
		
	}
	public static void Lecture () throws IOException {

		Path path=Paths.get("E:/Users/celia/Desktop/collection/b.txt") ;
		
		System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS));
		
		List<String> lignes = Files.readAllLines(path,Charset.forName("ISO-8859-1")) ;
		
		 for ( String ligne : lignes ) 
		 {
			 System.out.println(ligne);
		 }
		
}
 	
	public static void Tokenisation ()  { 
		
	}

			
}