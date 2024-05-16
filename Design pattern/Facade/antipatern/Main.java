package Facade.antipatern;


public class Main {
    public static void main(String[] args) {

        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector);

        homeTheater.watchMovie("The Matrix");

        homeTheater.endMovie();
    }
}

class Amplifier {
    public void on() {
        System.out.println("Amplificador ligado");
    }

    public void off() {
        System.out.println("Amplificador desligado");
    }
}

class DVDPlayer {
    public void on() {
        System.out.println("DVD Player ligado");
    }

    public void play(String movie) {
        System.out.println("Reproduzindo filme: " + movie);
    }

    public void off() {
        System.out.println("DVD Player desligado");
    }
}

class Projector {
    public void on() {
        System.out.println("Projetor ligado");
    }

    public void off() {
        System.out.println("Projetor desligado");
    }
}

class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amplifier, DVDPlayer dvdPlayer, Projector projector) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparando para assistir ao filme: " + movie);
        amplifier.on();
        dvdPlayer.on();
        projector.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Finalizando o filme");
        amplifier.off();
        dvdPlayer.off();
        projector.off();
    }
}


