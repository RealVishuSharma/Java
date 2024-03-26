package com.StringsAndStringBuilder;

public class StringBuilderInJava {
    public static void main(String[] args) {
        StringBuilder build = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char letter = (char)('a' + i);
            build.append(letter);
        }

        System.out.println(build);
    }
}

// The difference between String and StringBuilder is that,  StringBuilder is mutable while strings are not.
// So, if we want to add anything to the StringBuilder it adds the value to the same object, unlike Strings,  where
// new object is created everytime something is added to it.
