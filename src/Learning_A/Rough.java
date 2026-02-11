package Learning_A;

class cicketBoard{
    void team(){
        System.out.println("ICC");
    }
}

class India extends cicketBoard{
    @Override
    void team(){
        System.out.println("BCCI");
    }
}

class Pakistan extends cicketBoard{
    @Override
    void team(){
        System.out.println("PCB");
    }
}


public class Rough {
    public static void main(String[] args) {
        String S = "Apple";
        char c = 'p';

        System.out.println(friquency(S,c));
// Learning Method overriding
        cicketBoard ind = new India();
        cicketBoard pak = new Pakistan();
         ind.team();
         pak.team();
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
