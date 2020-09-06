package com.dataStructrue;

public class Main {

    public static void main(String[] args) {
////        Say hello
//        System.out.println("hello world!");
//
////        hanoi
//        HanoiTower hanoiTower = new HanoiTower();
//        hanoiTower.buildTower(5, "A", "C", "B");
//
////        count binary One
//        CountOne countOne=new CountOne();
//        countOne.getResult(7);
//
////        permute
//        PermuteFunction permuteFunction=new PermuteFunction();
//        permuteFunction.permute("abcd");

//        node length
//        Node[] nodeList = new Node[10];
//        for (int i = 0; i < 10; ++i) {
//            nodeList[i] = new Node();
//        }
//        for (int i = 0; i < 9; ++i) {
//            nodeList[i].next = nodeList[i + 1];
//        }
//        System.out.println(nodeList[0].getLength());

//        palindrome
//        Palindrome palindrome = new Palindrome();
//        System.out.println(palindrome.isPalindromeWord("abasba"));
//        System.out.println(palindrome.isPalindromeWord("abaaba"));
//        System.out.println(palindrome.isPalindromeSentence("aba, sba"));
//        System.out.println(palindrome.isPalindromeSentence("aba, ba!"));

//        找排列数
        int[] arr = {1, 2, 3, 4, 5};
        PermuteNumber permuteNumber = new PermuteNumber();
        permuteNumber.permute(arr, 3);
    }
}
