
package kthselectionproblem;

import java.util.Random;


public class KthSelectionProblem {
    
    public int getK (int[] dizi){
        
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
        
        deger = dizi[4];
        return deger;
    }
    
    public int getK1(int[] dizi, int kacinci){
        int a;
        int b;
        int c;
        
        for(int i=0; i<kacinci; i++){
            b=i;
            for(int j=i; j<kacinci;j++){
                if(dizi[j]<dizi[b]) b=j;
            }
            a=dizi[i];
            dizi[i]=dizi[b];
            dizi[b]=a;
        }
        
        for(int k=5; k<15;k++){
            if(dizi[kacinci-1]>dizi[k]){
                /*
                Burayı daha tamamlayamadım dizi kontrolu yapmam lazım
                
                
                */
            }
        }   
            
        return 1;
    }
    

    public static void main(String[] args) {
       
        System.out.println("k. elemanı bulan sıralama algoritması");
        System.out.println("5. elemanı:");
       int sonuc;
     
        Random rnd = new Random();
        int dizi[]= new int[15];
        for(int i=0 ; i<15 ;i++){
            dizi[i]=rnd.nextInt(50);
        }
        KthSelectionProblem k = new KthSelectionProblem();
        sonuc=k.getK(dizi);
        System.out.println(sonuc);
        
        for(int j=0;j<dizi.length;j++){

            System.out.println("cikti "+dizi[j]);
        }

    }
    
}
