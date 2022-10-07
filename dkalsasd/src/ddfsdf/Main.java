package ddfsdf;

//You are using Java
import java.util.Scanner;
interface Matrix{
 // Type your code here
 void diagonalsMinMax(int[][] mat);
}
class Main implements Matrix { 
 public void diagonalsMinMax(int[][] mat) 
 { 
    // Type your code here
    int n =mat.length;
    if(n==0){
    return;}
    int pmin = mat[0][0], pmax = mat[0][0];
    int smin = mat[n-1][0], smax = mat[n-1][0];
    for(int i=0; i<n;i++){
        for(int j=0; j<n;j++){
            if(i==j){
                if(mat[i][j]<pmin){
                    pmin =mat[i][j];
                }
                if(mat[i][j]>pmax){
                    pmax =mat[i][j];
                }
            }
            if((i+j)==(n-1)){
                if(mat[i][j]<smin){
                    smin =mat[i][j];
                }
                if(mat[i][j]>smax){
                    smax =mat[i][j];
                }
            }
        }
    }
    System.out.println("Smallest Element - 1: "+pmin);
    System.out.println("Greatest Element - 1: "+pmax);
    System.out.println("Smallest Element - 2: "+smin);
    System.out.println("Greatest Element - 2: "+smax);
 } 
static public void main(String[] args) 
 { 
 // Type your code here
 Scanner sc = new Scanner (System.in);
 int n = sc.nextInt();
 int[][] mat = new int [n][n];
 for(int i=0; i<n;i++){
     for(int j=0; j<n;j++){
        mat[i][j]= sc.nextInt(); 
     }
 }
 sc.close();
 Main m = new Main();
 m.diagonalsMinMax(mat);
 } 
} 
