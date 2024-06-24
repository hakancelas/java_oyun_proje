package Proje;


class GucluDusman extends Dusman{
    GucluDusman(){

    }
    public GucluDusman(String ad,int id) {
        super(ad,id);
        // super ile üst sınıfın öğelerine erişilir
        this.setdusmanTipi(id);

        //güçlü düşman düşmana bağlanır ve ad, id özellikleri tanımlanır
    }
}
