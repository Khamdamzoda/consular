package com.example.demo.checker;

import java.io.File;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Vector;

public class GetDocument {

	
	
	
	
long number  ; 
String filename ; 
Path path; 
File file  ; 
SequenceInputStream sis ; 
Vector<File> list ; 




public GetDocument(long number , String filename) throws IOException, URISyntaxException {
	
	this.number = number ; 
	this.filename = filename ;
	path = Paths.get(new URL("\\\\172.30.1.1\\shared\\DELIV_BACKUP\\").toURI())  ;
	file  = new File(path.toString());
	
	
	
	 
}
	



public void search () {
	
	
	
	
}


}
