package com.dataStructrue;

public class Solution {
    public boolean isUnique(String astr) {
        int mark = 0;
        for (int i = 0; i < astr.length(); ++i) {
            int moveBit = 1 << (astr.charAt(i) - 'a');
            if ((mark & moveBit) == 0)
                mark |= moveBit;
            else
                return false;
        }
        return true;
    }
}
