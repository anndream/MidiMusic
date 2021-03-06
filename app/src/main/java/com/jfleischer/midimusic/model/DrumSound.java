package com.jfleischer.midimusic.model;

import java.io.Serializable;

import com.jfleischer.midimusic.audio.SoundManager;

public class DrumSound implements Serializable{

	private static final long serialVersionUID = -6293248397162941667L;
	private final String name;
	private final String fileName;
	private int soundID;

	public DrumSound(String fN){
		fileName=fN;
		name = fileName.replace(".wav", "");
		soundID = -1;
	}
	public String getFileName() {
		return fileName;
	}
	public int getSoundID() {
		return soundID;
	}
	public String getName() {
		return name;
	}

	public void setSoundId(){
		soundID = SoundManager.getInstance().addSoundToDrumSoundPool(fileName);
	}
}
