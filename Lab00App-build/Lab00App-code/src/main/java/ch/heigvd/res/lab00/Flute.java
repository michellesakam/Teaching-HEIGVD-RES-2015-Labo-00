/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author leDeveloppeur
 */
public class Flute implements IInstrument{

    private final String color;
    private final String sound;
    private final int volume;
    
    Flute() {
        color = "blanche";
        sound = "pipe";
        volume = 23;
    }

    @Override
    public String play() {
        return sound;
    }

    @Override
    public int getSoundVolume() {
        return volume;
    }

    @Override
    public String getColor() {
        return color;
    }
    
    
    
}
