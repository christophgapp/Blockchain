package com.worxbox.blockchain;

import org.junit.jupiter.api.Test;

class BlockChainTest {
    @Test
    public void mine() {
        var blockChain = new BlockChain();
        var miner = new Miner();
        var block0 = new Block(0, "", Constants.GENESIS_PREV_HASH);
        miner.mine(blockChain, block0);

        for (int i = 0; i < 10; i++) {
            var last = blockChain.getLastBlock();
            var id = last.getId() + 1;
            var block = new Block(id, "transaction " + id, last.getPreviousHash());
            miner.mine(blockChain, block);
        }
    }
}