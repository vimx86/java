package org.galsang.java.designpattern.create.prototype;

/**
 * Description：
 * <br /> Author： galsang
 */
public class ElfWarlord extends Warlord {

    public ElfWarlord() {
    }

    @Override
    public Warlord clone() throws CloneNotSupportedException {
        return new ElfWarlord();
    }

    @Override
    public String toString() {
        return "Elven warlord";
    }

}
