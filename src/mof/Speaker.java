/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mof;

/**
 *
 * @author ana
 */
public class Speaker {

    final private String NAME;
    final private String TeamName;
    private double TotalPts;
    final private int Index;
    private double[] Points;
    
    public Speaker(String name, String teamname, double totalPts, int index) {
        NAME = name;
        TeamName = teamname;
        TotalPts = totalPts;
        Index = index;
        Points = new double[9];         
    }

    public String getName() {
        return NAME;
    }
    
    public String getTeamName() {
        return TeamName;
    }
    
    public double getTotalPts() {
        return TotalPts;
    }
    
    public int getIndex() {
        return Index;
    }

    public double totalPts(){
        for(int i = 0; i < 9; i++){
            TotalPts += Points[i];
        }
        return TotalPts;
    }
    
    public void addPts(int round, double points){
        Points[round-1] = points; 
    }
    
    public double getPts(int round){
        return Points[round-1];
    }
    
    @Override
    public String toString() {
        return NAME;
    }

}

		
/*	#Incrementing points
	def addPoints(self, pts):
		self.totalPts = self.totalPts + pts
		
	def getRoundPts(self, round):
		return Points[self.index][round-1]
	
	#Calculates total points for a speaker
	def cumulPts(self, numRounds):
		for x in range(numRounds):
			self.totalPts = self.totalPts + Points[self.index][x-1] 
		return self.totalPts*/
