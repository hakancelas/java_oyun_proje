package Proje;

class ZayifSovalye extends Sovalye{
    ZayifSovalye(){


    }
    public ZayifSovalye(String ad,int id) {
        super(ad,id);
        this.setsovalyeTipi(id);
    }
    //zayıf şovalye şovalyeye bağlanır ve tanımlanır
}