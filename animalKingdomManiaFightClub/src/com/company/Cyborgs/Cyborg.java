package com.company.Cyborgs;


import com.company.Animal;

/**
 *if animals implement this interface they become cyborgs and can exterminate
 */
public interface Cyborg {
    /**
     *
     * @param animal the animal to be exterminated
     */
    public void exterminate(Animal animal);
}
