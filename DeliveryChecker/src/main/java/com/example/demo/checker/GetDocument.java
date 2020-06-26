package com.example.demo.checker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;







public class GetDocument {


public GetDocument() {

      
	
}








public static void search() throws IOException {
Path path = Paths.get("\\\\172.30.1.1\\Shared\\DELIV_BACKUP\\2020_backup\\1_quarter");
File pathtofile = path.toFile() ; 
List<File> filesList ;
BufferedReader br ; 
Scanner scan  ; 
File file; 
try {
	
	
	if(pathtofile.isDirectory()){
		
	    filesList = new ArrayList<File>() ; 
		File[] files = pathtofile.listFiles() ; 			
		filesList.addAll(Arrays.asList(files)) ; 	
		
		
		for (int i=0; i<filesList.size(); i++) {
			file = (File) filesList.get(i) ; 
			
			
			
			
			scan = new Scanner (new BufferedReader(new FileReader(file ))); 
			while (scan.hasNextLine()){
		    String str = scan.findInLine("403119776");
	   
   
      
        if(str!=null) {
        	System.out.println("found" + "\t"+ str + "at\t" + file.getName());
            }
            	
            
            scan.nextLine(); 
                   
            }
			
		  
		}	
}
	
}catch(Exception ex) {
	ex.printStackTrace();
}
	





		
	}
	
	
}










