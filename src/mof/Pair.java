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
public class Pair {
 
    private final int key;
    private final int value;

    public Pair(int aKey, int aValue)
    {
        key   = aKey;
        value = aValue;
    }

    public int key()   { return key; }
    public int value() { return value; }
}
