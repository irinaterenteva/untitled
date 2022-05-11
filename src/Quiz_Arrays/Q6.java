package Quiz_Arrays;

public class Q6 {
    public static boolean method5(String str){
        boolean check = true;
        if (str.isEmpty()){
            check = false;
        }
        if (str.contains("a")){
            check = false;

        }else if (str.contains("z")){
            check = false;
        }
        return check;
    }

    public static void main(String[] args) {
        System.out.println(method5("apple"));
    }
}
