class Solution {
    List<String> gg = new ArrayList<>();

    public void recurse(StringBuilder str, int top, int a, int last, boolean reversed) {
        // In the reversed pass the roles of '(' and ')' are swapped
        char open = reversed ? ')' : '(';
        char close = reversed ? '(' : ')';

        for (; a < str.length(); a++) {
            char c = str.charAt(a);

            if (c == open) top++;
            else if (c == close) top--;

            // Invalid close found: remove one close in [last, a]
            if (top < 0) {
                for (int b = last; b <= a; b++) {

                    // Remove only the first close in a run of equal closes
                    if (str.charAt(b) == close && (b == last || str.charAt(b - 1) != close)) {

                        str.deleteCharAt(b);

                        // Count is back to 0; resume at a (the old a+1 char)
                        recurse(str, 0, a, b, reversed);

                        // Restore
                        str.insert(b, close);
                    }
                }
                return;
            }
        }

        // Scan finished with no extra close in this direction
        StringBuilder rev = new StringBuilder(str).reverse(); // copy, not in-place

        if (!reversed) {
            recurse(rev, 0, 0, 0, true);   // now fix extra '('
        } else {
            gg.add(rev.toString());        // reversed back to original order
        }
    }

    public List<String> removeInvalidParentheses(String s) {
        recurse(new StringBuilder(s), 0, 0, 0, false);
        return gg;
    }
}