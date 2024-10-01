import java.util.Scanner;

class matrix
{
    Scanner sc=new Scanner(System.in);
    int matrixA[][]=new int[4][4];
    int matrixB[][]=new int[4][4];
    int matrixAB[][]=new int[4][4];
    int matrixBA[][]=new int[4][4];

    public void input()
    {
        System.out.println(" Elements of A ");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.println(String.format("Enter the element [%d][%d] of matrix A : ",i+1,j+1));
                int a=sc.nextInt();
                matrixA[i][j]=a;      
            }
        }

        System.out.println(" Elements of B ");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.println(String.format("Enter the element [%d][%d] of matrix B : ",i+1,j+1));
                int b=sc.nextInt();
                matrixB[i][j]=b; 
            }
        }

    //display(matrixA,matrixB);
    multiply(matrixA,matrixB);
    }

    void display(int matrix[][]) //,int matrixAB[][])
    {
        System.out.print("[");
        for(int i=0;i<4;i++)
        {
            System.out.print(matrix[i][0]+ " ");
            System.out.print(matrix[i][1]+ " ");
            System.out.print(matrix[i][2]+ " ");
            System.out.print(matrix[i][3]+ " ");
            System.out.println();
    
            //for(int j=0;j<4;j++)
            //{
            //    System.out.println(String.format("Element [%d][%d] of matrix A : %d",i+1,j+1,matrixA[i][j]));
            //}
            
        }
        System.out.print("]");
        
    }   

    void multiply(int matrixA[][], int matrixB[][]) {
        // Resetting matrices to zero before multiplication
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrixAB[i][j] = 0;
                matrixBA[i][j] = 0;
            }
        }

        // Matrix multiplication logic
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) { // Correct third index for multiplication
                    matrixAB[i][j] += matrixA[i][k] * matrixB[k][j];
                    matrixBA[i][j] += matrixB[i][k] * matrixA[k][j];
                }
            }
        }

        System.out.println("Matrix AB:");
        display(matrixAB);
        
        System.out.println("Matrix BA:");
        display(matrixBA);
        
        compare(matrixAB, matrixBA);
    }

    void compare(int matrixAB[][],int matrixBA[][])
    {
        int flag=0,temp1=0,temp2=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                temp1=matrixAB[i][j];
                temp2=matrixBA[i][j];
                if (temp1==temp2)
                {
                    flag=flag+1;
                } 
                else
                break;

            }
        } 
        System.out.println(flag);

        if (flag==16)
    
            System.out.println("MatrixAB is equal to MatrixBA");
        else
            System.out.println("MatrixAB is not equal to MatrixBA");

    }

}

class Ques1 extends matrix
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    matrix obj=new matrix();
    obj.input();
   

    }
}