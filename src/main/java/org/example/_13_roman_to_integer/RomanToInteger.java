package org.example._13_roman_to_integer;

public class RomanToInteger {

    public int romanToInt(String s) {
        char[] ch = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < ch.length; i++) {
            switch (ch[i]) {
                case 'I':
                    if (i < ch.length - 1) {
                        if (ch[i + 1] == 'V') {
                            sum += 4;
                            i++;
                        } else if (ch[i + 1] == 'X') {
                            sum += 9;
                            i++;
                        } else {
                            sum += 1;
                        }
                    } else {
                        sum += 1;
                    }
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if (i < ch.length - 1) {
                        if (ch[i + 1] == 'L') {
                            sum += 40;
                            i++;
                        } else if (ch[i + 1] == 'C') {
                            sum += 90;
                            i++;
                        } else {
                            sum += 10;
                        }
                    } else {
                        sum += 10;
                    }
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if (i < ch.length - 1) {
                        if (ch[i + 1] == 'D') {
                            sum += 400;
                            i++;
                        } else if (ch[i + 1] == 'M') {
                            sum += 900;
                            i++;
                        } else {
                            sum += 100;
                        }
                    } else {
                        sum += 100;
                    }
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }
        return sum;
    }
}
