/**
 * 
 */
package com.springinaction.idol.impl;

import java.util.List;

import com.springinaction.idol.Instrument;
import com.springinaction.idol.Performer;

/**
 * @author Sysadmin
 *
 */
public class OneManBand implements Performer {

	private List<Instrument> instrumentsList = null;
	/* (non-Javadoc)
	 * @see com.springinaction.idol.Performer#perform()
	 */
	@Override
	public void perform() throws Exception {
		for(Instrument instrument : instrumentsList)
		{
			instrument.play();
		}
	}
	/**
	 * @return the instrumentsList
	 */
	public List<Instrument> getInstrumentsList() {
		return instrumentsList;
	}
	/**
	 * @param instrumentsList the instrumentsList to set
	 */
	public void setInstrumentsList(List<Instrument> instrumentsList) {
		this.instrumentsList = instrumentsList;
	}

}
