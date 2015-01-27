package com.bics.fcitrack.model;

import java.util.EnumSet;

/**
 * Created by godex_000 on 19.01.2015.
 */
public enum TwType{
    DISCONNECTED,STANDART,TEST;
    public static final EnumSet<TwType> all =EnumSet.of(TwType.DISCONNECTED,TwType.STANDART,TwType.TEST);
}
