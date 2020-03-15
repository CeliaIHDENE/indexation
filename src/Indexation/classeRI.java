package Indexation;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class classeRI {
	
	
	 
	
	    public static void main(String[] args)
	    { 		
	        String filePath = "E:/exposés/RI/collection/b.txt";
	       lectureMot( filePath )  ;
	        //System.out.println( readAllBytesJava7( filePath ) );
	    }
	 
	    //Read file content into string with - Files.readAllBytes(Path path)
	 
	    private static String lectureMot(String filePath) 
	    { 
	    String SEPARATEUR = " " ;
	        String content = "";
	 
	        try
	        {     Path path=Paths.get("E:/exposés/RI/collection/resultat.txt") ;
  
	            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
	            String mots[] = content.split(SEPARATEUR);//separer les mots

	          
	            String a= "";
	            for (int i=0 ; i< mots.length; i++) { //retour a la ligne apres chaque mot
	            	 
	            	if ( mots[i].length() >7 ) { mots[i] = mots[i].substring(0, 7); } // troncature
	            			
	            	
	            	 String text=mots[i];
	            	
	                    text=text.concat("\n");
	                    
	                    
	            	 a= a.concat(text);
              }
	            a=a.toLowerCase(); //retire majuscule
	            
	             //retire la ponctuation
	             
	               String b ="?" ; a=a.replace(b,"");
	               String c ="!" ; a=a.replace(c,"");
	               String d ="," ; a=a.replace(d,"");
	               String e ="'" ; a=a.replace(e,"\n");
	               String f =";" ; a=a.replace(f,"");
	               String g ="." ; a=a.replace(g,"");
	               String h ="-" ; a=a.replace(h,"");
	               String i =":" ; a=a.replace(i,"");
	            
	           
	             //ecriture dans un fichier 
 				Files.write(path, a.getBytes("ISO-8859-1")) ;

	   		
	   		
	           
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	 
	        return content;
	    }
	}
	
	
 


