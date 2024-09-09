import java.util.Scanner;

class number
{
    Scanner sc=new Scanner(System.in);
    int input()
    {
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();
        return num;
    }

    void checknum(int no)
    {
        int flag=0;
        for(int i=2;i<=Math.sqrt(no); i++)
        {
            if (no%i!=0)
            {
                flag=1;
            }
            else
            {   flag=0;
                break;
            }
        }
        if(Integer.valueOf(flag).equals(1)){
            System.out.println("Number is Prime");
            binarynum(no);}

        else{
            System.out.println("Number is Not Prime");
            octalnum(no);}
    }

    void binarynum(int no)
    {
        int[] binary = new int[35];
        int id = 0;
 
        // Number should be positive
        while (no > 0) {
            binary[id++] = no % 2;
            no = no / 2;
        }
 
        // Print Binary
        
        for (int i = id - 1; i >= 0; i--)
            System.out.print(binary[i] + "");

    }
    void octalnum(int no)
    {
        int[] octal = new int[35];
        int id = 0;
 
        while (no > 0) {
            octal[id++] = no % 8;
            no = no / 8;
        }

        
        for (int i = id - 1; i >= 0; i--)
            System.out.print(octal[i] + "");
    }




}

class Ques2 extends number
{ 
    public static void main(String args[])
    {
    int no;
    number obj=new number();
    no=obj.input();
    obj.checknum(no);
   

    }
}