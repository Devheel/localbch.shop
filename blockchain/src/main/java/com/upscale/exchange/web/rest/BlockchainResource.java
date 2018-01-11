package com.upscale.exchange.web.rest;


/*
Rest controller for Blockchain based calls
 */

import com.codahale.metrics.annotation.Timed;
import com.upscale.exchange.config.BlockchainConfig;
import multichain.command.MultichainException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blockchain")
public class BlockchainResource {


//    @GetMapping("/getinfo")
//    @Timed
//    public String   getInfo() throws MultichainException{
//        BlockchainConfig blockchain;
//
////
////        blockchain = new BlockchainConfig();
////
////        String result = null;
////
////        result =  blockchain.blockchainCommand().getChainCommand().getInfo();
////
////        return result;
////    }
//
//}

}
