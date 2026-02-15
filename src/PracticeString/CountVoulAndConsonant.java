package PracticeString;

public class CountVoulAndConsonant {
    public static void main(String[] args) {
        String S = "Jyoti # rmayA";
//        int countC = S.length()-countVowel(S);
        countVowel(S);
    }

    static void countVowel(String S){
        String s = S.toLowerCase(); // Converting whole String to lower case, otherwise it won't compare capital letters.
        int voul =0;
        int consonant = 0;

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                if(ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
                    voul++;
                }else{
                    consonant++;
                }
            }
        }
        System.out.println("No of Vouels is : " + voul + ", Count of Consonant is : " + consonant);
    }
}
