package com.upscale.exchange.config;

import com.upscale.exchange.config.ApplicationProperties;
import multichain.command.MultiChainCommand;
import multichain.object.MultiChainInfo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;




public class BlockchainConfig  {

    private final org.slf4j.Logger log = LoggerFactory.getLogger(BlockchainConfig.class);

    @Autowired
    private final ApplicationProperties.Blockchain applicationProperties;


    public  BlockchainConfig(ApplicationProperties.Blockchain applicationProperties){
        this.applicationProperties = applicationProperties;
    }


    @Bean
     public  MultiChainCommand blockchainCommand(ApplicationProperties.Blockchain applicationProperties){
        log.debug("Configuring Blockchain");

        MultiChainCommand blockchainCommand = new MultiChainCommand(applicationProperties.getHost(),
            applicationProperties.getPort(),applicationProperties.getUsername(),
            applicationProperties.getPassword());

        return blockchainCommand;

    }



}
