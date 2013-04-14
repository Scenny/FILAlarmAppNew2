package com.FourIL.AlarmApp;

import java.io.Serializable;

import android.net.Uri;

public class InfoPack implements Serializable {
	public int id;
	public String name;
	public String url;
	public String images;
	public String music;
	public String shortDescription;
	public String longDescription;
	public long time;

	public InfoPack() {
		id = -1;
	}


	public void tryToGetImages() {
		//TODO get images and music
	}


}