/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pridc7921
 */
public class City {

    int nOilrigs = 2;

    City DeepCopy() { //DeepCopy, so ships have unique stats
        City city = new City();
        return city;

    }
}
