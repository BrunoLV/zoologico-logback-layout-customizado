package br.com.valhala.logback.zoologico.layout;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.LayoutBase;

public class LayoutLogZoologico extends LayoutBase<ILoggingEvent> {

	@Override
	public String doLayout(ILoggingEvent event) {
		
		final LocalDateTime data = LocalDateTime.ofInstant(Instant.ofEpochMilli(event.getTimeStamp()), ZoneId.systemDefault());
		
		final StringBuffer bf = new StringBuffer(128);
		
		bf.append(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS")));
		bf.append(" - ");
		bf.append("[ ");
		bf.append(event.getThreadName());
		bf.append(" ]");
		bf.append(" :: ");
		bf.append(event.getLevel().levelStr);
		bf.append(" :: ");
		bf.append(event.getLoggerName());
		bf.append(" => ");
		bf.append(event.getFormattedMessage());
		bf.append("\n");
		
		return bf.toString();
		
	}

}
