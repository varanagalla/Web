/**
 * 
 */
package com.gof.dp.impl;

import com.gof.dp.AdvancedMediaPlayer;
import com.gof.dp.MediaPlayer;

/**
 * @author Sysadmin
 *
 */
public class MediaAdapter implements MediaPlayer {
	
	private AdvancedMediaPlayer advMusicPlayer;
	
	public MediaAdapter(String audioType){
		if("vlc".equalsIgnoreCase(audioType)){
			this.advMusicPlayer = new VLCPlayer();
		}
		else if("mp4".equalsIgnoreCase(audioType)){
			this.advMusicPlayer = new MP4Player();
		}
	}

	/* (non-Javadoc)
	 * @see com.gof.dp.MediaPlayer#play(java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName) {
		if("vlc".equalsIgnoreCase(audioType)){
			this.advMusicPlayer.playVLC(fileName);
		}
		else if("mp4".equalsIgnoreCase(audioType)){
			this.advMusicPlayer.playMP4(fileName);
		}
	}

}
