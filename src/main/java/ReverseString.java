class ReverseString {

    String reverse(String inputString) {

    	char[] letras = inputString.toCharArray();
    	StringBuilder sb = new StringBuilder();
    	String str = inputString;
    	
    	for (int i = letras.length - 1; i >= 0; i--) {
			sb.append((str.charAt(i)));
		}
    	
    	return sb.toString();
    	
    }
  
}