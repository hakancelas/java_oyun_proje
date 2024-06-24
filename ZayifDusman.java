package Proje;

class ZayifDusman extends Dusman{
    ZayifDusman(){

    }
    public ZayifDusman(String ad,int id) {
        super(ad,id);
        this.setdusmanTipi(id);
    }
}         //zayıf düşman düşmana bağlanır ve tanımlanır