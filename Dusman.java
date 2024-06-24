package Proje;

class Dusman extends Karakterler{
    private boolean durum;
    private String dusmanTipi;

    //istenilendeki gibi private yaratılır düşman karakterlere bağlanır (extends) ve özellikler tanımlanır

    Dusman(){

    }
    public Dusman(String ad,int id) {
        super(ad,id);
        // super ile üst sınıfın öğelerine erişilir
    }
    public String getdusmanTipi() {
        return this.dusmanTipi;
    }
    public void setdusmanTipi(int a) {
        if(a==1) {
            this.dusmanTipi="Güçlü Düşman";

            //a eşit eğer 1 ise bu düşman güçlü düşmandır
        }
        if(a==2) {
            this.dusmanTipi="Zayıf Düşman";

            //a eşit 2 ise bu düşman zayıf düşmandır
        }
    }
}
