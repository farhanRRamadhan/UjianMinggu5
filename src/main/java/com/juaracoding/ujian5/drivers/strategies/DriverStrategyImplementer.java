package com.juaracoding.ujian5.drivers.strategies;

import com.juaracoding.ujian5.utils.Constans;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy){
        switch (strategy){
            case Constans.CHROME:
                return new Chrome();
            case Constans.FIREFOX:
                return new Firefox();
            default:
                return null;
        }
    }
}
