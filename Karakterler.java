package Proje;
class Karakterler{
    private String ad;
    private int id;
    private boolean aktif;

    //karakter ad, id, boolean değeri olan aktifliği tanımlanır

    Karakterler(){

    }
    public Karakterler(String ad,int id){
        this.ad=ad;
        this.id=id;
        aktif=false;

        // public karakterler özellikleri ad,id tanımlanır
    }
    public boolean getAktif(){
        return this.aktif;

        //boolean getaktif ise bu aktiftir return döndürür
    }
    public void setAktif() {
        this.aktif=!aktif;

        //setaktif iken void olur ve döndürmez


    }
    public String  getAd() {
        return this.ad;

        //getad adı döndürür
    }
    public int getId() {
        return this.id;
    }
}       //getid id döndürür
