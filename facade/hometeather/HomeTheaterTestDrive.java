package hometeather;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Theater Amplifier");
        CdPlayer cd = new CdPlayer("Theater CD Player", amp);
        DvdPlayer dvd = new DvdPlayer("Theater DVD Player", amp);
        PopcornPopper popper = new PopcornPopper("Theater Popcorn Popper");
        Projector projector = new Projector("Theater Projector", dvd);
        Screen screen = new Screen("Theater Screen");
        TheaterLights lights = new TheaterLights("Theater lights");
        Tuner tuner = new Tuner("Theater tuner", amp);

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);

        homeTheaterFacade.watchMovie("La movie est Pollitos pios avec lasertags -.-");

        homeTheaterFacade.endMovie();
    }
}
