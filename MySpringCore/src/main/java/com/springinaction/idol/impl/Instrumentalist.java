/**
 * 
 */
package com.springinaction.idol.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.springinaction.idol.Instrument;
import com.springinaction.idol.Performer;

/**
 * @author Sysadmin
 *
 */
@Component("eddie")
public class Instrumentalist implements Performer 
{
	@Value("#{settings['song.name']}")
	private String song;
	@Inject
	@Named("piano")
	private Instrument instrument;
	
	/* (non-Javadoc)
	 * @see com.springinaction.idol.Performer#perform()
	 */
	@Override
	public void perform() throws Exception {
		System.out.println("Playing : "+song);
		instrument.play();
	}

	/**
	 * @return the song
	 */
	public String getSong() {
		return song;
	}

	/**
	 * @param song the song to set
	 */
	public void setSong(String song) {
		this.song = song;
	}

	/**
	 * @return the instrument
	 */
	public Instrument getInstrument() {
		return instrument;
	}

	//@Autowired
	//@Qualifier("saxophone")
	/**
	 * @param instrument the instrument to set
	 */
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

}
