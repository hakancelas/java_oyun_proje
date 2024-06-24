package Proje;

class Sovalye extends Karakterler{
    private boolean durum;
    private int vurusHakkı=1;
    private Sans sans;
    private String sovalyeTipi;

    //şovalye karaktere bağlanır (extends) ve şovalye özellikleri tanımlanır

    Sovalye(){

    }
    public Sovalye(String ad,int id) {
        super(ad,id);

    }
    public int getVurusHakki() {
        return vurusHakkı;
        //vuruşhakkı döndürür
    }
    public void setVurusHakkı(int a) {
        vurusHakkı=a;
    }
    public void vur(Dusman d) {

    }
    public String toadString() {
        return this.getAd();
    }
    public String getsovalyeTipi() {
        return sovalyeTipi;
    }
    public int getsovalyeId() {
        return this.getId();
    }
    public Sans getsans() {
        return this.sans;

        //satırların hepsinde ait oldukları tipleri döndürür
    }
    public void setsovalyeTipi(int a) {
        if(a==1)
            this.sovalyeTipi="Güçlü Şovalye";
        if(a==2) {
            this.sovalyeTipi="Zayıf Şovalye";

            //şovalye kuralları tanımlanır a eşit ise 1 e güçlü şovalye a eşit ise 2 ye zayıf şovalye
        }
    }
}