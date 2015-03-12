
package kthselectionproblem;

import java.util.Scanner;


public class KthSelectionProblem {
    
    public int getK (int[] dizi,int kacinci){
        
        int gecici;
        int ek;
        int deger;
        for(int i=0; i<dizi.length; i++){
            ek=i;
            for(int j=i; j<dizi.length; j++){
                if (dizi[j] < dizi[ek]) ek=j;
            }
        gecici=dizi[i];
        dizi[i]=dizi[ek];
        dizi[ek]=gecici;
        
        }
        
        deger = dizi[kacinci-1];
        return deger;
    }
    
    public static void main(String[] args) {
       
        System.out.println("*****k. elemanı bulan sıralama algoritması****");
        
        System.out.println("Kacinci elemanı bulmak istersiniz:");
        Scanner scanDeger = new Scanner(System.in);
        int deger = scanDeger.nextInt();
        
        System.out.println("Dizinin eleman sayisini giriniz:");
        Scanner scan = new Scanner(System.in);
        int sayi=scan.nextInt();
        int cikti;
        int dizi[] = new int[sayi];
        
        
        for(int i=0;i<sayi;i++){
            System.out.print("dizinin("+(i+1)+") giriniz :");
            dizi[i] =scan.nextInt();
        }
        

        KthSelectionProblem k = new KthSelectionProblem();
        cikti=k.getK(dizi,deger);
        System.out.println(cikti);
        
        for(int j=0;j<dizi.length;j++){

            System.out.println("cikti "+dizi[j]);
        }

    }
    
}
