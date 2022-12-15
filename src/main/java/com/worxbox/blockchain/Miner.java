package com.worxbox.blockchain;

public class Miner {
    private double reward;

    public void mine(BlockChain blockChain, Block block) {
        while (!goldenHash(block)) {
            block.incrementNonce();
            block.generateHash();
        }
        blockChain.addBlock(block);
        reward += Constants.REWARD;
    }

    private boolean goldenHash(Block block) {
        String leadingZeros = new String(new char[Constants.DIFFICULTY]).replace('\0', '0');
        return block.getHash().substring(0, Constants.DIFFICULTY).equals(leadingZeros);
    }

    public double getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }
}
