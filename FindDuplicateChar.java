package corejava.strings;

public class FindDuplicateChar {
	
	public void findDup(String str) {
		int frequency[]=new int[256];
		for(char c:str.toCharArray()) {
			frequency[c]++;
		}
		StringBuffer dup=new StringBuffer();
		for(int i=0;i<frequency.length;i++) {
			if(frequency[i]>1) {
				dup.append((char)i);
			}
		}
		System.out.println("duplicate characters are: "+dup);
	}
	
	public static void main(String[] args) {
		new FindDuplicateChar().findDup("iam currently going through wipro training");
	}

}
