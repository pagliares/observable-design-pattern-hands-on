package org.example.observable;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String name;
    private String news;
    private List<CommunicationChannel> communicationChannels = new ArrayList<>();

    public NewsAgency(String name, String news){
        this.name = name;
        this.news = news;
    }

    public void addObserver(CommunicationChannel communicationChannel){
        this.communicationChannels.add(communicationChannel);
    }

    public void setNews(String news){
        this.news = news;
        for (CommunicationChannel communicationChannel: communicationChannels){
            communicationChannel.update(this.news);
        }
    }
}
