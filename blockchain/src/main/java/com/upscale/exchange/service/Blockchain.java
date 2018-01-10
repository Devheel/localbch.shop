package com.upscale.exchange.service;

import com.upscale.exchange.config.ApplicationProperties;
import multichain.command.MultiChainCommand;
import multichain.object.MultiChainInfo;




public class Blockchain  {


    private ApplicationProperties applicationProperties;


    public final MultiChainCommand blockchainCommand() {
        return blockchainCommand(applicationProperties);
    }

     protected final MultiChainCommand blockchainCommand(final ApplicationProperties applicationProperties){

        MultiChainCommand blockchainCommand = new MultiChainCommand(applicationProperties.getBlockchainParams().getHost(),
            applicationProperties.getBlockchainParams().getPort(),applicationProperties.getBlockchainParams().getUsername(),
            applicationProperties.getBlockchainParams().getPassword());

        return blockchainCommand;

    }







}
