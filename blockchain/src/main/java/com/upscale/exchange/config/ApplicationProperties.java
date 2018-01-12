package com.upscale.exchange.config;

import io.github.jhipster.config.JHipsterProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Blockchain.
 * <p>
 * Properties are configured in the application.yml file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {


    private final ApplicationProperties.Blockchain  blockchain = new ApplicationProperties.Blockchain();


    public ApplicationProperties() {

    }
    
    public ApplicationProperties.Blockchain getBlockchain(){
        return this.blockchain;
    }
    public static class Blockchain {

        public Blockchain(){

        }
        //Port of the multichain
        private String port;

        //host of the multichain

        private String host;

        //username of the multichain rpc

        private String username;

        //password for the multichain

        private String password;


        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


    }
}
