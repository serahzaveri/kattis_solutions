package DeduplicatingFiles;
import java.util.Scanner;
import java.util.ArrayList;

// COMP 321 Assignment 2
// Question: Deduplicating Files

public class DeduplicatingFiles {
    
    ArrayList<file> testcase;
    
    DeduplicatingFiles() {
        this.testcase = new ArrayList<file>();
    }
    
    public static void main(String[] args) {
        
        int filenumber = -1;
        Scanner scan = new Scanner(System.in);
        for(int a=0; filenumber != 0 && a<250; a++) {
            String number = scan.nextLine();
            filenumber = Integer.parseInt(number);
            //create an instance for every test case
            DeduplicatingFiles test = new DeduplicatingFiles();
            //get all files
            for(int j=0; j<filenumber; j++) {
                String line = scan.nextLine();
                boolean unique = false;
                //checks if file is unique
                for(int i=0; i<test.testcase.size(); i++) {
                	if(test.testcase.get(i).file.equals(line)) {
                		test.testcase.get(i).unique += 1;
                		unique = true;
                	}
                }
                //file added to list if not unique
                if(!unique) {
                	int key = hashFunction(line);
                    test.testcase.add(new file(key, line));
                }   
            }
            int collision = calculateCollision(test);
            if(filenumber!=0) {
            	System.out.println(test.testcase.size() + " " + collision);
            }
        }
    }
    
    
    public static int hashFunction(String file) {
        
        int character;
        int xor = 0;
        int result=0;
        
        for(int i=0; i<file.length(); i++) {
            character = file.charAt(i);
            result = character ^ xor;
            xor = result;   
        }
        
        return result;
        
    }
    
    public static int calculateCollision(DeduplicatingFiles TC) {
    	int collisions = 0;
    	
    	for(int y=0; y<TC.testcase.size(); y++) {
    		file first = TC.testcase.get(y);
    		for(int z=0; z<TC.testcase.size(); z++) {
    			file second = TC.testcase.get(z);
    			if(!first.equals(second)) {
    				if(first.hashvalue == second.hashvalue) {
    					collisions = collisions + (first.unique * second.unique);
    				}
    			}
    			
    		}
    	}
    	return collisions / 2;
    }
}


