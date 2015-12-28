package com.app.fourqulhindi;

import java.util.ArrayList;

/**
 * Created by Krishna on 02-05-2015.
 */


public class Content {

    public static ArrayList<String> Names;
    public static ArrayList<String> NamesSub;
    public static ArrayList<String> Images;
    public static ArrayList<String> Wallpaper;
    public static ArrayList<String> Audio;
    public static ArrayList<String> BIG_Images;
    public static ArrayList<String> Sub_heading;
    public static ArrayList<String> Description;


    Content(){
        this.Names = new ArrayList<String>();
        this.NamesSub = new ArrayList<String>();
        this.Sub_heading = new ArrayList<String>();
        this.Images = new ArrayList<String>();
        this.Wallpaper = new ArrayList<String>();
        this.BIG_Images = new ArrayList<String>();
        this.Audio = new ArrayList<String>();
        this.Description = new ArrayList<String>();

        this.Names.add(0,"1. अल-काफ़िरुन");
        this.Names.add(1,"2. अल-इखलास");
        this.Names.add(2,"3. अल-नास");
        this.Names.add(3,"4. अल-फलक");



        //this.Audio.add(0,"null");
        for(int i=1;i<=5;i++){
            this.Audio.add(i-1,"audio"+i);
        }

        for(int j=1;j<=5;j++){
            this.Images.add(j-1,"name"+j+"_small");
        }

        for(int k=1;k<=5;k++){
            this.BIG_Images.add(k-1,"name"+k);
        }

        for(int a=1;a<=5;a++){
            this.Wallpaper.add(a-1,"name"+a+"_wallpaper");
        }


        this.NamesSub.add(0,"अल-काफ़िरुन");
        this.NamesSub.add(1,"अल-इखलास");
        this.NamesSub.add(2,"अल-नास");
        this.NamesSub.add(3,"अल-फलक");



        this.Sub_heading.add(0,"بِسْمِ اللَّـهِ الرَّحْمَـٰنِ الرَّحِيمِ\n" +
                "قُلْ يَا أَيُّهَا الْكَافِرُونَ ﴿١﴾ لَا أَعْبُدُ مَا تَعْبُدُونَ ﴿٢﴾ وَلَا أَنتُمْ عَابِدُونَ مَا أَعْبُدُ ﴿٣﴾ وَلَا أَنَا عَابِدٌ مَّا عَبَدتُّمْ ﴿٤﴾ وَلَا أَنتُمْ عَابِدُونَ مَا أَعْبُدُ ﴿٥﴾ لَكُمْ دِينُكُمْ وَلِيَ دِينِ ﴿٦﴾");
        this.Sub_heading.add(1,"بِسْمِ اللَّـهِ الرَّحْمَـٰنِ الرَّحِيمِ\n" +
                "قُلْ هُوَ اللَّـهُ أَحَدٌ ﴿١﴾ اللَّـهُ الصَّمَدُ ﴿٢﴾ لَمْ يَلِدْ وَلَمْ يُولَدْ ﴿٣﴾ وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ ﴿٤﴾");
        this.Sub_heading.add(2,"بِسْمِ اللَّـهِ الرَّحْمَـٰنِ الرَّحِيمِ\n" +
                "قُلْ أَعُوذُ بِرَبِّ النَّاسِ ﴿١﴾ مَلِكِ النَّاسِ ﴿٢﴾ إِلَـٰهِ النَّاسِ ﴿٣﴾ مِن شَرِّ الْوَسْوَاسِ الْخَنَّاسِ ﴿٤﴾ الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ ﴿٥﴾ مِنَ الْجِنَّةِ وَالنَّاسِ ﴿٦﴾");
        this.Sub_heading.add(3,"بِسْمِ اللَّـهِ الرَّحْمَـٰنِ الرَّحِيمِ\n" +
                "قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ ﴿١﴾ مِن شَرِّ مَا خَلَقَ ﴿٢﴾ وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ ﴿٣﴾ وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ ﴿٤﴾ وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ ﴿٥﴾");

        // position 12  13  14 39 59 65 66 75 94
        this.Description.add(0,"(ऐ रसूल) तुम कह दो कि ऐ काफिरों (1)\n तुम जिन चीज़ों को पूजते हो, मैं उनको नहीं पूजता (2)\n और जिस (ख़ुदा) की मैं इबादत करता हूँ उसकी तुम इबादत नहीं करते (3)\n और जिन्हें तुम पूजते हो मैं उनका पूजने वाला नहीं (4)\n और जिसकी मैं इबादत करता हूँ उसकी तुम इबादत करने वाले नहीं (5)\n तुम्हारे लिए तुम्हारा दीन मेरे लिए मेरा दीन (6)");
        this.Description.add(1,"(ऐ रसूल) तुम कह दो कि ख़ुदा एक है (1)\n ख़ुदा बरहक़ बेनियाज़ है (2)\n न उसने किसी को जना न उसको किसी ने जना, (3)\n और उसका कोई हमसर नहीं (4)");
        this.Description.add(2,"(ऐ रसूल) तुम कह दो मैं लोगों के परवरदिगार (1)\n लोगों के बादशाह (2)\n लोगों के माबूद की (शैतानी) (3)\n वसवसे की बुराई से पनाह माँगता हूँ (4)\n जो (ख़ुदा के नाम से) पीछे हट जाता है जो लोगों के दिलों में वसवसे डाला करता है (5)\n जिन्नात में से ख्वाह आदमियों में से (6)");
        this.Description.add(3,"(ऐ रसूल) तुम कह दो कि मैं सुबह के मालिक की (1)\n हर चीज़ की बुराई से जो उसने पैदा की पनाह माँगता हूँ (2)\n और अंधेरीरात की बुराई से जब उसका अंधेरा छा जाए (3)\n और गन्डों पर फूँकने वालियों की बुराई से (4)\n (जब फूँके) और हसद करने वाले की बुराई से (5)");



    }

}
