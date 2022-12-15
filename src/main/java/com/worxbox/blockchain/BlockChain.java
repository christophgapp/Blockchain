package com.worxbox.blockchain;

import java.util.LinkedList;
import java.util.List;

public class BlockChain {
    private final List<Block> blockChain;

    public BlockChain() {
        this.blockChain = new LinkedList<>();
    }

    public Block getLastBlock() {
        return blockChain.get(blockChain.size() - 1);
    }

    public void addBlock(Block block) {
        this.blockChain.add(block);
    }

    public List<Block> getBlockChain() {
        return this.blockChain;
    }

    public int getSize() {
        return this.blockChain.size();
    }

    @Override
    public String toString() {
        var s = blockChain.stream().map(Block::toString).toString();
        return s;
    }
}
