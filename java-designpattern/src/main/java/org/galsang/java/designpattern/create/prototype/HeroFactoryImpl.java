package org.galsang.java.designpattern.create.prototype;

/**
 * Description：
 * <br /> Author： galsang
 */
public class HeroFactoryImpl implements HeroFactory {

    private Warlord warlord;

    public HeroFactoryImpl(Warlord warlord) {
        this.warlord = warlord;
    }

    @Override
    public Warlord createWarlord() {
        try {
            return warlord.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
