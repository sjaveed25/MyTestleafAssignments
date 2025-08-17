package testleafWeek1.day1;

public class LearnDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//primitive data type where characters are defined
		byte noofLearners = 60; // 8 bit-  can store less than 2
		short regNo=12345; //16 bit- can store less than 5
		long phNo = 9629177527L;  // 64 bit - store more than 9 digit
		int releaseYear = 1998;  // 32 bit - store 1 to 9 digit
	
	char browserLogo = 'f'; // it can store only one  number
	char num = '1';
	
	float browserVersion = 100.2f; // float stores less decimal
	double dob = 123.434343434343 ; //stores more decimal
	
	boolean isVisible = true;
	
	
	//Non primitive data type where characters are not defined.. n number of character can be written
	
	String browserName =  "firefox"; // String is non primitive data type and also it can be represented as Class
	String sentence = "Look at the boy";
	
	System.out.println("browserVersion is" + browserVersion + " \n" + "browserName is " + browserName + "\n" + "isVisible is" + isVisible + "\n" + "releaseYear is " +releaseYear +"\n" + "browserLogo is"+browserLogo); // + is represented as concatenation
	
	}

}
