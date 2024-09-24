// import java.util.*;

// public class Array{

//   static void markRow(ArrayList<ArrayList<Integer>> matrix,int n, int m, int i){
    
//     for(int j=0; j<m; j++){
//       if(matrix.get(i).get(j) != 0){
//         matrix.get(i).set(j,-1);
//       }
//     }
//   }

//   static void markCol(ArrayList<ArrayList<Integer>> matrix,int n, int m, int j){

//     for(int i=0; i<n; i++){
//       if(matrix.get(i).get(j) != 0){
//         matrix.get(i).set(j,-1);
//       }
//     }
//   }

//   static ArrayList<ArrayList<Integer>> setZeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m){

//     for(int i=0; i<n; i++){
//       for(int j=0; j<m; j++){
//         if(matrix.get(i).get(j) == 0){
//           markRow(matrix, n, m, i);
//           markCol(matrix, n, m, j);
//         }
//       }
//     }


//     for(int i=0; i<n; i++){
//       for(int j=0; j<m; j++){
//         if(matrix.get(i).get(j) == -1){
//           matrix.get(i).set(j,0);
//         }
//       }
//     }

    
//     return matrix;
//   }

//   public static void main(String[] args) {
//     ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
//     matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
//     matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
//     matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

//     int n = matrix.size();
//     int m = matrix.get(0).size();

    
//   }
// }

//    24/09/24


// this is the first approach when the question is given that to print the element in the (i,j) positions.

import java.util.*;

public class Array{

  public static long nCr(int n, int r){

    long res = 1;

    for(int i=0; i<r; i++){

      res = res * (n - i);
      res = res / (i + 1);
    }

    return res;
  }

  public static int pascalTriangle(int r, int c){

    int element = (int) nCr(r-1, c-1);
    return element;
  }
  public static void main(String[] args) {
    int r = 5;
    int c = 3;

    int element = pascalTriangle(r, c);
    System.out.println("the element at position (r,c) is : " + element);

  }
}


// import java.util.*;

// public class tUf {
//     public static long nCr(int n, int r) {
//         long res = 1;

//         // calculating nCr:
//         for (int i = 0; i < r; i++) {
//             res = res * (n - i);
//             res = res / (i + 1);
//         }
//         return res;
//     }

//     public static int pascalTriangle(int r, int c) {
//         int element = (int) nCr(r - 1, c - 1);
//         return element;
//     }

//     public static void main(String[] args) {
//         int r = 5; // row number
//         int c = 3; // col number
//         int element = pascalTriangle(r, c);
//         System.out.println("The element at position (r,c) is: " + element);
//     }
// }  
        
        