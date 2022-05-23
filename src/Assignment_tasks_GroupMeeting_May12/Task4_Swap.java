package Assignment_tasks_GroupMeeting_May12;

public class Task4_Swap {
/*Numbers - Swap Numbers
Swap two variable' values without using a third variable

 */
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;


        num2 = sum - num2;    //num2 = 30 - 20 = 10
        num1 = sum - num2;    //num1 = 30 - 10 = 20

        //Verify swapped values
        System.out.println("num1 = " + num1 + " and num2 = " + num2);
    }
    }

