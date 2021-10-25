package com.ss.fs.basics.three;

import java.io.File;
import java.util.ArrayList;

public class NodeCrawler {
    private ArrayList<String> nodes = new ArrayList<>();

    public NodeCrawler() {}

    void setNodesFound(String node) {
        this.nodes.add(node);
    }

    void setPath(StringBuilder path) {
        crawl(path);
    }

    void printNodes() {
        System.out.println(nodes);
    }

    void crawl(StringBuilder path) {
        try {
            File[] directory = new File(path.toString()).listFiles();
            for(File file : directory) {
                setNodesFound(file.toString());
                if(!file.isFile()) {
                    path.delete(0,path.length());
                    path.append(file.toString());
                    crawl(path);
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }
}
