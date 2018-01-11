package com.upscale.exchange.service;

import com.upscale.exchange.config.ApplicationProperties;
import com.upscale.exchange.config.BlockchainConfig;
import io.github.jhipster.config.JHipsterConstants;
import multichain.command.MultichainException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.mock.env.MockEnvironment;
import org.springframework.mock.web.MockServletContext;
import static org.assertj.core.api.Assertions.assertThat;

import javax.servlet.ServletException;

public class BlockchainTest {


    private BlockchainConfig blockchain;

    private MockServletContext mockServletContext;

    private MockEnvironment mockEnvironment;

    private ApplicationProperties.Blockchain applicationProperties;



    @Before
    public void setup(){

        mockServletContext = Mockito.spy(new MockServletContext());
        mockEnvironment = new MockEnvironment();

        blockchain = new BlockchainConfig(applicationProperties);
    }


    @Test
    public void testConnectionWithBlockchain() throws ServletException, MultichainException {

        mockEnvironment.setActiveProfiles(JHipsterConstants.SPRING_PROFILE_DEVELOPMENT);
        String result = blockchain.blockchainCommand(applicationProperties).getChainCommand().getInfo();
        assertThat(result).isNotNull();
    }

}
