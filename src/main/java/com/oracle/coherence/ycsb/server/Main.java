package com.oracle.coherence.ycsb.server;

import io.helidon.microprofile.server.Server;

import com.tangosol.net.DefaultCacheServer;

import java.io.IOException;

public final class Main
    {

    private Main()
        {
        }

    public static void main(final String[] args) throws IOException
        {
        DefaultCacheServer.startServerDaemon().waitForServiceStart();
        Server server = startServer();
        System.out.println("http://localhost:" + server.port() + "/greet");
        }

    static Server startServer()
        {
        return Server.create().start();
        }
    }
