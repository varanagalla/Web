/**
 * 
 */
package com.gof.dp.impl;

import com.gof.dp.AdvancedMediaPlayer;

/**
 * @author Sysadmin
 *
 */
public class VLCPlayer implements AdvancedMediaPlayer {

	/* (non-Javadoc)
	 * @see com.gof.dp.AdvancedMediaPlayer#playVLC()
	 */
	@Override
	public void playVLC(String fileName) {
		System.out.println("Playing vlc file. File..."+fileName);
	}

	/* (non-Javadoc)
	 * @see com.gof.dp.AdvancedMediaPlayer#playMP4()
	 */
	@Override
	public void playMP4(String fileName) {
		// TODO Auto-generated method stub

	}

}
