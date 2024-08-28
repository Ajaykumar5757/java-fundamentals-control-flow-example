import java.util.*;

class ControlStatements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        System.out.println("Input value: "+num);
        
        //checking the number is whether positive, negative or Zero
        if(num>0)
            System.out.println("The number is positive");
        else if(num<0)
            System.out.println("the number is negative");
        else
            System.out.println("The number is zero");
        
        //printing the weekdays 
        System.out.print("In weekdays : ");
        switch(num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Invalid week number");
                break;
        }
        
        //using for loop 
        System.out.println("Using for loop from one to number");
        for(int i=1;i<=num;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        
        System.out.println("Using while loop in decreasing order");
        //using while loop
        int val=num;
        while(val>0){
            System.out.print(val+" ");
            val--;
        }
        System.out.println();
        
        //printing 1 to 3 
        System.out.println("Using do while loop printing 1 to 3");
        int num1=1;
        do{
            System.out.print(num1+" ");
            num1++;
        }while(num1<4);
    }
}