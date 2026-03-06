
import java.util.Scanner;

public class StudentsPassed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n=sc.nextInt();
        System.out.println("Enter the columnns:");
        int m=sc.nextInt();
        int[][] matrix = new int[n][m];
        int passedStudents = 0;
        for(int i=0; i<n; i++){
            System.out.println("Enter details of student "+(i+1));
            int sum=0;
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
                sum+=matrix[i][j];
            }
            if((sum/m) > 50){
                passedStudents++;
            }
        }
        System.out.println("No. of students passed: "+passedStudents);
    }
}
