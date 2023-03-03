package org.example.observable;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency("CNN", "No news");
        CommunicationChannel communicationChannel = new NewsCommunicationChannel();

        newsAgency.addObserver(communicationChannel);

        newsAgency.setNews("Monitoring forest reforestation in Brazil.");
    }
}
