package br.com.valhala.logback.zoologico.animais;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lobo implements Animal {

    final static Logger logger = LoggerFactory.getLogger(Lobo.class);

    @Override
    public void emiteSom() {
        logger.warn("áuuuuuu!");
    }

}
