/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mof;

import java.util.ArrayList;

/**
 *
 * @author ana
 */
public class Judge {

    final private String NAME;
    final private String qualYears;
    final private String organization;
    final private int judgeIndex;
    private boolean hasJudged;
    private boolean available;
    private int qualScale;
            
    public Judge(String name, String qual, String org, int index, boolean hasjudged) {       
        NAME = name;
        qualYears = qual;
        organization = org;
        judgeIndex = index;
        hasJudged = hasjudged;
        qual();
    }
    
    public String getName(){
        return NAME;
    }
    
    private void qual(){
        if(null != qualYears)switch (qualYears) {
            case "A":
                qualScale = 4;
                break;
            case "B":
                qualScale = 3;
                break;
            case "C":
                qualScale = 2;
                break;
            case "Shadow":
                qualScale = 1;
                break;
            default:
                qualScale = 0;
                break;
        }
    }
    
    public int getQual(){
        return qualScale;
    }
      
    public String getOrg(){
        return organization;
    }

    public int getIndex(){
        return judgeIndex;
    }
		
    public void markJudged(){
        hasJudged = true;
    }
    
    public void unmarkJudged(){
        hasJudged = false;
    }
   
    @Override
    public String toString() {
        return NAME;
    }
}

