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

    final private String[] NAMES;

    public Team(String[] names) {
        NAMES = names;
    }

    public String[] getNames() {
        return NAMES;
    }

    @Override
    public String toString() {
        return Arrays.toString(NAMES);
    }
}
