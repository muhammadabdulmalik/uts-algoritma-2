package sorting;
public class shell {
    public static void shell(int[] A) {
        int n = A.length;
        int C, jarak, i, j, kondisi, temp;
        boolean sudah = true;
        C = 0;
        jarak = n;
        
        
         while (jarak >= 1) {            
            jarak /= 2;
            sudah = true;
            
            while (sudah) {                
                sudah = false;
                for (j = 0; j < n - jarak; j++) {
                    i = j + jarak;
                    C++;
                    if (A[j] > A[i]) {
                        temp = A[j];
                        A[j] = A[i];
                        A[i] = temp;
                        sudah = true;
                    }
                }
            }
         }    
    }
    
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
            
        }
        System.out.println("");
    }
    
     public static void main(String[] args) {
        int A[] = {3, 10, 4, 2, 8, 13};
        shell.tampil(A);
        shell.shell(A);
        shell.tampil(A);
     }    
}

        


        



        

        


