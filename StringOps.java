public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        //String str = "Hellow World";
        //String xxx = "MY nAMe is eLAD";
        //System.out.println(capVowelsLowRest(str));
        //System.out.println(camelCase(xxx));
        //System.out.println(allIndexOf("Hellow world", 'l'));
    }

    public static String capVowelsLowRest (String string) {

        String new_string = "";
		char current_char = 0;
		for(int i = 0; i < string.length(); i++) {
			current_char = string.charAt(i);
			if(current_char == ' ') {
			    new_string += current_char;
			}
		    if(current_char >= 'a' && current_char <= 'z') { // if lower
				if(current_char == 'a' || current_char == 'e'
						|| current_char == 'i' || current_char == 'o' || 
								current_char =='u') {
					new_string += (char)(current_char - 32); // make upper
				} else { // if not capital letter
					new_string += current_char;
				}
			}
			if (current_char >= 'A' && current_char <= 'Z') {{ // if upper cased
				// if capital letter
				if(current_char == 'A' || current_char == 'E'
						|| current_char == 'I' || current_char == 'O' || 
								current_char =='U') {
					new_string += current_char; 
				} else { // if not a capital letter, should be lower cased
					new_string += (char)(current_char + 32);
					}
				}
			}
		}
		return new_string;
    }

    public static String camelCase (String string) {
        String new_string = "";
		char current_char = 0;
		char last_char = 0;

        int t = 0; 

        while (string.charAt(t) == 32) {
            t++;
        }




        for (int i = t; i < string.length(); i++) {
            current_char = string.charAt(i);
            if (i == 0) {
                if (current_char >= 'A' && current_char <= 'Z') {
                    new_string += (char) (current_char + 32);
                } else { 
                    new_string += (char) (current_char);
                }
            }
        

            if (i != 0) {
                
                last_char = string.charAt(i - 1);

                if (current_char >= 'A' && current_char <= 'Z') {
                    new_string += (char) (current_char + 32);
                } else {
                if (last_char == ' ' && current_char != ' ') {
                    if (current_char >= 'a' && current_char <= 'z' ) {
                        new_string += (char) (current_char - 32);
                    } else {
                        new_string += (char) (current_char);
                    }
                } else {
                if (current_char >= 'a' && current_char <= 'z') {
                    new_string += (char) (current_char);
                }
                }
                }
            }
        }
        return new_string;
    }



    public static int[] allIndexOf (String string, char chr) {
        
        int arrPush = 0;
        int count = 0;

        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == chr ){
                count++;
            }
        }

        int[] arr = new int [count];
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                arr[arrPush] = i;
                arrPush++;
            }
        }

        return arr;
    }
}
