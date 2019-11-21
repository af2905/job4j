package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int wordIndex = word.length - 1;

        for (int postIndex = post.length - 1; postIndex >= 0; postIndex--) {
            if (!(post[postIndex] == word[wordIndex])) {
                result = false;
                break;
            }
            wordIndex--;
        }
        return result;
    }
}
