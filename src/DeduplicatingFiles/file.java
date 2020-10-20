package DeduplicatingFiles;

public class file {
	
	String file;
	int hashvalue;
	int unique = 1;
	
	file(int hashcode, String file) {
		this.hashvalue = hashcode;
		this.file = file;
	}
	
}
