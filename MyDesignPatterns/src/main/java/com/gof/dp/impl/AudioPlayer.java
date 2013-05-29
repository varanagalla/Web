/**
 * 
 */
package com.gof.dp.impl;

import com.gof.dp.MediaPlayer;

/**
 * @author Sysadmin
 *
 */
public class AudioPlayer implements MediaPlayer {
	
	private MediaAdapter adapter;

	/* (non-Javadoc)
	 * @see com.gof.dp.MediaPlayer#play(java.lang.String, java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName) {
		if("mp3".equalsIgnoreCase(audioType)){
			System.out.println("Playing MP3 file. File :: "+fileName);
		}
		else if("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)){
			this.adapter = new MediaAdapter(audioType);
			this.adapter.play(audioType, fileName);
		}
		else{
			System.out.println("Invalid media. "+ audioType + " format not supported.");
		}
	}

}
