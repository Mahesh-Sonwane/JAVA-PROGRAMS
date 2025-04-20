package string;

public class StringClass5 {

	public static void main(String[] args) {

		String s1= "Automation Testing Batch 50";
		System.out.println(s1.replace('i', 'k'));                  //.replace
		System.out.println(s1.replace("Automation", "API"));
		
		System.out.println(s1.replaceAll("[A-Z]", "" ));          //Removes capitals letters                //.replaceAll
		System.out.println(s1.replaceAll("[a-z]", "" ));          //Removes small letters
		System.out.println(s1.replaceAll("[0-9]", "" ));          //Removes NUMBERS
		System.out.println(s1.replaceAll(" ", "" ));              //Removes Space
		
		
	}

}
