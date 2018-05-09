/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diep.Tran
 */
public class Server {
    String ip;
    String port;
    List<Client> clientList = new ArrayList<>();
    
    public Server() {
    }
    
    public void initClient() {
        Client client = new Client("192.168.1.22", "10235", "12313123123123");
        clientList.add(client);
    }

    public Server(String ip, String port) {
        this.ip = ip;
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
    
    //innser class
    class Client {
        String ip;
        String port;
        String session;

        public Client() {
        }

        public Client(String ip, String port, String session) {
            this.ip = ip;
            this.port = port;
            this.session = session;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

        public String getSession() {
            return session;
        }

        public void setSession(String session) {
            this.session = session;
        }
    }
}
