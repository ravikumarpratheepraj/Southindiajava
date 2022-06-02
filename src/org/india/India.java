package org.india;

import org.tamilnadu.Tamilnadu;
import org.andrapradesh.Andrapradesh;
import org.kerala.Kerala;

public class India extends Tamilnadu {
	private void india() {
		System.out.println("india");
	}
	public static void main(String[] args) {
		India i=new India();
		i.india();
		i.tamil();
	    i.telugu(); 
	    i.malayalam();
	}

}
