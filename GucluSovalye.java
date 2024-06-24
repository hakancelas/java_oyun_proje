package Proje;

class GucluSovalye extends Sovalye{

    GucluSovalye(){

    }
    public GucluSovalye(String ad,int id) {
        super(ad,id);
        this.setsovalyeTipi(id);

    }
    //güçlü şovalye şovalyeye bağlanır ve ad, id özellikleri tanımlanır
}