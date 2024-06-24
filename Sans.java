package Proje;

class Sans{
    private boolean iyiSans;
    private boolean kotuSans;
    private int sans;
    int bonus;
    public void sanslar(Sovalye s) {
        sans=(int)Math.random()*2;
        //şans tanımlanır random şans atanır
        if (sans==0) {
            iyiSans=false;
            kotuSans=true;
            //şart fonk. sayesinde doğru ya da yanlış döndürülür
        }
        else if (sans==1) {
            iyiSans=true;
            kotuSans=false;
            //şart fonk. sayesinde doğru ya da yanlış döndürülür
        }
        if(iyiSans) {
            bonus=s.getVurusHakki();
            bonus+=((int)Math.random()*2)+1;
            s.setVurusHakkı(bonus);
            //iyişans için rastgele döndürülür
        }

    }

}