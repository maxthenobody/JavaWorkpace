package com.kh.chap01_list.arrayList.model.vo;

import java.util.Comparator;

public class MusicArtistDescending implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		return o1.getArtist().compareTo(o2.getArtist());
	}

}
