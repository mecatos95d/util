/**
 * @author toz57
 * @version 2017/01/13
 */

public class IntegerHuh {
	public static void main(String args[]){
		String[] testStr = {"1234", "12ab", "a12b", "ab12", "abcd"};
		for(String s : testStr){
			System.out.println(s + " " + isIntStr(s));
		}
	}
	public static boolean isIntStr(String s){
		try{
			Integer.parseInt(s);
			return true;
		}catch(NumberFormatException e){
			return false; // s is not int form.
		}
	}
}