package com.leetCodeMay;

import java.util.*;
public class FirstUniqueCharacter {
	
	public static void main(String[] args) {
		
		String s = "mmestrsbrlktgkorlcnihdfwopqcgwsmehcvhahqlpvakkxmfuprbrehquexugctesjgaxcvhoswemaamknuddvlaoniwvopunbfxhdsgocngkqwxuakptxsogwnktnauabdsibwgivlhciwgrisehtfkuvxrahhmssxsbejamccwvhwbduekibduisfttvdmntsxuouebcbflwaqifrroinnjoirvpnuxfkcheglbmbtmntlrkijiajlijyjgudebqrbdjpdcbbaxtpkgujkatriwkbvwvqelthwitiovbbevanwpkemuovsakjlfbjuuocqfkqcktbhonendvkxfetlbaunljqnwteguxhbipksscvieustdknrifesxvuvxhectkwrbotdbooiiqeiwdtgmaackmvgafdltcmmdavtdkrdarjxfflbgcbfupuwjdqjmqbrhugdhogtuwawsqhswdwsnvahkblmolwinlqjgrdxdacgtvwrekplmobhcanmjecrvntpadcohwnibujgiaexdmiakqejmtfmgqftfvccobddtmpbrewhqvtjdatdqhpjbpqxvpecjadwloicaxubmjfcsqxkvqjapqerhahoimwtxkmrnqxgpjtdssswdxsjgepdejdwdfdjboeoiigwbnxukdtxbuluoktuurqcrkkppvpbjgjkruifjosobgssbdhupjpsluehbvnthmiqigpoqjajrojbvgulvbxojcaqjxxcehmrwvkhxemcsliktubrnijolfosnkexzjeodwmigawhegfgtmoorousbmonhomtwkiwxmkknfpsxxcevxdkpualdarkfvqvdbjqbnodtcgcsvptjvbnqkfxiiwxifhmhpvwdjhubqdgojsnovxpmpuirvgvhwjkqepxdrvoaopatsfjoivrsmumgphmmbxwxxudsvjpfnqxjbpgxnurtjvfhflvvnaqmiorqmcbdurdqfbwcnljieibdasoluepximluxadrehmihsaohkxhiukepcjoldvqxhqqvduwvucigkmneknqdbxatfeomwboewjkxmotopfjtjknmkrvopiidtjdxumlirudmtqiqbvlgqsposvmixmuishmmgmncqcdngcvcqcoggndcdihkanmcevcklsmtudjkpervgvkmmbbkuculdcxiinfrlgsleqxcnwoqdeopqhrlfkumplolpgnkwbojqplwrisufidaupkihsguujbkai";
		System.out.println(firstUniqChar(s));
	}
	
	public static int firstUniqChar(String s) {
		int val = -1;
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		TreeMap<Integer,Integer> idx = new TreeMap<Integer, Integer>();
		
		for(int i=0;i<s.length();i++) {
			String data = s.substring(i,i+1);
			if(hm.get(data)==null) {
				hm.put(data, i);
				idx.put(i, 1);
			}else
			{
			int d =	Integer.parseInt(hm.get(data).toString());
			idx.put(d, Integer.parseInt(idx.get(d).toString())+1);
			}
		}
		System.out.println(hm);
		System.out.println(idx);
		for(Map.Entry<Integer, Integer> entry: idx.entrySet()) {
			if(entry.getValue()==1) {
				val = entry.getKey();
				break;
			}
		}
		return val;
	}

}
