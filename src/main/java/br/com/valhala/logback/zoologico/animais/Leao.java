package br.com.valhala.logback.zoologico.animais;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Leao implements Animal {

    final static Logger logger = LoggerFactory.getLogger(Leao.class);

    @Override
    public void emiteSom() {
        logger.warn("roar! grraurrr! brrrum!");
    }

}
