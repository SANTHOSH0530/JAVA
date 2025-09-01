package java_project_1;

public class StringFunctions {
		public static void main(String[] args) {
			String name="santhosh";
			String name2=" raj ";
			String name3=" ttp";
			String name4 = "Apple,Banana,Grape";
			//Length
			System.out.println(name.length());
			//ChartAt
			System.out.println(name.charAt(0));
			//Substring
			System.out.println(name.substring(0));
			//Substring (Start-End)
			System.out.println(name.substring(0, 7));
			//Equals
			System.out.println(name.equals(name2));
			//equalsIgnoreCase
			System.out.println(name.equalsIgnoreCase(name2));
			//CompareTo
			System.out.println(name.compareTo(name2));
			//UpperCase
			System.out.println(name.toUpperCase());
			//LowerCase
			System.out.println(name.toLowerCase());
			//trim
			System.out.println(name2.trim());
			//Contains
			System.out.println(name.contains("Coimbatore"));
			//IndexOf
			System.out.println(name.indexOf("t"));
			//isEmpty
			System.out.println(name3.isEmpty());
			//Split
			String[] Fruits=name4.split(",");
			System.out.println(Fruits[0]+Fruits[1]+Fruits[2]);
			//Replace
			System.out.println(name3.replace("ttp","Covai"));
			//valueOf
			int num = 100;
	        System.out.println("valueOf: " + String.valueOf(num));
			//ConCat
	        System.out.println(name.concat("raj"));
		}
}
