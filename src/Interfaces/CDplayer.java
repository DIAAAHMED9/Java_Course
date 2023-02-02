package Interfaces;

public class CDplayer implements Media_Player {

//    public class Exeption extend trow
    @Override
    public String play() {
        return "CD Player is play";
    }

    @Override
    public String pause() {
        return "CD Player is pause";

    }

    @Override
    public String stop() {
        return "CD Player is stop";
    }
}
