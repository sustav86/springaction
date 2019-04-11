package com.sustav.chap2;

import java.util.Collection;
import java.util.Properties;

public class OneManBand implements Performer {

    private Collection<Instrument> instruments;
    private Properties properties;

    @Override
    public void perform() {
        instruments.forEach(instrument -> instrument.play());
    }

//    public OneManBand(Collection<Instrument> instruments) {
//        this.instruments = instruments;
//    }


    public OneManBand() {
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
