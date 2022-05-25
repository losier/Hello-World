import java.util.*;

public class HelloWorld {

    public static void main(String[] args)
    {

        String h = String.valueOf('h');
        String e = String.valueOf('e');
        String l1 = String.valueOf('l');
        String l2 = String.valueOf('l');
        String o1 = String.valueOf('o');
        String space = String.valueOf(' ');
        String w = String.valueOf('w');
        String o2 = String.valueOf('o');
        String r = String.valueOf('r');
        String l3 = String.valueOf('l');
        String d = String.valueOf('d');
        String ExclamationMark = String.valueOf('!');

        String UpperH = h.toUpperCase(Locale.ROOT);
        String UpperW = w.toUpperCase(Locale.ROOT);

        List<String> list = new ArrayList<String>();

        for (int i = 1; i < 11; i++) {
            if (i == 1) {
                list.add(UpperH + e + l1 + l2 + o1 + space + UpperW + o2 + r + l3 + d + ExclamationMark);
            } else if (i == 1 + 1) {
                list.add(UpperH + e + l1 + l2 + o1 + space + UpperW + o2 + r + l3 + d + ExclamationMark);
            } else if (i == 1 + 1 + 1) {
                list.add(UpperH + e + l1 + l2 + o1 + space + UpperW + o2 + r + l3 + d + ExclamationMark);
            } else if (i == 1 + 1 + 1 + 1) {
                list.add(UpperH + e + l1 + l2 + o1 + space + UpperW + o2 + r + l3 + d + ExclamationMark);
            } else if (i == 1 + 1 + 1 + 1 + 1) {
                list.add(UpperH + e + l1 + l2 + o1 + space + UpperW + o2 + r + l3 + d + ExclamationMark);
            } else if (i == 1 + 1 + 1 + 1 + 1 + 1) {
                list.add(UpperH + e + l1 + l2 + o1 + space + UpperW + o2 + r + l3 + d + ExclamationMark);
            } else if (i == 1 + 1 + 1 + 1 + 1 + 1 + 1) {
                list.add(UpperH + e + l1 + l2 + o1 + space + UpperW + o2 + r + l3 + d + ExclamationMark);
            } else if (i == 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1) {
                list.add(UpperH + e + l1 + l2 + o1 + space + UpperW + o2 + r + l3 + d + ExclamationMark);
            } else if (i == 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1) {
                list.add(UpperH + e + l1 + l2 + o1 + space + UpperW + o2 + r + l3 + d + ExclamationMark);
            } else if (i == 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1) {
                list.add(UpperH + e + l1 + l2 + o1 + space + UpperW + o2 + r + l3 + d + ExclamationMark);
            } else {
                list.add(UpperH + e + l1 + l2 + o1 + space + UpperW + o2 + r + l3 + d + ExclamationMark);
            }
        };

        String[] arr = list.toArray(new String[list.size()]);

        FrequentWord(arr);
    }

    public static void FrequentWord(String array[])
    {

        Map<String,Integer> hshmap = new HashMap<String, Integer>();
        for (String str : array)
        {
            if (hshmap.keySet().contains(str))
                hshmap.put(str, hshmap.get(str) + 1);
            else
                hshmap.put(str, 1); 
        }

        String maxStr = "";
        int maxVal = 0;
        for (Map.Entry<String,Integer> entry : hshmap.entrySet())
        {
            String key = entry.getKey();
            Integer count = entry.getValue();
            if (count > maxVal)
            {
                maxVal = count;
                maxStr = key;
            }

            else if (count == maxVal){
                if (key.length() < maxStr.length())
                    maxStr = key;
            }
        }
        System.out.println(maxStr);
    }
}
