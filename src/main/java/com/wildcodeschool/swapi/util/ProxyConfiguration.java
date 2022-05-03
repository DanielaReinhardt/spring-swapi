package com.wildcodeschool.swapi.util;

import org.springframework.http.client.reactive.ReactorClientHttpConnector;

import reactor.netty.http.client.HttpClient;
import reactor.netty.transport.ProxyProvider.Proxy;

public class ProxyConfiguration {
    private static HttpClient proxiedHttpClient;
    private static ReactorClientHttpConnector proxiedConnector;

    public static HttpClient getProxiedHttpClient() {
        if (proxiedHttpClient == null) {
            proxiedHttpClient = HttpClient.create().proxy(proxy -> proxy
                    .type(Proxy.HTTP)
                    .host("he112113.emea1.cds.t-internal.com")
                    .port(8080)).noSSL();
        }
        return proxiedHttpClient;
    }

    public static ReactorClientHttpConnector getProxiedConnector() {
        if (proxiedConnector == null) {
            proxiedConnector = new ReactorClientHttpConnector(getProxiedHttpClient());
        }
        return proxiedConnector;
    }
}
