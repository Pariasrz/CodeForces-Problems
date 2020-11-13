import java.util.Scanner;

public class A505 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word.");
		String word = sc.next();
		char [] characters = word.toCharArray();
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();		
		
		if(palindrome(characters) == false) { 
			char [] newCharacters = new char[characters.length + 1];
			for(int i = 0; i < characters.length; i++) {
				newCharacters[i] = characters[i];
			}
			newCharacters[newCharacters.length-1] = characters[0];
			
			//add the first character of the word to it's end and again check if the entered word is palindrome
			if (palindrome(newCharacters) == false) {
				System.out.println("NA");
			}
			else {
				System.out.println(word + word.charAt(0));
			}
			
		}
		else {
			if(word.length()%2 == 0) {	
				String m = word.subSequence(0, word.length()/2).toString();
				String n = word.subSequence(word.length()/2  , word.length()).toString();
				
				//print all possible states
				for(int i =0; i< alphabet.length; i++) {
					System.out.println(m + alphabet[i] + n);
				}
			}
			else {
				String m = word.subSequence(0, word.length()/2).toString();
				String n = word.subSequence(word.length()/2, word.length()).toString();
				char mid = word.charAt(word.length()/2);
				System.out.println(m + mid + n);
				
				}	
			}
		}
	
	//check if the entered word is palindrome	
	static boolean palindrome(char[] ch) { 
		if(ch.length<=10 && ch.length>=1) {
			for(int i = 0; i < ch.length; i++) {
				char a = ch[i];
				char b = ch[ch.length-(i+1)];
				if (a != b) {
					return false;
				}
			}
		}
		return true;
	}
}

