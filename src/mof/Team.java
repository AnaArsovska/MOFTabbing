/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mof;

import java.util.Arrays;

/**
 *
 * @author ana
 */
public class Team {

    final private String Name;
    final private int index;
    final private int SpeakerOne;
    final private int SpeakerTwo;
    final private int SpeakerThree;
    private int cumulPts;
    final private String organization;
    private int[] Wins;
    private int wins;
    private double ranking;
    
    public Team(String name, int ind, String org) {
        Name = name;
        index = ind;
        SpeakerOne = index*3-3;
        SpeakerTwo = index*3-2;
        SpeakerThree = index*3-1;
        cumulPts = 0;
        organization = org;
        Wins = new int[9];
        wins = 0;
        ranking = 0.0;
    }

    public String getNames() {
        return Name;
    }
    
    public int getIndex(){
        return index;
    }
    
    public int getSpeakerOne(){
        return SpeakerOne;
    }
    
    public int getSpeakerTwo(){
        return SpeakerTwo;
    }
    
    public int getSpeakerThree(){
        return SpeakerThree;
    }
    
    public int getPts(){
        return cumulPts;
    }
    
    public double getRanking(){
        ranking = wins*1000 + getPts();
        return ranking;
    }
    
    public String getOrg(){
        return organization;
    }
    
    public double addPts(double pts){
        cumulPts += pts;
        return cumulPts;
    }
    
    public void addWin(int round, int win){
        if(win == 1){
            Wins[round-1] = 1;
            wins++;
        }
        else{
            Wins[round-1] = 0;
        }
            
    }
    
    public void addLoss(int round){
        Wins[round-1] = 0;
    }
    
    public int getWins(){
        return wins;
    }
    
    public int getRoundResult(int round){
        return Wins[round-1];
    }
    
}
	
