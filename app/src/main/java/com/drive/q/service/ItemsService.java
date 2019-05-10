package com.drive.q.service;

import android.util.Log;
import android.widget.Toast;

import com.drive.q.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemsService {








    public List<Item> getItems(){

//        List<Item> questions = new ArrayList<>();

        List<Item> items = new ArrayList<>();
        items.add(new Item("Ano ang dapat mong ihanda kung malayo ang biyahe?	","Maghanda ng kagamitang pangkumpuni ng sasakyan kung masiraan	","Planuhin ang ruta at ikondisyon ang sasakyan	","Tama lahat ang nasa itaas	","C"));
        items.add(new Item("Bago umalis sa paradahan, dapat mong:	","suriin ang paligid bago magpatakbo	","bumusina	","magpatakbo agad	","A"));
        items.add(new Item("Hindi ka maaaring magparada sa:	","lugar tawiran	","one-way na kalye	","loob ng 5 metro ang layo sa fire-hydrant	","A"));
        items.add(new Item("Kapag papalapit sa riles ng tren kung saan may senyas na may paparating na tren, ikaw ay dapat na:	","huminto na may 1.5 metro na layo sa riles	","bagalan ang patakbo at tumuloy ng maingat	","bilisan ang patakbo at unahan ang tren	","A"));
        items.add(new Item("Ayon sa batas, hindi ka maaaring, magmaneho ng matulin maliban kung:	","walang panganib	","naaayon sa takdang bilis o tulin	","tama lahat ng sagot	","C"));
        items.add(new Item("Ano ang kahulugan ng berdeng signal ng trapiko?	","Patakbuhin ng tuloy-tuloy ang sasakyan	","Huminto	","Bagalan ang pagtakbo	","A"));
        items.add(new Item("Ang parking lights ay maaaring gamitin:	","kahit kailan	","kapag magpaparada at mahirap makakita	","kapag nagmamaneho sa kalye na maliwanag ang ilaw	","B"));
        items.add(new Item("Ang pagsuspindi ng lisensya ay nangangahulugan na:	","kailangan itong ma-revalida ng LTO	","ito ay permanenteng kukunin ng LTO	","ito ay pansamantalang kukunin ng LTO	","C"));
        items.add(new Item("Ang dalawang dilaw na linya na tuloy-tuloy ay palatandaan na:	","maaaring lumusot pakanan	","peligroso ang lumusot sa pakanan	","maaaring lumusot pakaliwa	","B"));
        items.add(new Item("Kapag iiwan ang sasakyan, nasasaad sa batas na dapat mong patayin ang makina at:	","hatakin ang handbrake	","ilagay ang kambyo sa neutral	","isara ang mga bintana	","A"));
        items.add(new Item("Kung paparada ng paahon sa may bangketa, dapat mong ipihit ang gulong:	","papuntang bangketa	","papalayo sa bangketa	","kahit anong direksyon	","B"));
        items.add(new Item("Alin sa mga hakbang ang hindi tama kapag ikaw ay liliko pakanan?	","Huminto sa lugar tawiran	","Sumenyas 30 metro bago ka lumiko	","Tignan mo ang mga tatawid sa kalye na lilikuan mo	","A"));
        items.add(new Item("Ang dilaw na linyang tuloy-tuloy ay palatandaan na:	","maaaring lumusot sa kaliwa o kanan	","bawal ang paglusot sa kanan	","bawal ang paglusot sa kaliwa	","C"));
        items.add(new Item("Ang lisensya ng isang drayber ang nagpapahintulot na magmaneho sya ng:	","lahat ng klaseng sasakyan	","mga sasakyan na nakalahad sa kanyang lisensya	","kotse lamang	","B"));
        items.add(new Item("Ang pagmamaneho ng PUV na may stereo-music ay may parusa na:	","multa na Php 1,000	","pagbawi ng lisensya at rehistro	","pagkakakulong ng drayber sa loob ng slide_in_left na buwan	","A"));
        items.add(new Item("Ang layunin ng batas at mga regulasyon sa trapiko at ay:	","makalikom ng pera para sa gobyerno	","makapagtatag ng maayos na daloy ng trapiko, mga sasakyan, mga tumatawid, at mga parusa	","madisiplina ang mga trapik enforcers	","B"));
        items.add(new Item("Anong habit ang tutulong sayo para makaiwas sa fixed-stare at mga distraksyon?	","Ang regular na pagtingin sa malayo at malapit	","Ang pagtingin sa kalsada	","Ang pagtingin sa tulin ng ibang sasakyan	","A"));
        items.add(new Item("Habang nagmamaneho, dapat kang tumingin sa side and rear view mirror ng:	","mabilis/madalian	","hanggang gusto mo	","hindi kukulangin sa isang minuto	","A"));
        items.add(new Item("May dalawang sasakyan na nagtagpo sa pataas na kalsada, sino sa dalawa ang dapat magbigay daan?	","Ang sasakyan na pababa	","Ang sasakyan na pataas	","Ang sasakyan na unang bumusina	","A"));
        items.add(new Item("Kapag naglalakad sa kalsada na walang bangketa, ikaw ay dapat na manatili sa:	","kaliwang bahagi ng kalsada at maglakad sa kasalungat na direksyon ng daloy ng trapiko	","sa kanan na bahagi ng kalsada	","sa kanan o sa kaliwa ay ayos lang	","A"));
        items.add(new Item("May isang puti na linya sa kanang bahagi ng kalsada ang tumalibis papunta sa iyong kaliwa. Ito ay nagpapakita na:	","may nagdugtong na interseksyon sa unahan	","ang kalsada ay magiging makitid	","ikaw ay paparating sa construction area","B"));
        items.add(new Item("Ang lisensya ng isang drayber na nahuli ng tatlong beses sa loob ng 12 na buwan ay maaaring bawiin o suspindihin ng Direktor sa loob ng:	","hindi lalampas sa dalawang taon	","tatlong taon	","habangbuhay	","A"));
        items.add(new Item("Dapat bang magbigay ang drayber na paliko sa interseksyon sa mga tatawid?	","Hindi, ang mga tatawid ang dapat magbigay sa mga sasakyan	","Oo, ang drayber na liliko pakanan o pakaliwa ay dapat magbigay sa mga tatawid	","Oo, kapag ang drayber ay liliko lamang pakaliwa	","B"));
        items.add(new Item("Hindi dapat lumusot (Overtake) sa paanan ng tulay sapagkat:	","may tumatawid	","hindi nakikita ang kasalubong na sasakyan	","makipot ang daan	","B"));
        items.add(new Item("Ang may-ari ng sasakyan na pribadong nakarehistro na ginamit sa pamasada at pagsakay ng mga pasahero o kargamento ay may parusa na:	","multa na Php 2,000 at pagkumpiska ng lisensya	","multa na Php 300	","pagkumpiska ng plaka ng sasakyan	","A"));
        items.add(new Item("Ang pinakamainam na gawin kapag liliko pakanan o pakaliwa habang bumabaybay sa highway ay:	","magbigay ng senyas ng iyong pakay habang lumiliko	","magbigay ng electrical o hand signal sa layong 30 metro bago ka lumiko	","huwag nang magbigay ng senyas kung wala namang kasunod na sasakyan	","B"));
        items.add(new Item("Kung ang drayber ng sasakyan na nasa unahan mo ay naglabas ng kaliwang kamay na nakaturo sa itaas, siya ay:	","kakaliwa	","kakanan	","hihinto	","B"));
        items.add(new Item("Saang lugar hindi maaaring pumarada?	","Sa lugar na tawiran ng tao	","Sa nakatakdang paradahan	","Sa isang patunguhang lugar	","A"));
        items.add(new Item("Ano ang dapat gawin ng isang drayber kung mawala ang kanyang lisensya?	","Mag-apply ng panibagong lisensya	","Magpasa ng affidavit of loss and mag-apply ng panibagong lisensya	","Mag-apply ng duplicate na kopya ng lisensya sa CHPG	","B"));
        items.add(new Item("Ano ang kahulugan ng simbolo na pang-trapiko na kulay asul at puti na parihaba o parisukat ang hugis?	","Nag-uutos ng direkson	","Nagbibigay babala	","Nagbibigay impormasyon	","C"));
        items.add(new Item("Bago makapag-apply ang isang motor vehicle ng prankisa sa DOT, ito ay dapat na nakarehistro na sa:	","Constabulary Highway Patrol Group	","Philippine Motors Association	","Land Transportation Office (LTO)	","C"));
        items.add(new Item("Hindi ka pinapayagang tumawid sa kabila ng buong dilaw na guhit maliban kung ikaw ay:	","palikong pakaliwa	","palikong pakanan	","magpalit ng linya o daan	","A"));
        items.add(new Item("Mapanganib ang palikong kaliwa kaysa sa kanan sapagkat:	","mabilis ang sasakyang galing sa kaliwa	","kailangang maging listo sa mga sasakyang nagmumula sa kaliwa o kanan	","maraming linya ang kalsada	","B"));
        items.add(new Item("Anong dapat gawin bago lumiko sa kanan o kaliwa?	","Biglang lumiko at bumusina	","Magbigay ng hudyat o senyas na hindi kukulangin sa 30 metro	","Ipagwalang bahala ang hudyat	","B"));
        items.add(new Item("Matapos kang lumampas (overtake) at nais mong bumalik sa pinangalingang linya ng ligtas kailangan:	","tignan sa rear-view mirror ang iyong nilagpasan	","lumingon sa iyong nilagpasan	","huminto	","A"));
        items.add(new Item("Ang palugit para sa pag-renew ng rehistro ng sasakyan ay:	","alinsunod sa gusto ng opereytor	","sa katapusan ng taon	","sa huling araw ng buwan na may pasok na katumbas ng huling numero ng plaka ng sasakyan	","C"));
        items.add(new Item("Ang pinakamabisang paraan para makitungo sa bumubuntot na sasakyan ay:	","huwag pansinin at hayaan mo siya na makalapit sayo	","bagalan ang patakbo at hayaan mo siyang makalampas	","bilisan mo ang patakbo at biglang tapakan ang preno	","B"));
        items.add(new Item("Sa Highway, kung nais mong magpatakbo ng mabagal kaysa sa iba, dapat kang gumawi sa:	","kanang linya	","kaliwang linya	","gitnang linya	","A"));
        items.add(new Item("Sa interseksyon na walang Stop o Yield signs, may dalawang sasakyan na paparating galing sa magkaibang kalye. Anong sasakyan ang may right-of-way?	","Ang sasakyan sa kaliwa	","Ang sasakyan na nasa interseksyon	","Ang sasakyan na naunang bumagal	","B"));
        items.add(new Item("Ang pulang bandera o pulang ilaw ay kailangan na nakakabit sa anumang dala ng sasakyan na lalampas ng:	","isang metro mula sa likuran ng sasakyan	","tatlong metro mula sa likuran ng sasakyan	","dalawang metro mula sa likuran ng sasakyan	","A"));
        items.add(new Item("Ano ang kahulugan ng patay-sinding dilaw na ilaw trapiko?	","magmarahan at magpatuloy kung walang panganib	","Huminto at hintayin magbago ang ilaw	","Hintayin ang berdeng ilaw	","B"));
        items.add(new Item("Ang sasakyan ay nakaparada (Parked) kung:	","nakatigil ng matagal at nagsasakay ng pasahero	","nakatigil ng matagal at nagbababa ng pasahero	","nakatigil ng matagal at patay ang makina	","C"));
        items.add(new Item("Ang mahuhuling lasing sa alak o ipinagbabawal na gamot ay may parusang:	","Pagsuspinde ng lisensya	","Pagkabilanggo ng slide_in_left na buwan	","tama lahat ng sagot	","C"));
        items.add(new Item("Ang pagmamaneho sa gabi ay delikado dahil:	","ang mga ilaw sa kalsada ay nakakasilaw	","ang distansya na kita natin ay mas maiksi pag gabi	","mas maraming sasakyan sa kalsada sa gabi	","B"));
        items.add(new Item("Ano ang takdang tulin ng isang sasakyan sa lugar ng paaralan?	","35 kph	","20 kph	","30 kph	","B"));
        items.add(new Item("Ano ang mangyayari kapag pumutok ang iyong gulong sa harap?	","Gegewang ang harap sa panig ng pumutok na gulong	","Gegewang ang likod sa palayo sa pumutok na gulong	","Ang harapan ay hahatakin papunta sa panig ng pumutok na gulong	","C"));
        items.add(new Item("Ang isang drayber ay maaaring magsakay at magbaba ng pasahero:	","bago dumating sa interseksyon	","kahit kailan na pumara ang pasahero	","sa mga nakatalagang lugar hintuan	","C"));
        items.add(new Item("Ano ang kahulugan ng tuloy-tuloy na guhit na kulay dilaw sa gitna ng kalsada?	","Maaaring lumusot (overtake)	","Bawal lumusot	","Tama lahat ng sagot	","B"));
        items.add(new Item("Ang puting linyang putol-putol ay palatandaan na:	","maaaring lumusot sa pakaliwa o pakanan kung walang peligro	","ipinagbabawal ang paglusot sa kanan	","ipinagbabawal ang paglusot sa kanan	","A"));
        items.add(new Item("Ang pangunahing rason kung bakit kailang ang inspeksyon ng mga sasakyan ay:	","para kumita ang gobyerno	","para makita ng inspektor ang iyong sasakyan	","masiguro ng ang iyong sasakyan ay alingsunod sa pamantayan ng kaligtasan	","C"));
        items.add(new Item("Ano ang ibig sabihin ng berdeng palaso (arrow) na ilaw trapiko?	","Hindi pinayagan ang pagpasok sa interseksyon na itinuturo ng palaso	","Nagpapahintulot sa mga sasakyan na kumaliwa at kumanan	","Nagpapahintulot sa pagtawid ng mga taong tatawid	","B"));
        items.add(new Item("Kailangan magbigay ng senyas kung kakanan o kakaliwa sa darating na interseksyon sa layong:	","15 m	","60 m	","30 m	","C"));
        items.add(new Item("Ang motor vehicle ay sasakyan na:	","pinapatakbo ng makina	","tumatakbo ng malayo at sa trapiko	","tumatakbo gamit ang lakas ng kalamnan tulad ng bisekleta	","A"));
        items.add(new Item("Ang pagmamaneho ng walang lisensya ay ipinagbabawal ng batas at may kaparusahang:	","Php 500	","Php 500 at pagka-impound ng sasakyan ng hindi hihigit sa sampung araw	","Php 1500	","C"));
        items.add(new Item("Sa ilalim ng basic speed law, hindi ka maaaring magpatakbo ng mas matulin kaysa sa:	","nakapaskil na speed limit	","tulin na hindi ligtas	","`	","B"));
        items.add(new Item("Kung ang drayber ng sasakyang nasa iyong unahan ay naglabas ng kanyang kaliwang kamay at itinuro ito sa lupa, siya ay:	","hihinto	","kakanan	","kakaliwa	","A"));
        items.add(new Item("Ang paggamit ng huwad na lisensya ay ipinagbabawal at may parusang:	","Php 1,500 at slide_in_left na buwan na hindi makakakuha ng lisensya	","Pagkakabilanggo ng hindi hihigit sa slide_in_left na buwan	","Php 100	","A"));
        items.add(new Item("Ang pagalit at aroganteng pakikitungo sa pasahero o otoridad ng drayber o kundoktor ng PUV ay may parusa na:	","multa na Php 500 at suspensyon ng lisensya	","pagkakulong ng slide_in_left na buwan	","suspension ng lisensya sa loob ng isang buwan	","A"));
        items.add(new Item("Kung ikaw ay naglalakbay sa kalsada na may dalawang lane at nakita mo na ang tiyansa ng peligro ay pareho sa magkabilang lane, ikaw at dapat na:	","iposisyon ang sasakyan ng bahagya sa kanan	","iposisyon ang sasakyan ng bahagya sa kaliwa	","iposisyon ang sasakyan sa gitna	","C"));
        items.add(new Item("Sa paglipat-lipat ng linya, dapat sumenyas, tignan ang “rear view mirror” at:	","tignan kung may parating na sasakyan	","bumusina	","sindihan ang headlight	","A"));
        items.add(new Item("Ang paggamit ng tampered na metro ng taxi ay may parusa na:	","Multa na Php 3,000 at suspensyon ng lisensya	","-	","pagbawi ng lisensya	","A"));
        items.add(new Item("Ano ang dapat mong gawin kung may ambulansya sa likod mo na may pulang ilaw at sirena?	","Huminto kaagad	","Panatilihin ang iyong bilis — makakahanap ng paraan ang ambulansya para maunahan ka	","Lumipat sa pinaka kanan ng kalsada at bumagal o huminto kung kailangan	","C"));
        items.add(new Item("Ang mga speed limit sa mga kalsada ay dapat isipin na:	","inirerekomenda ng tulin sa pinakamainam na kondisyon	","inirerekomenda ng tulin sa pinakamasama na kondisyon	","inirerekomenda ng tulin sa kahit anong kondisyon	","A"));
        items.add(new Item("Ang mga PUV (Public Utility Vehicle) ay may plaka na kulay:	","dilaw at itim na mga letra at numero	","puti at berde na mga letra at numero	","puti at pula na mga letra at numero	","A"));

        System.out.println(items.toString());
        Log.d("errMessage","Heree");
        return items;

    }
}
