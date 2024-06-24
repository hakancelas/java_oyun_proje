package Proje;

import java.util.ArrayList;
import java.util.Scanner;

class SavasMotoru1{
    OyunVerisi1 asker;

    public SavasMotoru1() {

    }
    public SavasMotoru1(OyunVerisi1 asker) {
        this.asker=asker;
    }
    public void savas(){

        int sovalyeSecim,dusmanSecim;
        for(;;) {
            System.out.print("Kullanacağınız şövalyenin numarasını giriniz: ");
            Scanner input3=new Scanner(System.in);
            sovalyeSecim=input3.nextInt();
            System.out.print("\n");
            System.out.print("Hedefteki düşmanın numarasını giriniz:");
            Scanner input4=new Scanner(System.in);
            dusmanSecim=input4.nextInt();
            System.out.print("\n");

            if(((asker.getaktifSovalyeler().get(sovalyeSecim-1).getsovalyeTipi()).equals("Güçlü Şovalye"))&&((asker.getaktifDusmanlar().get(dusmanSecim-1).getdusmanTipi()).equals("Güçlü Düşman"))) {
                System.out.println("Hedef vuruldu.\r\n"
                        + "Dusman yok edildi.");
                asker.getaktifSovalyeler().remove(sovalyeSecim-1);
                asker.getaktifDusmanlar().remove(dusmanSecim-1);
                oyunDurumunuGoster(asker.getaktifSovalyeler(),asker.getaktifDusmanlar());


            }
            else if(((asker.getaktifSovalyeler().get(sovalyeSecim-1).getsovalyeTipi()).equals("Güçlü Şovalye"))&&((asker.getaktifDusmanlar().get(dusmanSecim-1).getdusmanTipi()).equals("Zayıf Düşman"))) {
                System.out.println("Hedef vuruldu.\r\n"
                        + "Dusman yok edildi.");
                asker.getaktifSovalyeler().remove(sovalyeSecim-1);
                asker.getaktifDusmanlar().remove(dusmanSecim-1);
                oyunDurumunuGoster(asker.getaktifSovalyeler(),asker.getaktifDusmanlar());

            }
            else if(((asker.getaktifSovalyeler().get(sovalyeSecim-1).getsovalyeTipi()).equals("Zayıf Şovalye"))&&((asker.getaktifDusmanlar().get(dusmanSecim-1).getdusmanTipi()).equals("Zayıf Düşman"))) {
                System.out.println("Hedef vuruldu.\r\n"
                        + "Dusman yok edildi.");
                asker.getaktifSovalyeler().remove(sovalyeSecim-1);
                asker.getaktifDusmanlar().remove(dusmanSecim-1);
                oyunDurumunuGoster(asker.getaktifSovalyeler(),asker.getaktifDusmanlar());
            }
            else if(((asker.getaktifSovalyeler().get(sovalyeSecim-1).getsovalyeTipi()).equals("Zayıf Şovalye"))&&((asker.getaktifDusmanlar().get(dusmanSecim-1).getdusmanTipi()).equals("Güçlü Düşman"))) {
                System.out.println("Hedef vuruldu.\r\n"
                        + "Zayıf Şövalye ile güçlü düşmanı yenemezsiniz");
                asker.getaktifSovalyeler().remove(sovalyeSecim-1);
                oyunDurumunuGoster(asker.getaktifSovalyeler(),asker.getaktifDusmanlar());

            }
            if ((asker.getaktifSovalyeler()).size()<(asker.getaktifDusmanlar()).size()) {
                System.out.println("*****OYUNU KAYBETTİNİZ****");
                System.exit(5);}
            if(asker.getaktifDusmanlar().size()==0) {
                System.out.println("*****OYUNU KAZANDINIZ****");
                System.exit(6);

            }


        }
    }
    public void oyunDurumunuGoster( ArrayList <Sovalye>sovalyeler,ArrayList <Dusman>dusmanlar) {
        if(dusmanlar.size()<sovalyeler.size()) {

            System.out.println("******OYUN DEVAM EDİYOR*****");
            System.out.println("*******OYUN DURUMU******");
            System.out.println("*******AKTİF ŞOVALYELER*******");

            for(int i=0;i<sovalyeler.size();i++) {
                System.out.println((i+1)+")"+"\n"+"Şovalye Adı: "+ sovalyeler.get(i).getAd()+"\n"
                        +"Şovalye Id: "+sovalyeler.get(i).getId()+"\n"
                        +"Şovalye Tipi: "+ sovalyeler.get(i).getsovalyeTipi()+"\n"
                        +"Şovalye Vuruş Hakkı: "+sovalyeler.get(i).getVurusHakki()+"\n"
                );

            }
            System.out.println("*******DÜŞMANLAR*******");
            for(int i=0;i<dusmanlar.size();i++) {
                System.out.println((i+1)+")"+"\n"+"Düşman Adı: "+ dusmanlar.get(i).getAd()+"\n");

            }

        }



    }
}