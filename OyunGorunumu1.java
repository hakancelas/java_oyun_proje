package Proje;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class OyunGorunumu1{
    public OyunVerisi1 oyunVerisi;

    public OyunGorunumu1() {

    }
    public OyunGorunumu1(OyunVerisi1 oyunVerisi){
        this.oyunVerisi=oyunVerisi;
    }

    public void baslangicEkrani() {

        //Başlangıç ekranı

        System.out.println("******** OYUNA HOŞGELDİNİZ *******");
        System.out.println("\n\n\n");
    }
    public void anaMenuyuGoster() {

        //Oyunun istenilen arayüz yazıları yazdırılır

        System.out.println("ANA MENÜ \r\n"
                + "1. Tüm şövalyeleri göster\r\n"
                + "2. Aktif olan şövalyeleri göster\r\n"
                + "3. Adı girilen şövalye bilgilerini göster\r\n"
                + "4. Adı girilen şövalyeyi değiştir\r\n"
                + "5. Yardım\r\n"
                + "6. Oyunu başlat\r\n"
                + "7. Oyundan çık");
    }
    public void yardim() {

        //Geri döndürülmeyen yardım butonudur ve basıldığında aşağıdaki arayüzdeki yazılar karşılar

        System.out.println("Oyunumuz bir savaş oyunu olup takımlar şovalye ve düşmanlardan oluşacaktır.\n"+
                "Her bir şövalyenin yalnızca bir vuruş hakkı vardır. Bir kez düşmana vuran şövalye yense \r\n"
                + "de yenilse de aktif şövalyeler arasından çıkarılır. Oyun başladıktan sonra, hangi şövalyenin \r\n"
                + "hangi düşmana vuracağına oyuncu karar vermelidir.\r\n"
                + "● Eğer oyuncu, aktif şövalyeleri bitmeden tüm düşmanları yok edebilirse oyunun galibi olur. \r\n"
                + "Ancak düşman sayısından daha az sayıda şövalye kaldığı durumda, oyuncu oyunu \r\n"
                + "kaybeder. \r\n"
                + "● Şövalyelerin iki çeşidi vardır:\r\n"
                + "- Güçlü Şövalyeler: Güçlü şövalye, hem güçlü hem de zayıf düşmanı vurduğunda \r\n"
                + "onu yok edebilir. \r\n"
                + "- Zayıf Şövalyeler: Zayıf şövalye yalnızca zayıf düşmana vurduğunda yok edebilir. \r\n"
                + "Güçlü düşmana vurduğunda kendisi yok olur ancak düşmana bir zarar veremez.");
    }
    public void sovalyeleriGoster() {

        //geri döndürmez,  şovalyeleri gösterir


        System.out.println("******ŞOVALYELER********");
        for(int i=0;i<oyunVerisi.getSovalyeler().size();i++) {
            System.out.println((i+1)+")"+"\n"+"Şovalye Adı: "+ oyunVerisi.getSovalyeler().get(i).getAd()+"\n"
                    +"Şovalye Id: "+oyunVerisi.getSovalyeler().get(i).getId()+"\n"
                    +"Şovalye Tipi: "+ oyunVerisi.getSovalyeler().get(i).getsovalyeTipi()+"\n"
                    +"Şovalye Vuruş Hakkı: "+oyunVerisi.getSovalyeler().get(i).getVurusHakki()+"\n"
            );
        }
    }
    public void aktifSovalyeleriGoster() {


        //Aktif şovalyeler karşılar geri dönmez


        System.out.println("*******AKTİF ŞOVALYELER*******");
        for(int i=0;i<oyunVerisi.getaktifSovalyeler().size();i++) {
            System.out.println((i+1)+")"+"\n"+"Şovalye Adı: "+ oyunVerisi.getaktifSovalyeler().get(i).getAd()+"\n"
                    +"Şovalye Id: "+oyunVerisi.getaktifSovalyeler().get(i).getId()+"\n"
                    +"Şovalye Tipi: "+ oyunVerisi.getaktifSovalyeler().get(i).getsovalyeTipi()+"\n"
                    +"Şovalye Vuruş Hakkı: "+oyunVerisi.getaktifSovalyeler().get(i).getVurusHakki()+"\n"
            );
        }
    }
    public void menudenSecimYap()  {

        //eğer 1 i seçerse şovalyeleri gösterir


        int seçim;
        for(;;) {
            System.out.print("Lütfen Seçim Yapınız:");
            Scanner input =new Scanner(System.in);
            seçim=input.nextInt();

            if(seçim==1) {
                sovalyeleriGoster();
            }

            //eğer 2 yi seçerse aktif şovalyeleri gösterir


            else if(seçim==2) {
                aktifSovalyeleriGoster();
            }


            //eğer 3 ü seçerse şovalye ismi girişi yapılır ve scan edilir


            else if(seçim==3) {
                String isim;
                System.out.print("Lütfen İstediğiniz Şovalye İsmini Giriniz:");
                Scanner input1 =new Scanner(System.in);
                isim=input1.nextLine();
                oyunVerisi.getSovalyeBilgi(isim);
            }

            //eğer 4 ü seçerse değiştirmek istenilen şovalye ismi giriş yapılır ve scan edilir

            else if(seçim==4) {
                String isim2;
                System.out.print("Lütfen Değiştirmek İstediğiniz Şovalye İsmini Giriniz:");
                Scanner input2 =new Scanner(System.in);
                isim2=input2.nextLine();

                //döngü ve sayaç yardımıyla işlemler gerçekleşir


                for(int i=0;i<oyunVerisi.getaktifSovalyeler().size();i++) {
                    if(oyunVerisi.getaktifSovalyeler().get(i).getAd().equals(isim2)) {
                        oyunVerisi.getaktifSovalyeler().remove(i);
                        for(int j=0;j<oyunVerisi.getSovalyeler().size();j++) {
                            int sayac=0;
                            if((oyunVerisi.getSovalyeler().get(j).getsovalyeTipi().equals("Zayıf Şovalye"))&&!(oyunVerisi.getSovalyeler().get(j).getAktif())) {
                                oyunVerisi.getaktifSovalyeler().add(i++,oyunVerisi.getSovalyeler().get(j));
                                sayac++;
                            }
                            if(sayac==2)
                                break;
                        }
                        break;
                    }
                }
            }

            //seçim 5 olursa yardım karşılar

            else if(seçim==5) {
                yardim();
            }
            else if(seçim==6) {
                SavasMotoru1 Savas=new SavasMotoru1(oyunVerisi);
                Savas.savas();
                break;
            }
            else if(seçim==7) {
                System.exit(0);
            }
        }
    }
    public void sovalyeyiGoster(Sovalye s){
        System.out.println("Şovalye Adı: "+ s.getAd()+"\n"
                +"Şovalye Id: "+s.getId()+"\n"
                +"Şovalye Tipi: "+ s.getsovalyeTipi()+"\n"
                +"Şovalye Vuruş Hakkı: "+s.getVurusHakki()+"\n"
        );
    }

}