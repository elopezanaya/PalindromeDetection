package mx.solution;

public class PalindromeDetection {

	public boolean isValidPalindrome(String text) {
		char[] breakingTheText = getValidCharArray(text);
		char[] breakingTheTextMirror = getValidCharArrayReversedFromOriginalText(text);
		
		for (int i =0; i <breakingTheText.length;i++){
			System.out.println("breakingTheText[i] : " +breakingTheText[i]);
			System.out.println("breakingTheTextMirror[i] : " +breakingTheTextMirror[i]);
			if (breakingTheText[i] != breakingTheTextMirror[i])
			return false;
		}
		return true;
	}
	
	private char[] getValidCharArrayReversedFromOriginalText(String text){
		
		return getValidCharArray(new StringBuffer(text).reverse().toString());
		
	}
	
	private char[] getValidCharArray(String text){
		
		char[] breakingTheText = text.toLowerCase().toCharArray();
		StringBuffer temporalText= new StringBuffer();
		
		for (char element : breakingTheText){
			
			if (Character.isAlphabetic(element)){
				
				temporalText.append(element);
			}
		}
		
		return temporalText.toString().toCharArray();
	}

}
