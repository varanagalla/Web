/**
 * 
 */
package com.gof.dp.impl;

import com.gof.dp.AdvancedMediaPlayer;

/**
 * @author Sysadmin
 *
 */
public class MP4Player implements AdvancedMediaPlayer{

	@Override
	public void playVLC(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMP4(String fileName) {
		System.out.println("Playing MP4 Player :: "+fileName);
	}

}
