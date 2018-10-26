package com.justicecoder.cooltext;

import android.widget.*;
import android.content.*;

public class CoolTextStyle {
	private Context l002432;
	private String[] l01043 = {
		"bubble",
		"cursive_elegant",
		"black_bracket",
		"white_bracket",
		"arow_below",
		"asterisk_below",
		"underline",
		"invisible_ink",
		"stinky",
		"bridge_below",
		"bridge_above",
		"love",
		"slash",
		"strikethrough",
		"special",
		"small_word",
		"fancy"
	};

	public CoolTextStyle(Context context) {
		this.l002432 = context;
	}

	String style_bubble() {
		return l01043[0];
	}

	String style_cursive_elegant() {
		return l01043[1];
	}

	String style_black_bracket() {
		return l01043[2];
	}

	String style_white_bracket() {
		return l01043[3];
	}

	String style_arow_below() {
		return l01043[4];
	}

	String style_asterisk_below() {
		return l01043[5];
	}

	String style_underline() {
		return l01043[6];
	}

	String style_invisible_ink() {
		return l01043[7];
	}

	String style_stinky() {
		return l01043[8];
	}

	String style_bridge_below() {
		return l01043[9];
	}

	String style_bridge_above() {
		return l01043[10];
	}

	String style_love() {
		return l01043[11];
	}

	String style_slash() {
		return l01043[12];
	}

	String style_strikethrough() {
		return l01043[13];
	}

	String style_special() {
		return l01043[14];
	}

	String style_small_word() {
		return l01043[15];
	}

	String style_fancy() {
		return l01043[16];
	}

	void showException(String exception) {
		Toast.makeText(l002432, "Exception : " + exception, Toast.LENGTH_SHORT).show();
	}

	String developerName() {
		return "Kaung Khant Kyaw (Justice Coder)";
	}

	String githubLink() {
		return "https://github.com/JusticeCoder/CoolText";
	}

	String devProfile1() {
		return "fb://profile/100012183557720";
	}

	String devProfile2() {
		return "https://www.facebook.com/kaungkhantkyawprofile";
	}

	String[] titleList() {
		String[] tl = {
			"Bubble",
			"Black Bracket",
			"Special",
			"Cursive Elegant",
			"Small word",
			"White Bracket",
			"Arrow Below",
			"Asterisk Below",
			"Underline",
			"Fancy",
			"Invisible Ink",
			"Stinky",
			"Bridge Below",
			"Bridge Above",
			"Love",
			"Slash",
			"Strikethrough"
		};
		return tl;
	}

	String[] coolTextList() {
		String[] sl = {
			"Ⓒⓞⓞⓛ Ⓣⓔⓧⓣ",
			"【C】【o】【o】【l】 【T】【e】【x】【t】",
			"🇨​🇴​🇴​🇱​ 🇹​🇪​🇽​🇹​",
			"Cｏｏｌ Tｅｘｔ",
			"ᶜᵒᵒˡ ᵗᵉˣᵗ",
			"『C』『o』『o』『l』 『T』『e』『x』『t』",
			"C͎o͎o͎l͎ T͎e͎x͎t͎",
			"C͙o͙o͙l͙ T͙e͙x͙t͙",
			"C̲o̲o̲l̲ T̲e̲x̲t̲",
			"ᑕOOᒪ  TE᙭T",
			"C҉o҉o҉l҉  T҉e҉x҉t҉",
			"C̾o̾o̾l̾ T̾e̾x̾t̾",
			"C̺o̺o̺l̺ T̺e̺x̺t̺",
			"C͆o͆o͆l͆ T͆e͆x͆t͆",
			"C♥o♥o♥l♥ T♥e♥x♥t♥",
			"C̷o̷o̷l̷ T̷e̷x̷t̷",
			"C̶o̶o̶l̶ T̶e̶x̶t̶"
		};
		return sl;
	}
}

