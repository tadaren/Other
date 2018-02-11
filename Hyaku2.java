import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Hyaku2{
	public static void main(String[] args){
		String[][] word = {
			{"白露に風の吹きしく秋の野は", "つらぬきとめぬ玉ぞ散りける"},
			{"忘らるる身をば思はずちかひてし", "人のいのちの惜しくもあるかな"},
			{"浅茅生の小野の篠原しのぶれど", "あまりてなどか人の恋しき"},
			{"しのぶれど色にいでにけりわが恋は", "物や思ふと人のとふまで"},
			{"恋すてふわが名はまだき立ちにけり", "人しれずこそ思ひそめしか"},
			{"ちぎりきなかたみに袖をしぼりつつ", "末の松山波こさじとは"},
			{"あひみてののちの心にくらぶれば", "昔は物を思はざりけり"},
			{"あふことのたえてしなくはなかなかに", "人をも身をも恨みざらまし"},
			{"あはれともいふべき人は思ほえで", "身のいたづらになりぬべきかな"},
			{"由良のとをわたる舟人かぢを絶え", "ゆくへも知らぬこひの道かな"},
			{"八重むぐらしげれる宿のさびしきに", "人こそ見えぬ秋は来にけり"},
			{"風をいたみ岩うつ波のおのれのみ", "くだけて物を思ふころかな"},
			{"みかきもり衛士のたく火の夜は燃え", "昼は消えつつ物をこそ思へ"},
			{"君がため惜しからざりし命さへ", "長くもがなと思ひけるかな"},
		};

		ArrayList<Integer> kaminoku_list = new ArrayList<>();  // indexes
		ArrayList<Integer> simonoku_list = new ArrayList<>();
		for (int i = 0; i < word.length; i++) {
			kaminoku_list.add(i);
			simonoku_list.add(i);
		}
		Scanner stdIn = new Scanner(System.in);

		while(true){
			Collections.shuffle(kaminoku_list);
			Collections.shuffle(simonoku_list);


			for (int kaminoku : kaminoku_list) {
				int i = 0;
				for (int simonoku : simonoku_list) {
					System.out.printf("%2d %s\n", i, word[simonoku][1]);
					i++;
				}
				System.out.println(word[kaminoku][0]);

				int input = stdIn.nextInt();
				if (kaminoku == simonoku_list.get(input)) {
					System.out.println("正解");
				}
				else {
					System.out.println("不正解");
				}
				System.out.println(word[kaminoku][0]+" "+word[kaminoku][1]+"\n");
			}
			System.out.println("LOOP");
		}
	}
}
