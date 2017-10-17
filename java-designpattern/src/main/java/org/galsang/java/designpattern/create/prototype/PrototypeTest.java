package org.galsang.java.designpattern.create.prototype;

/**
 * Description：
 * <br /> Author： galsang
 */
public class PrototypeTest {

    public static void main(String[] args) {

        HeroFactory heroFactory;
        Warlord warlord;

        heroFactory = new HeroFactoryImpl(new OrcWarlord());
        warlord = heroFactory.createWarlord();

        System.out.println("warlord: === " + warlord.toString());


        heroFactory = new HeroFactoryImpl(new ElfWarlord());
        warlord = heroFactory.createWarlord();

        System.out.println("warlord: === " + warlord.toString());

    }

}
