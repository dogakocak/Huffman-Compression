package com.company;

public class Main {

    public static void main(String[] args) {
        Huffman huffman = new Huffman("aaaaaaabbbbbbbccccdd");

        String encodedText = huffman.encode();
        System.out.println(encodedText);

        String originalText = huffman.decode(encodedText);
        System.out.println(originalText);
        huffman.printCodes();
    }
}
