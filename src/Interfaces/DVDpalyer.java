package Interfaces;

public class DVDpalyer implements Media_Player{
    @Override
    public String play() {
        return "DVD Player is play";
    }

    @Override
    public String pause() {
        return "DVD Player is pause";
    }

    @Override
    public String stop() {
        return "DVD Player is stop";
    }
}
