/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pridc7921
 */
public class City {
    
    boolean isplayer = false;
    
    //Buildings
    int nOilrigs = 2;
    int nHouses = 4;
    int nMotorpools = 0;
    int nBarracks = 1;
    int nWarfactories = 0;
    int nRunways = 0;
    //Units
    int nFighters = 0;
    int nAAAguns = 0;
    int nAFVs = 0;
    int nTanks = 0;
    int nInf = 0;

    City DeepCopy() { //DeepCopy, so ships have unique stats
        City city = new City();
        return city;

    }
}
