package vowelcounter;

public class VowelCounter {

    static char[] transform(String a){
        char[] arr = a.toCharArray();
        return arr;
    }

    static int count(String a){
        char[] arr = a.toCharArray();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            char c = Character.toLowerCase(arr[i]);
            if(isVowel(c)){
                count += 1;
            }
        }
        return count;
    }

    static boolean isVowel(char x){
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        for(int j = 0; j < vowels.length; j++){
            if(x == vowels[j]){
                return true;
            }
        }
        return false;

    }

}


