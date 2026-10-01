class Solution {
    Map<Character, String> keypad = new HashMap<>();

    List<String> gg = new ArrayList<>();

    public void combo(StringBuilder str, String digits, int idx) {
        if (idx == digits.length()) {
            gg.add(str.toString());
            return;
        }

        String strr = keypad.get(digits.charAt(idx));
        for (char a = 0; a < strr.length(); a++) {
            str.append(strr.charAt(a));
            combo(str, digits, idx + 1);
            str.setLength(str.length() - 1);
        }

    }

    public List<String> letterCombinations(String digits) {
        StringBuilder str = new StringBuilder();
        keypad.put('2', "abc");
        keypad.put('3', "def");
        keypad.put('4', "ghi");
        keypad.put('5', "jkl");
        keypad.put('6', "mno");
        keypad.put('7', "pqrs");
        keypad.put('8', "tuv");
        keypad.put('9', "wxyz");
        combo(str, digits, 0);
        return gg;
    }
}