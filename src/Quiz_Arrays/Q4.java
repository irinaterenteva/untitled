package Quiz_Arrays;

public class Q4 {
    public static void main(String[] args) {
        System.out.println(method3(50));
    }
    public static String method3(int num){

        if (num<0){
            return "Less thank 0";
        }else if (num <50){
            return "Less than 50";
        }else if (num <100){
            return "Less than 100";
        }else{
            return "other";
        }
    }
}
