package Learning_A;



public class Rough {
    public static void main(String[] args) {
        String S = "Apple";
        char c = 'p';

        System.out.println(friquency(S,c));
    }

    public static int friquency(String S, char c){
        int count =0;
        for(int i =0;i<S.length()-1;i++){
            if(c == S.charAt(i)){
                count++;
            }
        }
        return count;
    }


}
