package com.justicecoder.cooltext;

import java.util.List;
import android.os.*;
import android.content.*;
import android.widget.*;

public class CoolText extends AsyncTask <String, String, String>
{
  	private Context l00012;
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

	String[] coolTextList()
	{
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

  	public CoolText(Context conl06701)
	{
  		this.l00012 = conl06701;
	}

  	@Override
	protected void onPreExecute()
	{
		super.onPreExecute();
	}

	@Override
	protected String doInBackground(String[] l06701)
	{
		String l06702 = l06701[0]; 

		int[] l000130 = {9327, 9333, 9263, 9402};
		int[] l000131 = {65248, 0, 0, 0};
		String []  l000132 = { "【", "】" };
		String []  l000133 = { "『", "』" };
		String []  l000134 = { "", "͎" };
		String []  l00014 = { "", "͙" };
		String []  l000140 = { "", "̲" };
		String []  l000141 = { "", "҉ " };
		String []  l000142 = { "", "̾" };
		String []  l000143 = { "", "̺" };
		String []  l000144 = { "", "͆" };
		String []  l0002 = { "", "♥" };
		String []  l00020 = { "", "̷" };
		String []  l000200 = { "", "̶" };

		String [] [] l000201 = { {"a", "🇦​"}, {"b", "🇧​"}, {"c", "🇨​"}, {"d", "🇩​"},
			{"e", "🇪​"}, {"f", "🇫​"}, {"g", "🇬​"}, {"h", "🇭​"} , {"i", "🇮​"}, {"j", "🇯​"}, {"k", "🇰​"}, {"l", "🇱​"},
			{"m", "🇲​"}, {"n", "🇳​"}, {"o", "🇴​"}, {"p", "🇵​"} , {"q", "🇶​"}, {"r", "🇷​"}, {"s", "🇸​"}, {"t", "🇹​"},
			{"u", "🇺​"}, {"v", "🇻​"}, {"w", "🇼​"}, {"x", "🇽​"},  {"y", "🇾​"}, {"z", "🇿​"}   };

		String [] [] l000202 = { {"a", "ᵃ"}, {"b", "ᵇ"}, {"c", "ᶜ"}, {"d", "ᵈ"},
			{"e", "ᵉ"}, {"f", "ᶠ"}, {"g", "ᵍ"}, {"h", "ʰ"}, {"i", "ᶤ"}, {"j", "ʲ"}, {"k", "ᵏ"}, {"l", "ˡ"},
			{"m", "ᵐ"}, {"n", "ᶰ"}, {"o", "ᵒ"}, {"p", "ᵖ"} , {"q", "ᵠ"}, {"r", "ʳ"}, {"s", "ˢ"}, {"t", "ᵗ"},
			{"u", "ᵘ"}, {"v", "ᵛ"}, {"w", "ʷ"}, {"x", "ˣ"} ,  {"y", "ʸ"}, {"z", "ᶻ"} };

		String [] [] l000203 = { {"a", "ᗩ"}, {"b", "ᗷ"}, {"c", "ᑕ"}, {"d", "ᗪ"},
			{"e", "E"}, {"f", "ᖴ"}, {"g", "G"}, {"h", "ᕼ"}, {"i", "I"}, {"j", "ᒍ"}, {"k", "K"}, {"l", "ᒪ"},
			{"m", "ᗰ"}, {"n", "ᑎ"}, {"o", "O"}, {"p", "ᑭ"} , {"q", "ᑫ"}, {"r", "ᖇ"}, {"s", "ᔕ"}, {"t", "T"},
			{"u", "ᑌ"}, {"v", "ᐯ"}, {"w", "ᗯ"}, {"x", "᙭"} ,  {"y", "Y"}, {"z", "ᘔ"} };


		if (l06701[1].equals(l01043[0]))
		{
			l06702 = l000103(l06702, l000130);
		}

		else if (l06701[1].equals(l01043[1]))
		{
			l06702 = l000103(l06702, l000131);
		} 

		else if (l06701[1].equals(l01043[2]))
		{
			l06702 = l000211(l06702, l000132[0], l000132[1]);
		}

		else if (l06701[1].equals(l01043[3]))
		{
			l06702 = l000211(l06702, l000133[0], l000133[1]);
		}

		else if (l06701[1].equals(l01043[4]))
		{
			l06702 = l000211(l06702, l000134[0], l000134[1]);
		}

		else if (l06701[1].equals(l01043[5]))
		{
			l06702 = l000211(l06702, l00014[0], l00014[1]);
		}

		else if (l06701[1].equals(l01043[6]))
		{
			l06702 = l000211(l06702, l000140[0], l000140[1]);
		}

		else if (l06701[1].equals(l01043[7]))
		{
			l06702 = l000211(l06702, l000141[0], l000141[1]);
		}

		else if (l06701[1].equals(l01043[8]))
		{
			l06702 = l000211(l06702, l000142[0], l000142[1]);
		}

		else if (l06701[1].equals(l01043[9]))
		{
			l06702 = l000211(l06702, l000143[0], l000143[1]);
		}

		else if (l06701[1].equals(l01043[10]))
		{
			l06702 = l000211(l06702, l000144[0], l000144[1]);
		}

		else if (l06701[1].equals(l01043[11]))
		{
			l06702 = l000211(l06702, l0002[0], l0002[1]);
		}

		else if (l06701[1].equals(l01043[12]))
		{
			l06702 = l000211(l06702, l00020[0], l00020[1]);
		}

		else if (l06701[1].equals(l01043[13]))
		{
			l06702 = l000211(l06702, l000200[0], l000200[1]);
		}

		else if (l06701[1].equals(l01043[14]))
		{
			l06702 = l000204(l06702, l000201);
		} 

		else if (l06701[1].equals(l01043[15]))
		{
			l06702 = l000204(l06702, l000202); 
		} 

		else if (l06701[1].equals(l01043[16]))
		{
			l06702 = l000204(l06702, l000203); 
		} 

  		return l06702;
	}

  	private String l000204(String l06702, String[][] l00021)
	{
		l06702 = l06702.toLowerCase();
		for (String[] replace : l00021)
		{
			l06702 = l06702.replaceAll(replace[0], replace[1]); 
		}
		return l06702; 
	}

	private String l000211(String l06702, String l09201, String l09202)
	{
		String[] l000212 = l06702.split("");

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < l06702.length() + 1 ; i++)
		{
			sb.append(l09201 + l000212[i] + l09202); 

		}

		String l000213 = sb.toString();
		l000213 = l000213.replaceAll(l09201 + "\\s" + l09202, " "); 
		return l000213;
	}

	private String l000103(String l06702, int[] l00022)
	{
		char[] array = l06702.toCharArray();
		StringBuffer sb = new StringBuffer(); 
		for (int i = 0; i < array.length; i++)
		{ 
			int l000220 = array[i];
			if (l000220 >= 97 && l000220 <= 122) 
			{ int l000221 = l000220 + l00022[0]; 

				sb.append((char) l000221); }

			else if (l000220 >= 65 && l000220 <= 90) 
			{ int l000221 = l000220 + l00022[1]; 

				sb.append((char) l000221); 
			}

			else if (l000220 >= 49 && l000220 <= 57) 
			{ int l000221 = l000220 + l00022[2]; 
				sb.append((char) l000221); 
			}

			else if (l000220 == 48) 
			{ int l000221 = l000220 + l00022[3]; 
				sb.append((char) l000221); 
			}

			else
			{ 
				sb.append((char)l000220);
			} 
		}      
		return sb.toString();
	}

	@Override
	protected void onPostExecute(String l06702)
	{
		super.onPostExecute(l06702);
	}

}
  
