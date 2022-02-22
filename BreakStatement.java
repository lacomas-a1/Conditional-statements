package Descion_making_statements;

public class BreakStatement {
    public static void main(String[]args){
        int i;
        for (i=0; i<= 10; i++){
            if(i==7){
                System.out.format("\n Coming out from for loop wher i=%d\n",i);
                break;
            }
            System.out.format("%d", i);
        }
    }
}

// if the Javac compiler finds the break statement inside them, it will stop executing the statements and immediately exit from the loop.
