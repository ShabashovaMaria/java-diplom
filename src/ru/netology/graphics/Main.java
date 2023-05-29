package ru.netology.graphics.image;

import ru.netology.server.GServer;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new Converter();

        GServer server = new GServer(converter);
        server.start();


    }
}
