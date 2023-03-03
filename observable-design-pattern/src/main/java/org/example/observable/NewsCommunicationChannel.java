package org.example.observable;

public class NewsCommunicationChannel  implements CommunicationChannel{
    @Override
    public void update(String news) {
        System.out.println("Breaking news..: " + news);
    }
}
