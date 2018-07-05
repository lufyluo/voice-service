package com.voice.service.elasticsearch;

import org.elasticsearch.action.admin.cluster.node.info.NodeInfo;
import org.elasticsearch.action.admin.cluster.node.info.NodesInfoRequest;
import org.elasticsearch.action.admin.cluster.node.info.NodesInfoResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

public class ConnectTest {

    Client client ;

    public ConnectTest(){
        client =getClient();
    }
    @Test
    public  void connectTransClientTest() {

        //通过transport方式连接哦，否则没有意义了


        try{


            NodesInfoResponse response = client.admin().cluster()

                    //超时时间设置为半分钟

                    .nodesInfo(new NodesInfoRequest()).actionGet();

            Map<String,NodeInfo> nodesMap = response.getNodesMap();

            //打印节点信息

            for(Map.Entry<String, NodeInfo> entry : nodesMap.entrySet()){

                System.out.println(entry.getKey() + ":" + entry.getValue().getSettings().get("cluster.name"));

            }

        }

        catch(Exception e){

            e.printStackTrace();

            System.out.println("无法连接到Elasticsearch");

        }

    }

    public Client getClient(){
        Settings settings = Settings.builder()
                .put("client.transport.sniff", true)
                .put("cluster.name", "elasticsearch").build();

// on shutdown

        try {
            TransportClient client = new PreBuiltTransportClient(settings);
             return client.addTransportAddress(
                            new InetSocketTransportAddress(InetAddress.getByName("192.168.194.129"), 9300));


                    //client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("192.168.194.129"), 9300));//192.168.194.129
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

}
