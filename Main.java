package Proje;
import java.util.*;

public class Main {



        public static void main(String[] args)  {
            GucluSovalye[] guclusovalyeDizisi=new GucluSovalye[5];
            ZayifSovalye[] zayifsovalyeDizisi=new ZayifSovalye[5];
            GucluDusman[] gucludusmanDizisi=new GucluDusman[5];
            //8,9,10,11. Satırlarda şovalye ve düşmanlar ürettilir.
            ZayifDusman[] zayifdusmanDizisi=new ZayifDusman[5];
            Sovalye[] aktifsovalyeler=new Sovalye[5];

            // 9. satırdan 14. satıra kadar nesneler ve diziler yaratılır 5 e kadar olacak şekilde

            for(int i=0;i<5;i++) {
                guclusovalyeDizisi[i]=new GucluSovalye("Güçlü Şovalye "+i,1);
            }
            for(int i=0;i<5;i++) {
                zayifsovalyeDizisi[i]=new ZayifSovalye("Zayıf Şovalye "+i,2);
            }
            // 13. satırdan 24. satıra kadar oyuncuların isimleri verilir.
            for(int i=0;i<5;i++) {
                gucludusmanDizisi[i]=new GucluDusman("Düşman "+i,1);
            }
            for(int i=0,j=5;i<5;i++,j++) {
                zayifdusmanDizisi[i]=new ZayifDusman("Düşman "+j,2);


                //döngü 18 ve 29. satıra kadar her bir karakter için 5 e kadar olacak şekilde artar



            }
            int gucsovsay=((int)(Math.random()*2))+1;
            // Güçlü şovalye sayısını rastgele belirlenir.
            int temp=10;
            for(int i=0;i<gucsovsay;i++) {
                for(;;) {
                    int x=((int)(Math.random()*5));
                    // Güçlü şovalyelerden rastgele şovalye belirlenir.
                    if(x!=temp) {
                        // Aynı elemanları aktifleştirmemek için bir aktifleşen elemanın indisi tutulur.
                        guclusovalyeDizisi[x].setAktif();
                        temp=x;
                        break;
                    }
                }
            }
            int temp1=10;
            for(int i=0;i<5-gucsovsay;i++) {
                for(;;) {
                    // Güçlü şovalyeler üretildikten sonra zayıf şovalyeler oluşturulur.
                    int x=((int)(Math.random()*5));
                    if(x!=temp1) {
                        zayifsovalyeDizisi[x].setAktif();
                        temp1=x;
                        break;
                    }
                }
            }
            Sovalye[] sovalyeler=new Sovalye[10];

            for(int i=0;i<5;i++) {
                sovalyeler[i]=guclusovalyeDizisi[i];
            }
            // Tüm şovalyeler bir dizide toplanır.


            for(int j=5,i=0;j<10;j++,i++) {
                sovalyeler[j]=zayifsovalyeDizisi[i];
            }
            int k=0;
            for(int i=0;i<10;i++) {

                if(sovalyeler[i].getAktif()) {

                    //Aktif şovalyeler belirlenip bir dizide toplanır

                    aktifsovalyeler[k++]=sovalyeler[i];
                }

            }

            int gucdussay=((int)(Math.random()*2))+1;

            // Güçlü düşman sayısı rastgele belirlenir.

            int aktifdusmanSayısı=((int)(Math.random()*3))+3;

            // Düşman sayısı rastgele belirlenir.


            int temp2=10;
            for(int i=0;i<gucdussay;i++) {
                for(;;) {
                    int x=((int)(Math.random()*5));
                    if(x!=temp2) {


                        //Güçlü düşmanlar aktileştirilir.


                        gucludusmanDizisi[x].setAktif();
                        temp2=x;
                        break;
                    }
                }
            }
            int temp3=10;
            for(int i=0;i<aktifdusmanSayısı-gucdussay;i++) {
                for(;;) {
                    int x=((int)(Math.random()*5));


                    // Zayıf düşmanlar aktifleştirlir.


                    if(x!=temp3) {
                        zayifdusmanDizisi[x].setAktif();
                        temp3=x;
                        break;
                    }
                }
            }
            Dusman[] dusmanlar=new Dusman[10];
            Dusman[] aktifdusmanlar=new Dusman[aktifdusmanSayısı];
            for(int i=0;i<5;i++) {
                dusmanlar[i]=gucludusmanDizisi[i];
            }


            //Düşmanlar bir dizide toplanır.


            for(int j=5,i=0;j<10;j++,i++) {
                dusmanlar[j]=zayifdusmanDizisi[i];
            }
            int y=0;
            for(int i=0;i<10;i++) {


                //Aktif düşmanlar bir dizide toplanır.


                if(dusmanlar[i].getAktif()) {
                    aktifdusmanlar[y++]=dusmanlar[i];
                }

            }
            OyunVerisi1 oyun=new OyunVerisi1(sovalyeler,aktifsovalyeler,dusmanlar,aktifdusmanlar);
            OyunGorunumu1 oyungorun=new OyunGorunumu1(oyun);
            oyungorun.baslangicEkrani();
            oyungorun.anaMenuyuGoster();
            oyungorun.menudenSecimYap();
        }

    }