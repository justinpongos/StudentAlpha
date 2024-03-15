
public class StudentAlpha {
	public static void main(String[]args) {
	String[] students = {"Rohan", "Ronin", "Nicos", "Zach"};
	String[] alpha = new String [students.length];
	
	for(int x = 0; x < students.length; x++) {
	for(int y = x+1; y < students.length; y++) {		
		int z = students[x].compareTo(students[y]);
		if (z > 0){
			String s = students[x];
			students[x] = students[y];
			students[y] = s;
		}//end if
	}//end for
	alpha[x] = students[x];
	}//end for
	for (int x = 0; x < students.length; x++) {
	System.out.println(alpha[x]);
		}//end for
	}//end main
}//end class
