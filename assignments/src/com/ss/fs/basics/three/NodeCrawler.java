package com.ss.fs.basics.three;

import java.io.File;
import java.util.ArrayList;

public class NodeCrawler {
    private ArrayList<String> nodes = new ArrayList<>();

    public NodeCrawler() {}

    void setNodesFound(String node) {
        this.nodes.add(node);
    }

    void setPath(String path) {
        crawl(path);
    }

    void printNodes() {
        System.out.println(nodes);
    }

    void crawl(String path) {
        try {
            File[] directory = new File(path).listFiles();
            for(File file : directory) {
                setNodesFound(file.toString());
                if(!file.isFile()) {
                    crawl(file.toString());
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }
}
