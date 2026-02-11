package Learning_A;

public class FriquencyOfCharacter {
    public static void main(String[] args) {
        String s = "Hello";
        char taret = 'l';

        System.out.println("Count is : " + friquency(s,taret));

    }

    static int friquency(String s, char target){
        int count = 0;
        for(int i =0;i<s.length()-1;i++){
            if(target == s.charAt(i)){
                count++;
            }
        }

        return count;
    }
}
