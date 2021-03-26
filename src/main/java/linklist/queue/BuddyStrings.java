package linklist.queue;

/**
 * Description: LeetCode 859 亲密字符串
 * Created by ldc on 2021/3/15 上午12:25.
 *
 * @author ldc
 */
public class BuddyStrings {

    public boolean buddyStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        if (a.equals(b)) {
            return hasRepeat(a);
        }
        int first = -1, second = -1;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false;
                }

            }
        }

        return second != -1 && a.charAt(first) == b.charAt(second) && a.charAt(second) == b.charAt(first);

    }

    private boolean hasRepeat(String a) {
        int[] cnt = new int[26];
        for (int i = 0; i < a.length(); i++) {
            cnt[a.charAt(i) - 'a']++;
            if (cnt[a.charAt(i)-'a'] > 1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BuddyStrings bs = new BuddyStrings();
//        System.out.println(bs.buddyStrings("aaaaaaabc",  "aaaaaaacb"));
//        System.out.println(bs.buddyStrings("ab",  "ab"));
        System.out.println(bs.buddyStrings("abcd",  "bacd"));
    }
}
