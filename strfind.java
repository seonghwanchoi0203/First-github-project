class strfind{
	public static void main{
		
		
	}
	
	int idx1 = 0;
	int idx2 = 0;
	static int find(String input, int idx1, String tofind, int idx2){
		for(int i = idx1; i < input.length; i++){
			if(tofind[idx2] == input[i]){
				idx2++;
			}
		}
	}
}