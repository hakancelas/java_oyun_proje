package Proje;

import java.util.ArrayList;

class OyunVerisi1{
    private ArrayList <Sovalye>sovalyeler=new ArrayList<>();
    private ArrayList <Sovalye>aktifSovalyeler=new ArrayList<>();
    private ArrayList <Dusman>dusmanlar=new ArrayList<>();
    private ArrayList <Dusman>aktifDusmanlar=new ArrayList<>();
    private ArrayList <Sans>sanslar=new ArrayList<>();


    //6. satırdan 10. satıra kadar arraylist tanımlanır

    public OyunVerisi1() {

    }
    public OyunVerisi1(Sovalye[]sovalye,Sovalye[]aktifsovalye,Dusman[]dusman,Dusman[]aktifdusman) {
        for(int i=0;i<sovalye.length;i++) {
            sovalyeler.add(sovalye[i]);

            //Döngü dizide şovalye uzunluğu kadar ekler

        }
        for(int i=0;i<aktifsovalye.length;i++) {

            aktifSovalyeler.add(aktifsovalye[i]);

            //Döngü dizide aktif şovalye uzunluğu kadar ekler

        }
        for(int i=0;i<dusman.length;i++) {
            dusmanlar.add(dusman[i]);

            //Döngü dizide düşman uzunluğu kadar ekler


        }
        for(int i=0;i<aktifdusman.length;i++) {

            aktifDusmanlar.add(aktifdusman[i]);

            //Döngü dizide aktif düşman uzunluğu kadar ekler

        }
    }
    public ArrayList<Sovalye> getSovalyeler(){
        return sovalyeler;
    }
    public ArrayList<Sovalye> getaktifSovalyeler(){
        return aktifSovalyeler;
    }
    public ArrayList<Dusman> getDusmanlar(){
        return dusmanlar;                               //47. ve 63. satıra kadar arraylistlerdeki şovalye, düşman ve şans geri döndürür
    }
    public ArrayList<Dusman> getaktifDusmanlar(){
        return aktifDusmanlar;
    }
    public ArrayList<Sans> getSanslar(){
        for(int i=0;i<sovalyeler.size();i++) {
            sanslar.add(sovalyeler.get(i).getsans());





        }
        return sanslar;





    }
    public Sovalye getSovalye(String ad) {
        int i;
        for(i=0;i<sovalyeler.size();i++) {
            if(((sovalyeler.get(i)).getAd()).equals(ad)){
                break;
            }
        }
        return sovalyeler.get(i);
    }

    public void getSovalyeBilgi(String ad) {
        int i;
        for(i=0;i<sovalyeler.size();i++) {
            if(((sovalyeler.get(i)).getAd()).equals(ad)){
                System.out.println("Şovalye Adı: "+ sovalyeler.get(i).getAd()+"\n"
                        +"Şovalye Id: "+sovalyeler.get(i).getId()+"\n"
                        +"Şovalye Tipi: "+ sovalyeler.get(i).getsovalyeTipi()+"\n"
                        +"Şovalye Vuruş Hakkı: "+sovalyeler.get(i).getVurusHakki()+"\n"
                );
                break;
            }
        }

    }

}