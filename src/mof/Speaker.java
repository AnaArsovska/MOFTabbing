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

    public Speaker(String name) {
        NAME = name;
    }

    public String getName() {
        return NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
