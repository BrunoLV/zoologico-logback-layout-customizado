package br.com.valhala.logback.zoologico.animais;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Papagaio implements Animal {

    final static Logger logger = LoggerFactory.getLogger(Papagaio.class);

    @Override
    public void emiteSom() {
        logger.warn("crrác crrác!");
    }

}
