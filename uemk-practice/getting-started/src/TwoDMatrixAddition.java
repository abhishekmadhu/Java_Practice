import java.util.*;

class Matrix{
    int row;
    int col;

    int[][] a;

    Matrix(int r, int c){
        this.row = r;
        this.col = c;
        a = new int[r][c];
    }

    public void initializeMatrix(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public void printMatrix(){
        System.out.println("The Matrix is: ");
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(this.a[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public Matrix addMatrix(Matrix a){
        Matrix c = new Matrix(a.row, a.col);
        if(a.row == this.row && a.col==this.col){

            for (int i = 0; i < a.row; i++) {
                for (int j = 0; j < a.col; j++) {
                    c.a[i][j] = a.a[i][j] + this.a[i][j];
                }
            }
        }
        return c;
    }

}


public class TwoDMatrixAddition {
    public static void main(String args[]){
        int r1, c1, r2, c2, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first matrix dimensions: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("Enter the matrix:");
        Matrix a = new Matrix(r1, c1);
        a.initializeMatrix();

        System.out.println("Enter the second matrix dimensions: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        System.out.println("Enter the matrix:");
        Matrix b = new Matrix(r2, c2);
        b.initializeMatrix();

        Matrix c = a.addMatrix(b);
        c.printMatrix();
    }
}
