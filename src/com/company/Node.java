package com.company;

import lombok.Getter;

import lombok.RequiredArgsConstructor;
@Getter
@RequiredArgsConstructor
public class Node implements Comparable<Node>{
    private final int frequency;
    private Node leftNode;
    private Node rightNode;

    public Node(Node leftNode, Node rightNode){
        this.frequency = leftNode.getFrequency() + rightNode.getFrequency();
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(frequency, o.getFrequency());
    }
}
