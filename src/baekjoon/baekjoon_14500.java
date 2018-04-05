package baekjoon;

import java.util.Scanner;

public class baekjoon_14500 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[][] arr = new int[n][m];
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = sc.nextInt();
         }
      }
      
      sc.close();
      // 19 of 1
      int max = 0;
      int total = 0;
      for (int i = 0; i < arr.length - 1; i++) {
         for (int j = 0; j < arr[i].length - 1; j++) {
            total = arr[i][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1];
            if (total > max) {
               max = total;
            }
         }
      }

      for (int i = 0; i < arr.length - 3; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            total = arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 3][j];
            if (total > max)
               max = total;
         }
      }

      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length - 3; j++) {
            total = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i][j + 3];
            if (total > max)
               max = total;
         }
      }

      for (int i = 0; i < arr.length - 2; i++) {
         for (int j = 0; j < arr[i].length - 1; j++) {
            total = arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i][j + 1];
            if (total > max)
               max = total;
         }
      }

      for (int i = 0; i < arr.length - 2; i++) {
         for (int j = 0; j < arr[i].length - 1; j++) {
            total = arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 2][j + 1];
            if (total > max)
               max = total;
         }
      }

      for (int i = 0; i < arr.length - 2; i++) {
         for (int j = 0; j < arr[i].length - 1; j++) {
            total = arr[i][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 2][j + 1];
            if (total > max)
               max = total;
         }
      }

      for (int i = 0; i < arr.length - 2; i++) {
         for (int j = 0; j < arr[i].length - 1; j++) {
            total = arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 2][j + 1] + arr[i + 2][j];
            if (total > max)
               max = total;
         }
      }

      for (int i = 0; i < arr.length - 1; i++) {
         for (int j = 0; j < arr[i].length - 2; j++) {
            total = arr[i][j] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2];
            if (total > max)
               max = total;
         }
      }

      for (int i = 0; i < arr.length - 1; i++) {
         for (int j = 0; j < arr[i].length - 2; j++) {
            total = arr[i][j + 2] + arr[i + 1][j + 2] + arr[i + 1][j + 1] + arr[i + 1][j];
            if (total > max)
               max = total;
         }
      }

      for (int i = 0; i < arr.length - 1; i++) {
         for (int j = 0; j < arr[i].length - 2; j++) {
            total = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j];
            if (total > max) {
               max = total;
            }
         }
      }

      for (int i = 0; i < arr.length - 1; i++) {
         for (int j = 0; j < arr[i].length - 2; j++) {
            total = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 2];
            if (total > max) {
               max = total;
            }
         }
      }

      for (int i = 0; i < arr.length - 2; i++) {
         for (int j = 0; j < arr[i].length - 1; j++) {
            total = arr[i][j] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 2][j + 1];
            if (total > max) {
               max = total;
            }
         }
      }

      for (int i = 0; i < arr.length - 2; i++) {
         for (int j = 0; j < arr[i].length - 1; j++) {
            total = arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j] + arr[i + 2][j];
            if (total > max) {
               max = total;
            }
         }
      }

      for (int i = 0; i < arr.length - 1; i++) {
         for (int j = 0; j < arr[i].length - 2; j++) {
            total = arr[i][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j + 2];
            if (total > max) {
               max = total;
            }
         }
      }

      for (int i = 0; i < arr.length - 1; i++) {
         for (int j = 0; j < arr[i].length - 2; j++) {
            total = arr[i + 1][j] + arr[i + 1][j + 1] + arr[i][j + 1] + arr[i][j + 2];
            if (total > max)
               max = total;
         }
      }

      for (int i = 0; i < arr.length - 2; i++) {
         for (int j = 0; j < arr[i].length - 1; j++) {
            total = arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 1][j + 1];
            if (total > max)
               max = total;
         }
      }

      for (int i = 0; i < arr.length - 2; i++) {
         for (int j = 0; j < arr[i].length - 1; j++) {
            total = arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 2][j + 1] + arr[i + 1][j];
            if (total > max)
               max = total;
         }
      }

      for (int i = 0; i < arr.length - 1; i++) {
         for (int j = 0; j < arr[i].length - 2; j++) {
            total = arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j] + arr[i + 1][j + 2];
            if (total > max)
               max = total;
         }
      }

      for (int i = 0; i < arr.length - 1; i++) {
         for (int j = 0; j < arr[i].length - 2; j++) {
            total = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1];
            if (total > max)
               max = total;
         }
      }

      System.out.println(max);
   }

}