import java.util.HashMap;
import java.util.Map;

public class Program {
    static void characterCount(String inputString)
    {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "Якщо ви гарячої літньої днини, коли й вітерець не шелесне, стомитесь у дорозі та присядете десь на горбку відпочити, то відразу вдихнете гіркувато-приємний освіжаючий дух деревію, що тут таки довкруж розсипав свої білі щитоподібні суцвіття на високих і міцних внизу брунатних стеблах. Коли ж помнете в долонях один такий щиток або потрете візерунчаті листки і глибоко вдихнете бальзамовий запах, то відчуєте, як стало вам легко, приємно, як прибувають сили. Ось ви вже й готові бадьоріше продовжувати свою путь. Ця багаторічна трав'яниста рослина надзвичайно поширена по всій Україні. Деревій можна знайти практично скрізь: у лісах і чагарниках, на галявинах і узліссях, на вкритих травою степових схилах і на високих берегах річок, у низинах і байраках, попід парканами і вздовж доріг, у лісосмугах і на сухих луках.";
        characterCount(str);
    }
}


