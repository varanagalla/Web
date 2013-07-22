/**
 * 
 */
package com.gof.dp.main;

import com.gof.dp.impl.AudioPlayer;


/**
 * @author Sysadmin
 *
 */
public class AdapterPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("vlc", "VLCFile.vlc");
		audioPlayer.play("mp3", "MP3 File.mp3");
		audioPlayer.play("mp4", "MP4 File.mp4");
		audioPlayer.play("avi", "AVI File.avi");
	}

}
