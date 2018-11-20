package com.company;
import java.util.Scanner;

public class ChatbotRunner {
    Chatbot = new Chatbot();

    Scanner in = new Scanner (System.in);
    System.out.println("Welcome to Lorraine the chatbot, nice to meet you.");

    while (!statement.equals("Bye"))
    {
        chatbot.chatLoop(statement);
        statement = in.nextLine();
    }
}
