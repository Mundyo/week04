package week04;

public class week04Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create an array of int called ages:
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
//Subtract the first element from the last element:
		int result = ages[ages.length - 1] - ages[0];
		System.out.println("Result: " + result);
//Add a new age and repeat the subtraction:
		ages = Arrays.copyOf(ages, ages.length + 1);
		ages[ages.length - 1] = 42;
		int newResult = ages[ages.length - 1] - ages[0];
		System.out.println("New Result: " + newResult);
//Calculate the average age using a loop:
		int sum = 0;
		for (int age : ages) {
		    sum += age;
		}
		double average = (double) sum / ages.length;
		System.out.println("Average Age: " + average);
//Create an array of String called names:
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//Calculate the average number of letters per name:
		int totalLetters = 0;
		for (String name : names) {
		    totalLetters += name.length();
		}
		double averageLetters = (double) totalLetters / names.length;
		System.out.println("Average Letters per Name: " + averageLetters);
//Concatenate all names together with spaces:
		String concatenatedNames = "";
		for (String name : names) {
		    concatenatedNames += name + " ";
		}
		System.out.println("Concatenated Names: " + concatenatedNames);
//To access the last element of any array, you can use arrayName[arrayName.length - 1].

//To access the first element of any array, you can use arrayName[0].

//Create a new array called nameLengths and calculate the length of each name:
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
		    nameLengths[i] = names[i].length();
//Calculate the sum of all elements in the nameLengths array:
		    int sum = 0;
		    for (int length : nameLengths) {
		        sum += length;
		    }
		    System.out.println("Sum of Name Lengths: " + sum);

		    }
	}

		//Method to concatenate a word to itself n number of times:
	    public static String concatenateWord(String word, int n) {
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < n; i++) {
	            result.append(word);
	        }
	        return result.toString(); 
		    
		}
//Method to return the full name from first name and last name:
	    public static String getFullName(String firstName, String lastName) {
	        return firstName + " " + lastName;
	    }
//Method to check if the sum of all ints in an array is greater than 100:
	    public static boolean isSumGreaterThan100(int[] array) {
	        int sum = 0;
	        for (int num : array) {
	            sum += num;
	        }
	        return sum > 100;
	    }
//  Method to calculate the average of elements in a double array:
	    public static double calculateAverage(double[] array) {
	        double sum = 0;
	        for
	    }  
//	     Method to compare averages of two double arrays:
	    public static boolean compareAverages(double[] array1, double[] array2) {
	        double average1 = calculateAverage(array1);
	        double average2 = calculateAverage(array2);
	        return average1 > average2;
	    }
//Method to determine if a person will buy a drink based on weather and money:
	    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	        return isHotOutside && moneyInPocket > 10.50;
	    }
// Method: isPalindrome()
//	    Checks if a given string is a palindrome, meaning it reads the same forwards and backwards.
//	    This method is created to demonstrate a common string manipulation problem and provide a reusable solution.  
	    public static boolean isPalindrome(String str) {
	        // Remove all non-alphanumeric characters and convert to lowercase
	        String processedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        // Compare characters from both ends
	        int left = 0;
	        int right = processedStr.length() - 1;
	        while (left < right) {
	            if (processedStr.charAt(left) != processedStr.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }

}


