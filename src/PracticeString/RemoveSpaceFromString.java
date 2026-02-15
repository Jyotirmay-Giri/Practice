package PracticeString;

public class RemoveSpaceFromString {

//    Remove All Spaces From a String

//    Input: " Java Spring Boot "
//    Output: "JavaSpringBoot"
    public static void main(String[] args) {

        String S = " Java Spring Boot ";
        System.out.println(solution(S));
    }

    static String solution(String S){
        StringBuilder sb = new StringBuilder();

        for(int i =0;i<S.length();i++){
            if(S.charAt(i) != ' '){
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
}
