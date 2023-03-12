package somethingElse;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class SortByLocale {
	

	
	
public static void main(String[] args) {
		
//		System.out.println((int)'㔟');
//		System.out.println((int)'二');
//		System.out.println((int)'g');
//		System.out.println((char)13599);

		
		String[] ss = {"一","二","三","丁","八","付","㔟"};
		Arrays.sort(ss);
		
			
//		System.out.println(Collator.getInstance());
		
        Arrays.sort(ss,(s1,s2) ->{
        	System.out.println(s1 + " " + s2);
        	Collator c = Collator.getInstance(Locale.TAIWAN);
        	System.out.println(c.compare(s1,s2));
        	return c.compare(s1,s2);
        });

//        System.out.println(Arrays.toString(ss));
        
        //TAIWAN繁中照筆畫、CHINA照拼音排、US跟預設一樣照Unicode
        //需要特別加入以上程式碼才能照要求做排序

        
	}

}
