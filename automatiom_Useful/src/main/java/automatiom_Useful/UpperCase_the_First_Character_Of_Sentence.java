package automatiom_Useful;

public class UpperCase_the_First_Character_Of_Sentence {

	
	public static String MakeUppercase(String w) {
		String c=" ";
		for(int j=0;j< w.length();j++) {
			if(j==0)
			{
			  c=c+Character.toString(w.charAt(0)).toUpperCase();
			
			}
			else {
				c=c+w.charAt(j);
			}
		}
		return c;
		
	}
	public static void main(String[] args) {
	String name ="pritesh muli";
	name=name.toLowerCase();
	String [] value = name.split("\\s");
	String next = " ";
	for(int i=0;i<value.length;i++) {
		next = next + MakeUppercase(value[i]);
		}
	System.out.println(next);
	}
}
