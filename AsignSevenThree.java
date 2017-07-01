
public class AsignSevenThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String main = "This is the solution of assignment 7.3"; //main string 
		String substring ="lution";								//sub string that is to be searched
		char[] mainarray = main.toCharArray();					//converted the string to the array list of characters
		
		char[] subarray = substring.toCharArray();
		
		//checking the if the sub string is present in or not 
		for(int i=0;i<mainarray.length;i++){ 					//looping through each element of main array lsit
			
			for(int j =0;j<subarray.length;j++){				//looping thourgh each element of sub list and 
				if(mainarray[i+j]==subarray[j]){				//comapring it with the elemetn of main array llist
					
					if(j==subarray.length-1){					//if every element of sub string is presnt in same order in main list will will declare string  found
						System.out.println("Substring : '"+substring+"' is present in the main string : '"+main+"'");
					}
				}
				else
				break;
			}
			
		}
	}

}
