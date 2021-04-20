package searching;
public class binary_searching {
    public static void main(String[] args) {
        int B[] = {3, 10, 4, 2, 8, 13};
        int cari = 8;
        int IndeksAwal = 0;
        int IndeksAkhir = B.length-1;
        int ketemu = 0;
        int point = 0;
        
        
        System.out.println("isi data adalah");
        for (int i = 0; i < B.length; i++){
            
            System.out.print(B[i] + " ");
        }
        System.out.println("");
        System.out.println("");    
        
        while ((IndeksAwal <= IndeksAkhir) && (ketemu == 0)) {
        point = (IndeksAwal + IndeksAkhir) / 2;
        System.out.println("indeks pointer :"+ point);
            if (cari == B[point] ) {
                ketemu = 1;
                System.out.println("Data" + cari + "Telah ditemukan pada indeks ke " + point);
            }
            
            else if (cari < B[point] ) {
                System.out.println("Cari di kiri");
                IndeksAkhir = point-1;
            }
            
            else {
                IndeksAwal = point+1;
                System.out.println("Cari di kanan ");
            }
        }
        
        
    if (ketemu == 1)
        System.out.println("kesimpulan: data ditemukan");
    else
        System.out.println("kesimpulan: data tidak ditemukan");
    }
    
}
