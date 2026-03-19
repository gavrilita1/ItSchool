package sesson33;


class SistemLumini{
    public void stingeLumina(){
        System.out.println("luminile s-au stins");
    }
}

class SistemAudio{
    public void pornesteBoxe(){
        System.out.println("Boxele sunt pornite");
    }
}

class SistemVideo{
    public void pornesteVP(){
        System.out.println("VP este pornit");
    }
}


class HomeCinemaFacede{
    public SistemLumini sistemLumini;
    public  SistemAudio sistemAudio;
    public SistemVideo sistemVideo;

    public HomeCinemaFacede(){
        sistemLumini = new SistemLumini();
        sistemAudio = new SistemAudio();
        sistemVideo = new SistemVideo();
    }

    public void pornesteFilm(){
        sistemLumini.stingeLumina();
        sistemAudio.pornesteBoxe();
        sistemVideo.pornesteVP();
    }
}


public class Facede {
    public static void main(String[] args) {
        HomeCinemaFacede facede = new HomeCinemaFacede();
        facede.pornesteFilm();
    }
}
