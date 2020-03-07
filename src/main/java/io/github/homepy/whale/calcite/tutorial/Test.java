package io.github.homepy.whale.calcite.tutorial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	
	public static void main(String[] args) {
		
		System.out.println("abc12345678psd".replaceAll("\\d{8}", "*"));
		
		System.out.println("abc123psd".replaceAll("\\d", "*"));
		
		Pattern p = Pattern.compile("\\d{1,}");//这个2是指连续数字的最少个数
        String u = "abc435345defsfsaf564565fsabad5467755fewfadfgea";
        Matcher m = p.matcher(u);
        int i = 0;
        while (m.find()) {
            System.out.println(m.group());
            i++;
        }
        
        System.out.println(String.valueOf(137438953471L));
		
		
	}
	
}
